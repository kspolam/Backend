package stepdefs;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features/selectpopulator.feature",
        glue = "stepdefs",
        plugin = {"pretty","html:target/htmlreport.html","rerun:target/failedrerun.txt"}
)
public class PopulatorSelection extends AbstractTestNGCucumberTests {

    @DataProvider
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
