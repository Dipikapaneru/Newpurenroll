package stepDefination;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EmailManagerpage;

public class PayButtonOnEmailManagerSteps {
	TestContext testContext;
	EmailManagerpage emailManagerpage;
	WebDriver driver;
	
	public PayButtonOnEmailManagerSteps(TestContext context) {
		testContext = context;
		emailManagerpage= testContext.getPageObjectManager().getEmailManagerpage();
		
	}

	

@When("^a user clicks on edit icon under action$")
public void a_user_clicks_on_edit_icon_under_action() throws Throwable {
	emailManagerpage.EditButton();
}


@When("^a user clicks on ([^\"]*) under keywords$")
public void a_user_clicks_on_under_keywords(String button) throws Throwable {
	emailManagerpage.payButton(button);
}

@Then("^an email body with ([^\"]*) is added$")
public void an_email_body_with_is_added(String paytext) throws Throwable {
	emailManagerpage.textValidation(paytext);
}

@Then("^a user clicks on Edit option$")
public void a_user_clicks_on_Edit_option() throws Throwable {
	emailManagerpage.saveButton();
}
 
}