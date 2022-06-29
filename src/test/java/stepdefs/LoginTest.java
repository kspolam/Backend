package stepdefs;

import context.TestContextUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
    TestContextUI testContextUI;

   public LoginTest(TestContextUI testContextUI){
        this.testContextUI=testContextUI;
   }
    @Given("User is on application landing page")
    public void user_is_on_application_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("User is displayed on login page")
    public void user_is_displayed_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("user enteres {string} in username field")
    public void user_enteres_in_username_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("user enters {string} in password field")
    public void user_enters_in_password_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("user clicks on singin button")
    public void user_clicks_on_singin_button() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("user should see failure message")
    public void user_should_see_failure_message() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }


}
