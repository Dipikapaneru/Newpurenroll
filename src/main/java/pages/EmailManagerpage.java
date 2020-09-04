package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailManagerpage {
	WebDriver driver;
	public EmailManagerpage(WebDriver args) {
		driver=args;
	}
	
	By edit = By.xpath("//tr[1]//td[4]//a[2]");
	By showMore = By.xpath("//button[@class='show_button btn btn-default']");
	By textArea = By.xpath("//div[@class='content_box form-group']//p[2]");
	//By pay = By.xpath("//span[contains(text(),'Pay Button')]");
    By textDisplayed = By.xpath("//p[contains(text(),'#paybutton#')]");
    By save = By.xpath("//button[@id='template_edit_button']");

    public void EditButton() {
    	WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.presenceOfElementLocated(edit));
	    driver.findElement(edit).click();
}
	
	public void payButton(String anybutton) {
		By pay = By.xpath("//span[contains(text(),'"+anybutton+"')]");
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.presenceOfElementLocated(pay));
		driver.findElement(showMore).click();
		driver.findElement(textArea).click();
		driver.findElement(pay).click();
		
		
	}
	
	public void textValidation(String paytext) {
		WebElement element=driver.findElement(textDisplayed);
		String text = element.getText();
		System.out.println("Text is"+ text);
		if (text.contains('#'+paytext+'#'))
			{System.out.println("Expected text is obtained");
			}
			else
			{System.out.println("Expected text is not obtained");
			}

			}
	public void saveButton() {
		driver.findElement(save).click();
	}
		
	


		
	}		

