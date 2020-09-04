package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyDashboardPage {
	WebDriver driver;
	public MyDashboardPage(WebDriver args) {
	driver= args;
	}
	
	
	By flaticonemenu = By.className("flaticon-menu");
	
	By billingSection = By.xpath("//a[@class='router-link-exact-active router-link-active vsm--link vsm--link_level-1"+ 
					" vsm--link_active vsm--link_exact-active']//span[@class='vsm--title'][contains(text(),'Billing')]");
	
	By individualInvoices = By.xpath("//span[contains(text(),'Individual Invoices')]");
	
	By emailConfigurationLink = By.xpath("//span[contains(text(),'Email Settings')]");
	
}
