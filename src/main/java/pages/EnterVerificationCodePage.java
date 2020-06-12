package pages;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 
 

public class EnterVerificationCodePage {
WebDriver driver;
public EnterVerificationCodePage (WebDriver args) {
	driver = args;
	}


By pageTitle = By.cssSelector(".ce-login-card-title");
By verificationCodeInput = By.name("code");
By submitButton = By.cssSelector(".ce-btn-login-submit");

public String verifytitle () {
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.presenceOfElementLocated(verificationCodeInput));
	return driver.findElement(pageTitle).getText();
}


	
	public void enterVerificationCode (Connection con, Statement stmt, String email) throws SQLException {
		System.out.println("EMAIL: "+email);
		String verificationcode = null;
	if(con != null) {
		System.out.println("Database connected "+con);
		ResultSet rs = stmt.executeQuery("SELECT verification_code FROM sso_users WHERE email =  '"+email+"';");
		System.out.println("Results: "+rs);
		
		System.out.println("Records: "+rs.getRow());
		while (rs.next()){
    		 verificationcode = rs.getString(1);								        
            System. out.println("Code: "+verificationcode);	
    
				}
			}
	driver.findElement(verificationCodeInput).sendKeys(verificationcode);
	driver.findElement(submitButton).click();
	
		}
	}
