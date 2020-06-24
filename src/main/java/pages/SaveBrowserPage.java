package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SaveBrowserPage {
WebDriver driver;

	public SaveBrowserPage(WebDriver args) {
	driver=args;
	}
	
	
	By codeOpt = By.className("code_option");
	By submitButton = By.cssSelector(".ce-btn-login-submit");
	
 public void selectOptions(String selSaveoption) {
		List<WebElement> selectOpt = driver.findElements(codeOpt);
		for(WebElement option :selectOpt) {
			if(option.getAttribute("value").equalsIgnoreCase(selSaveoption)) {
				option.click();
			}
		}
		driver.findElement(submitButton).click();
	}
 
 	
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
