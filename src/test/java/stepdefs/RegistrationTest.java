package stepdefs;

import context.TestContextUI;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.Test;

import java.util.List;

public class RegistrationTest {

    TestContextUI testContextUI;
    public RegistrationTest(TestContextUI testContextUI){
        this.testContextUI=testContextUI;
    }


    @Given("When User is on registration page")
    public void when_user_is_on_registration_page() {

        System.out.println("User is on registration page");

    }
    @When("User enters following details")
    public void user_enters_following_details(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        List<List<String>> userList=dataTable.asLists(String.class);

        for(List<String> userRow: userList){

            System.out.println(userRow);

        }


    }
    @Then("user should be registered successfully")
    public void user_should_be_registered_successfully() {

        System.out.println("user has registered successfully");
    }
}
