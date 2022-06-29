package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = {"@target/failedrerun.txt"},
        glue = "stepdefs",
        plugin = {"pretty","html:target/htmlreport.html",
                "rerun:target/failedrerun.txt"}
)
public class FailedRunner extends AbstractTestNGCucumberTests {

    @DataProvider
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
