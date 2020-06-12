package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendVerificationCodePage {
	WebDriver driver;
	public SendVerificationCodePage(WebDriver args) {
		driver=args;
	}
	
	By codeOption = By.name("code_option");
	
	By submitButton = By.cssSelector(".ce-btn-login-submit");
	
	public void selectOtpOption(String selectedOption) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(codeOption));
	//	driver.findElement(submitButton).click();
	List<WebElement> codeOptions =  driver.findElements(codeOption);
			
			for(WebElement option : codeOptions) {
				if(option.getAttribute("value").equalsIgnoreCase(selectedOption)) {
					option.click();
				}
			}
	//	driver.findElement(email).click();
		driver.findElement(submitButton).click();
	}

	/*
	 public void payTo(String paytype) {
		 
		List<WebElement> payToRadios =  driver.findElements(payTo);
		
		for(WebElement payto : payToRadios) {
			if(payto.getAttribute("value").equalsIgnoreCase(paytype)) {
				payto.click();
			}
		}

		 driver.findElement(ach).click();
	 }
	 */
}
