package stepDefination;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import pages.SendVerificationCodePage;

public class SendVerificationCodePageSteps {
	TestContext testContext;
	SendVerificationCodePage sendVerificationCodePage;
	
	public SendVerificationCodePageSteps(TestContext context) {
		testContext = context;
		sendVerificationCodePage = testContext.getPageObjectManager().getSendVerificationCodePage();
	}
	
	@Then("^a user selects ([^\"]*) for OTP option$")
	public void a_user_selects_for_OTP_option(String codeOption) throws Throwable {
		sendVerificationCodePage.selectOtpOption(codeOption);
	}

}
