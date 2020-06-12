package stepDefination;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.SendVerificationCodePage;
 
public class Invoice_Status_Verification {
	WebDriver driver;
	Connection con ;
	Statement stmt;
	 
	@Before
	public void setVariable() throws ClassNotFoundException, SQLException {
		System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver-2");
		driver= new ChromeDriver();
		System.out.println("BEFORE METHOD");
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://3.12.28.169:3306/ssoapp", "qa-user", "ssouser@123!");
		stmt = con.createStatement();
	}
	//@After
		public void closeBrowser() {
			//driver.quit();
		}
		@Given("^a user is on purenroll login page$")
		public void a_usere_is_on_purenroll_login_page() throws Throwable {
			driver.get("http://qa-www.purenroll.com/home");
		 	 driver.manage().window().maximize();
		 	
		}
		@When("^a user enter valid ([^\"]*) and ([^\"]*)$")
		public void a_user_enter_valid_and(String username, String password) throws Throwable {
			LoginPage loginPage = new LoginPage(driver);
			loginPage.logindetail(username, password, con, stmt);
		}
		
		
		
		@Then("^a user selects ([^\"]*) for OTP option$")
		public void a_user_selects_for_OTP_option(String codeOption) throws Throwable {
			SendVerificationCodePage svc = new SendVerificationCodePage(driver);
			svc.selectOtpOption(codeOption);
		}
		
		
    }


