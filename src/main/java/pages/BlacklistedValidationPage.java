package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlacklistedValidationPage {
	WebDriver driver;
	public BlacklistedValidationPage(WebDriver args) {
		driver= args;
}
	
	By mainMenu = By.xpath("//i[@class='flaticon-menu']");
	By managesection = By.xpath("//span[contains(text(),'Manage')]");
	By membersection = By.xpath("//span[contains(text(),'Members')]");
	By systemid = By.xpath("//div[@class='form-group system_id popup']//input[@class='form-control']");
	By searchbutton = By.xpath("//button[@class='btn btn-success Search']");
	By invoiceicon = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[7]/a[2]/img");
	
	
	public void manageclient() throws InterruptedException{
		Thread.sleep(500);
		driver.findElement(mainMenu).click();
		driver.findElement(managesection).click();
		driver.findElement(membersection).click();
	}
	public void agentid(String id) throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(systemid).sendKeys(id);
		driver.findElement(searchbutton).click();
		
	}
	public void invoiceimage() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.presenceOfElementLocated(invoiceicon));
		driver.findElement(invoiceicon).click();
		//Thread.sleep(3000);
	
	}
}




 