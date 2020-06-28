package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SaveBrowserPage {
WebDriver driver;

	public SaveBrowserPage(WebDriver args) {
	driver=args;
	}
	
	
	By codeOpt = By.name("code_option");
	By submitButton = By.cssSelector(".ce-btn-login-submit");
	
 public void selectOptions(String selSaveoption) {
	 WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(codeOpt));
		List<WebElement> selectOpt = driver.findElements(codeOpt);
		for(WebElement option :selectOpt) {
			System.out.println("LOOP: "+option.getAttribute("checked")+"SELECT: "+selSaveoption);
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
