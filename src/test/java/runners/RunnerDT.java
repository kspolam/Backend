package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features/userregistration.feature",
        glue = "stepdefs",
        plugin = {"pretty","html:target/index.html"}

)
public class RunnerDT extends AbstractTestNGCucumberTests {

    @DataProvider
    @Override
    public Object[][] scenarios(){
        return super.scenarios();
    }
}
