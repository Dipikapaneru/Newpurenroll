package pages;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver args) {
		driver=args;
	}
	By usernameField= By.xpath("//input[@placeholder='Enter Username']");
	By passwordField= By.xpath("//input[@placeholder='Enter password']");
	By loginButton = By.cssSelector(".ce-btn-login-submit");
	
	public void logindetail(String username, String password, Connection con, Statement stmt) throws InterruptedException, SQLException {
		driver.findElement(usernameField).sendKeys(username);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(loginButton).click();
		
		
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

}
