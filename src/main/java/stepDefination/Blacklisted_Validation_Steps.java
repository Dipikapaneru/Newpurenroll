package stepDefination;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BlacklistedValidationPage;

public class Blacklisted_Validation_Steps{
	TestContext testContext;
	BlacklistedValidationPage blacklistedvalidationPage;
	WebDriver driver;
	public Blacklisted_Validation_Steps (TestContext context) {
		testContext = context;
		blacklistedvalidationPage = testContext.getPageObjectManager().getBlacklistedValidationPage(); 
			
		}
	
	@When("^a user landed on manageClient page$")
	public void a_user_landed_no_manageClient_page() throws InterruptedException {
		blacklistedvalidationPage.manageclient();
	}
	@Then("^a user search an agent with valid ([^\\\"]*)$")
	public void a_user_search_an_agent_with_valid_id(String id) throws InterruptedException {
		blacklistedvalidationPage.agentid(id);
			
	}
	 @Then("^a user click on view invoice image$")
	 public void a_user_click_on_view_invoice_image() throws InterruptedException {
		 blacklistedvalidationPage.invoiceimage();
	 }
	
	
	
	}

