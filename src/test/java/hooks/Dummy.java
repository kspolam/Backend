package hooks;

import context.TestContextUI;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dummy {

    TestContextUI testContextUI;
    public Dummy(TestContextUI testContextUI){
        this.testContextUI=testContextUI;
    }


    @Before
    public void beforeScn(Scenario scn){
        System.setProperty("webdriver.chrome.driver","src/test/resources/DriverExecutables/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        testContextUI.setDriver(driver);

    }
    @After
    public void afterScn(Scenario scn){
        scn.log("after scn");
    }
    @BeforeStep
    public  void beforeStep(Scenario scn){

        scn.log("Before step");

    }

    @AfterStep
    public void afterStep(Scenario scn){
        scn.log("after step");
    }

}