package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue="stepdefs",
        plugin = {"pretty","html:target/examples.html"}
)
public class RunnerEx extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){

        return  super.scenarios();
    }

}
