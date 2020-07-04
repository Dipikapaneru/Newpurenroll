package stepDefination;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginPageSteps {
	TestContext testContext;
	LoginPage loginPage;
	
	public LoginPageSteps(TestContext context) {
		testContext = context;
		loginPage = testContext.getPageObjectManager().getLoginPage();
	}
	


	@When("^a user enter valid ([^\"]*) and ([^\"]*)$")
	public void a_user_enter_valid_and(String username, String password) throws Throwable {
		loginPage.logindetail(username, password);
	}
}
