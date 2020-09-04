package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import enums.DriverType;

public class WebDriverManager {
	private WebDriver driver;
	private static DriverType driverType;
	//private static EnvironmentType environmentType;
	private static final String CHROMEDRIVER_PROPERTY = "webdriver.chrome.driver";
	
	public WebDriverManager() {
		driverType = FileReaderManager.getInstant().getConfigReader().getBrowser();
	//	environmentType = FileReaderManager.getInstant().getConfigReader().getEnvironment();
	}
	
	public WebDriver getDriver() {
		if(driver == null) {
			return createDriver();
		}else {
			return driver;
		}
	}
	
	private WebDriver createDriver() {
		switch(driverType) {
		case CHROME:
			System.setProperty(CHROMEDRIVER_PROPERTY,FileReaderManager.getInstant().getConfigReader().getDriverPath());
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			driver = new FirefoxDriver();
			break;
		case INTERNETEXPLORER:
			driver = new InternetExplorerDriver();
			break;
		
		}
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public void quitDriver() {
		driver.close();
		driver.quit();
	}
	
	
}
