package StepDefination;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Details.Invoice_verification_details;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Invoice_Status_Verification {
	WebDriver driver;
	Connection con ;
	Statement stmt;
	//Invoice_verification_details InvoiceDetail;
	@Before
	public void setVariable() throws ClassNotFoundException, SQLException {
		System.setProperty("webdriver.chrome.driver", "src/main/java/Driver/chromedriver-2");
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
		@Given("^a usere is on purenroll login page$")
		public void a_usere_is_on_purenroll_login_page() throws Throwable {
			driver.get("http://qa-www.purenroll.com/home");
		 	 driver.manage().window().maximize();
		 	 
		 	if(con != null) {
				System.out.println("Database connected "+con);
				ResultSet rs = stmt.executeQuery("SELECT verification_code FROM sso_users WHERE email =  'hellofromcts@gmail.com';");
				System.out.println("Results: "+rs);
				
				System.out.println("Records: "+rs.getRow());
				while (rs.next()){
	        		String verificationcode = rs.getString(1);								        
	                System. out.println("Code: "+verificationcode);		
				}
		 	}
		}
		@Then("^a user enter \"([^\"]*)\" and \"([^\"]*)\"$")
		public void a_user_enter_and(String username, String password) throws Throwable {
			 
			driver.findElement(By.className("form-control")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[2]/div/form/div[1]/div[2]/div/input")).sendKeys(password);
		}
		@Then("^a user click on submit button$")
		public void a_user_click_on_submit_button() throws Throwable {
			 
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[2]/div/form/div[2]/button")).click();
		}
		@Then("^a usre press submit button$")
		public void a_usre_press_submit_button() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div/div[2]/button")).click();
		}
    }