package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;

public class LoginPage {

    private WebDriver driver;

    private By eleUserName=By.cssSelector("input#userName");
    private By elePassword=By.cssSelector("input#password");
    private By loginButton=By.cssSelector("button#btnLogi");
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void doLogin(String userName, String password){
        new WebDriverWait(driver,Duration.ofSeconds(40)).until(ExpectedConditions.visibilityOfElementLocated(eleUserName));
        driver.findElement(eleUserName).sendKeys(userName, Keys.TAB);
        driver.findElement(elePassword).sendKeys(password, Keys.TAB);
        driver.findElement(loginButton).click();



    }
}
