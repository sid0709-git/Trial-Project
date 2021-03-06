package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefination {

    @Given("^User is on Net banking landing page$")
    public void user_is_on_net_banking_landing_page() throws Throwable {
    	
      System.out.println("navigated to login url");
    }

    @When("^User login with username and password$")
    public void user_login_with_username_and_password() throws Throwable {
    	
    	System.out.println("logged in successfuly");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	
    	System.out.println("homepage validated");
    }
    @When("^User login with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
      System.out.println(strArg1);
      System.out.println(strArg2);
    }

    @And("^cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1) throws Throwable {
       System.out.println(strArg1);
    }

}