package hooks;

import cucumber.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	TestContext testContext;
	
	public Hooks(TestContext context) {
		testContext = context;
	}
	
	@Before
	public void beforeScenario(Scenario scenario) {
		/// Reporter
	}
	
	@After(order = 1)
	public void afterScenario(Scenario scenario) {
		if(scenario.isFailed()) {
			// We will capture screenshot
		}
	}
	
	@After(order = 0)
	public void AfterSteps() {
		testContext.getWebDriverManager().quitDriver();
	}
	

}
