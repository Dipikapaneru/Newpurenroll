package stepDefination;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.testng.Assert;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import filereader.ConfigFileReader;
import pages.EnterVerificationCodePage;
import pages.SendVerificationCodePage;

public class EnterVerificationCodePageSteps {
	
	TestContext testContext;
	EnterVerificationCodePage enterVerificationCodePage;
	Connection con ;
	Statement stmt;
	ConfigFileReader configuration;
	
	
	public EnterVerificationCodePageSteps(TestContext context) {
		testContext = context;
		enterVerificationCodePage = testContext.getPageObjectManager().getEnteVerificationCodePage();
	}
	
	@Then("^a user verify ([^\"]*) of the web page$")
	public void a_user_verify_of_the_web_page(String title) throws Throwable {
		String actualTitle = enterVerificationCodePage.verifytitle();
		Assert.assertEquals(actualTitle, title);
	}
	
	@Then("^a user enters verification code for ([^\"]*)$")
	public void a_user_enters_verification_code_for(String username) throws Throwable {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://3.21.123.67:3306/ssoapp", "root", "jNSd<76@");
		stmt = con.createStatement();
		enterVerificationCodePage.enterVerificationCode(con, stmt, username);
	}
}
