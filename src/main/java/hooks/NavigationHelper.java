package hooks;

import org.openqa.selenium.WebDriver;

public class NavigationHelper {
	WebDriver driver;
	public NavigationHelper(WebDriver args) {
		driver=args;
	}

	public void navigate_to_LoginPage() throws InterruptedException {
		
		driver.get("http://qa-www.purenroll.com");
	}
	
public void navigate_to_Page(String page) throws InterruptedException {
		switch(page) {
		case "BLACKLIST_ACCOUNT":
			driver.navigate().to("http://qa-www.purenroll.com/Blacklist");
			break;
		case "SINGLE_INVOICE":
			driver.navigate().to("http://qa-www.purenroll.com/SingleInvoice");
			break;
		case "EMAIL_TEMPLATE":
			driver.navigate().to("https://qa-www.purenroll.com/EmailTemplates");
			break;
		default:
			driver.get("http://qa-www.purenroll.com");
			break;
		}
		
	}
}
