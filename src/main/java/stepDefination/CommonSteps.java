package stepDefination;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import hooks.NavigationHelper;

public class CommonSteps {
	TestContext testContext;
	NavigationHelper navigationHelper;
	LoginPageSteps loginPageSteps;
	SendVerificationCodePageSteps sendVerificationCodePageSteps;
	EnterVerificationCodePageSteps enterVerificationCodePageSteps;
	SaveBrowserPageSteps saveBrowserPageSteps;
	
	public CommonSteps(TestContext context) {
		testContext = context;
		loginPageSteps = new LoginPageSteps(context);
		sendVerificationCodePageSteps = new SendVerificationCodePageSteps(context);
		enterVerificationCodePageSteps =  new EnterVerificationCodePageSteps(context);
		saveBrowserPageSteps = new SaveBrowserPageSteps(context);
		navigationHelper = testContext.getPageObjectManager().getNavigationHelper();
	}
	
	@Given("^a user is on purenroll login page$")
	public void a_user_is_on_purenroll_login_page() throws Throwable {
		navigationHelper.navigate_to_LoginPage();
	 	
	}
	
	@Given("^a user with valid admin role sign in into Corenroll Admin$")
	public void a_user_with_valid_admin_role_sign_in_into_Corenroll_Admin() throws Throwable{
		navigationHelper.navigate_to_LoginPage();
		loginPageSteps.a_user_enter_valid_and("hellofromcts@gmail.com", "Cts@2020");
		sendVerificationCodePageSteps.a_user_selects_for_OTP_option("email");
		enterVerificationCodePageSteps.a_user_verify_of_the_web_page("ENTER VERIFICATION CODE");
		enterVerificationCodePageSteps.a_user_enters_verification_code_for("hellofromcts@gmail.com" );
		saveBrowserPageSteps.a_user_select_for_SB_option("no");
	}

}
