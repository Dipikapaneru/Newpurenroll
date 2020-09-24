package stepDefination;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MyDashboardPage;

public class MyDashboardPageSteps {
	TestContext testContext;
	MyDashboardPage myDashboardPage;
	WebDriver driver;
	public MyDashboardPageSteps(TestContext context) {
		testContext = context;
		myDashboardPage = testContext.getPageObjectManager().getMyDashboardPage();
	}
	
	@When("^a user navigates to Blacklist account page$")
	public void a_user_navigates_to_Blacklist_account_page() {
		driver.navigate().to("https://qa-www.purenroll.com/BlackList");
	}

	@Then("^a user is displayed with all blacklisted accounts$")
	public void a_user_is_displayed_with_all_blacklisted_accounts(){
		
	}
}
