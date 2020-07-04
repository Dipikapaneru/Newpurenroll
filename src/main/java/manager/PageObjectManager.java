package manager;

import org.openqa.selenium.WebDriver;

import hooks.NavigationHelper;
import pages.EnterVerificationCodePage;
import pages.LoginPage;
import pages.MyDashboardPage;
import pages.SaveBrowserPage;
import pages.SendVerificationCodePage;

public class PageObjectManager {
	private WebDriver driver;
	private LoginPage loginPage;
	private SendVerificationCodePage sendVerificationCodePage;
	private EnterVerificationCodePage enterVerificationCodePage;
	private SaveBrowserPage saveBrowserPage;
	private MyDashboardPage myDashboardPage;
	private NavigationHelper navigationHelper;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public NavigationHelper getNavigationHelper() {
		return (navigationHelper == null) ? navigationHelper = new NavigationHelper(driver) : navigationHelper;
	}
	
	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
	}
	
	public SendVerificationCodePage getSendVerificationCodePage() {
		return (sendVerificationCodePage == null) ? sendVerificationCodePage = new SendVerificationCodePage(driver) : sendVerificationCodePage;
		
	}
	
	public EnterVerificationCodePage getEnteVerificationCodePage() {
		return (enterVerificationCodePage == null) ? enterVerificationCodePage = new EnterVerificationCodePage(driver) : enterVerificationCodePage;
	}
	
	public SaveBrowserPage getSaveBrowserPage() {
		return (saveBrowserPage == null) ? saveBrowserPage = new SaveBrowserPage(driver) : saveBrowserPage;
	}
	
	public MyDashboardPage getMyDashboardPage() {
		return (myDashboardPage == null) ? myDashboardPage = new MyDashboardPage(driver) : myDashboardPage;
		
	}
 
	
}
