package stepDefination;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import pages.SaveBrowserPage;

public class SaveBrowserPageSteps {
	TestContext testContext;
	SaveBrowserPage saveBrowserPage;
	
	public SaveBrowserPageSteps(TestContext context) {
		testContext = context;
		saveBrowserPage = testContext.getPageObjectManager().getSaveBrowserPage();
	}

	@And("^a user select ([^\"]*)for SB option$")
	public void a_user_select_for_SB_option(String saveOption) {
		saveBrowserPage.selectOptions(saveOption);
	}
}
