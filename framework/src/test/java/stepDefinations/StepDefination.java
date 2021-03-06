package stepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObject.Landingpage;
import pageObject.Loginpage;
import resources.base;

@RunWith(Cucumber.class)
public class StepDefination extends base {

	@Given("^Initialize browser with chrome$")
	public void initialize_browser_with_chrome() throws Throwable {
		driver = initializeDriver();

	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
		driver.get(arg1);

	} 

	@Given("^click on login link on homepage to land on signin page$")
	public void click_on_login_link_on_homepage_to_land_on_signin_page() throws Throwable {
		Landingpage l = new Landingpage(driver);
		l.getlogin().click();

	}


    @When("^User enter (.+) and (.+) and logs in $")
	   public void user_enter_and_and_logs_in(String username, String passsword) throws Throwable {
		Loginpage lp = new Loginpage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(passsword);
		
		lp.getLogin().click();   
	}

	@Then("^Verify user is successfuly login$")
	public void verify_user_is_successfuly_login() throws Throwable {
		System.out.println("done");

	}

	@And("^close browser$")
	public void close_browser() throws Throwable {
		driver.quit();
	}

}
