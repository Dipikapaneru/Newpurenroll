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
import filereader.ConfigFileReader;
import pages.EnterVerificationCodePage;
import pages.LoginPage;
import pages.SaveBrowserPage;
import pages.SendVerificationCodePage;
 
public class Invoice_Status_Verification {
	/*
	WebDriver driver;
	Connection con ;
	Statement stmt;
	ConfigFileReader configuration;
	
	 
	
	@Before
	public void setVariable() throws ClassNotFoundException, SQLException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\14193\\git\\Newpurenroll\\src\\main\\java\\drivers\\chromedriver.exe");
		 configuration = new ConfigFileReader();
		System.out.println("THIS VALUE IS RETERIVED FROM FILE: "+configuration.getBrowser());
		System.out.println("THIS VALUE IS RETERIVED FROM FILE: "+configuration.getUrl());
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
	
		
		
		
		
		
		
		 
		@Given("^a user with valid admin role sign in into Corenroll Admin$")
		public void a_user_with_valid_admin_role_sign_in_into_Corenroll_Admin() throws Throwable{
			 a_user_is_on_purenroll_login_page();
			 a_user_enter_valid_and("hellofromcts@gmail.com", "Cts@2020");
			 a_user_selects_for_OTP_option("email");
			 a_user_verify_of_the_web_page("ENTER VERIFICATION CODE");
			 a_user_enters_verification_code_for("hellofromcts@gmail.com" );
			 a_user_select_for_SB_option("no");
		}

		
		*/
}


