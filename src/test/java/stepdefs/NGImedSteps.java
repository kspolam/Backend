package stepdefs;

import context.TestContextUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

public class NGImedSteps extends TestContextUI {

    private TestContextUI testContextUI;
    private WebDriver driver;

    public NGImedSteps(TestContextUI testContextUI){
        this.testContextUI=testContextUI;
        this.driver=testContextUI.getDriver();
    }
    @Given("user is on login page")
    public void user_is_on_login_page() {

        driver.get("https://i1imedengb.imedone.ap.dtcs.local/im1ws_imedengb/#/workplace");

        new LoginPage(driver).doLogin("parika","isaplim");



    }
    @When("user is logged in with valid credentials")
    public void user_is_logged_in_with_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("user should see the workplace")
    public void user_should_see_the_workplace() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("User types id {string} in the populator combobox")
    public void user_types_id_in_the_populator_combobox(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("user should see the populator option and select it")
    public void user_should_see_the_populator_option_and_select_it() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("populator should be selected successfully")
    public void populator_should_be_selected_successfully() {
        // Write code here that turns the phrase above into concrete actions

    }
}
