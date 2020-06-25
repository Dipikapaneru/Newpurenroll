package stepDefination;

import java.sql.Connection;
import java.sql.DriverManager;
 
import java.sql.SQLException;
import java.sql.Statement;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EnterVerificationCodePage;
import pages.LoginPage;
import pages.SaveBrowserPage;
import pages.SendVerificationCodePage;
 
public class Invoice_Status_Verification {
	WebDriver driver;
	Connection con ;
	Statement stmt;
	 
	@Before
	public void setVariable() throws ClassNotFoundException, SQLException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\14193\\git\\Newpurenroll\\src\\main\\java\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		System.out.println("BEFORE METHOD");
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://3.21.123.67:3306/ssoapp", "root", "jNSd<76@");
		stmt = con.createStatement();
	}
	//@After
		public void closeBrowser() {
			//driver.quit();
		}
		@Given("^a user is on purenroll login page$")
		public void a_user_is_on_purenroll_login_page() throws Throwable {
			driver.get("http://qa-www.purenroll.com/home");
		 	 driver.manage().window().maximize();
		 	
		}
		@When("^a user enter valid ([^\"]*) and ([^\"]*)$")
		public void a_user_enter_valid_and(String username, String password) throws Throwable {
			LoginPage loginPage = new LoginPage(driver);
			loginPage.logindetail(username, password);
		}
		
		
		
		@Then("^a user selects ([^\"]*) for OTP option$")
		public void a_user_selects_for_OTP_option(String codeOption) throws Throwable {
			SendVerificationCodePage svc = new SendVerificationCodePage(driver);
			svc.selectOtpOption(codeOption);
		}
		
		@Then("^a user verify ([^\"]*) of the web page$")
		public void a_user_verify_of_the_web_page(String title) throws Throwable {
			EnterVerificationCodePage evc =new EnterVerificationCodePage(driver);
			String actualTitle = evc.verifytitle();
			Assert.assertEquals(actualTitle, title);
		}
		
		@Then("^a user enters verification code for ([^\"]*)$")
		public void a_user_enters_verification_code_for(String username) throws Throwable {
			EnterVerificationCodePage evc =new EnterVerificationCodePage(driver);
			evc.enterVerificationCode(con, stmt, username);
		}
		@And("^a user select ([^\"]*)for SB option$")
		public void a_user_select_for_SB_option(String saveOption) {
			SaveBrowserPage sb = new SaveBrowserPage(driver);
			sb.selectOptions(saveOption);
		}
		 
		@Given("^a user with valid admin role sign in into Corenroll Admin$")
		public void a_user_with_valid_admin_role_sign_in_into_Corenroll_Admin() throws Throwable{
			 a_user_is_on_purenroll_login_page();
			 a_user_enter_valid_and("hellofromcts@gmail.com", "Cts@2020");
			 a_user_selects_for_OTP_option("email");
			 a_user_verify_of_the_web_page("ENTER VERIFICATION CODE");
			 a_user_enters_verification_code_for("hellofromcts@gmail.com" );
			 a_user_select_for_SB_option("no");
		}

		@When("^a user navigates to Blacklist account page$")
		public void a_user_navigates_to_Blacklist_account_page() {
			driver.navigate().to("http://qa-www.purenroll.com/BlackList");
		}

		@Then("^a user is displayed with all blacklisted accounts$")
		public void a_user_is_displayed_with_all_blacklisted_accounts(){
		}
}


