package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScenario {
    public static WebDriver driver;



    @Given("user is on login page")
    public void user_is_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.whiteboxqa.com/login.php");

    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        driver.findElement(By.id("username")).sendKeys("Sri1997");
        driver.findElement(By.id("password")).sendKeys("Innovapath123");

    }
    @And("user clicks on login button")
    public void user_clicks_on_login_button() {
        driver.findElement(By.id("login")).click();

    }
    @Then("user should be on landing page")
    public void user_should_be_on_landing_page() {
        driver.getPageSource().contains("LogOut");

    }

}
