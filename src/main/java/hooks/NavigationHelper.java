package hooks;

import org.openqa.selenium.WebDriver;

public class NavigationHelper {
	WebDriver driver;
	public NavigationHelper(WebDriver args) {
		driver=args;
	}

	public void navigate_to_LoginPage() throws InterruptedException {
		
		driver.get("http://qa-www.purenroll.com/home");
	}
}
