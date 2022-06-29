package stepdefs;

import context.TestContextUI;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageSteps {
    WebDriver driver;
    TestContextUI testContextUI;
    public HomePageSteps(TestContextUI testContextUI){
        this.testContextUI=testContextUI;

    }


    @Given("User is on Home page")
    public void user_is_on_home_page() {
        // Write code here that turns the phrase above into concrete actions
        this.driver=this.testContextUI.getDriver();
        driver.get("https://www.amazon.in/");
    }
    @When("User searches for a product {string}")
    public void user_searches_a_product_as(String product) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product, Keys.ENTER);

        ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @When("User enters password as {string}")
    public void user_enters_password_as(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("User should be able to login sucessfully")
    public void user_should_be_able_to_login_sucessfully(DataTable table) {

        // Write code here that turns the phrase above into concrete actions




    }
}
