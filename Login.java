package stepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.System.*;
import static java.lang.Thread.sleep;

public class Login {
    private WebDriver driver;
    @Before
    public void setup(){
        setProperty("webdriver.chrome.driver",
                getProperty("user.dir") +"/src/main/java/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }
    @After
    public void tearDown(){
        driver.quit();
    }

    @Given("open azimut website")
    public void open_azimut_website() throws InterruptedException {

            driver.get("https://demo.automationtesting.in/Index.html");

        }
    @Then("enter email2 {string}")
    public void iEnterEmail2 (String email) throws InterruptedException {
            driver.findElement(By.xpath("//*[@id='email']")).sendKeys(email);
            out.println("Waiting for 1 sec..");
            sleep(1_000);

        }
    @Then("click sign in button")
    public void click_sign_in_button() throws InterruptedException {
        driver.findElement(By.xpath("//button[@id='btn1']")).click();
        out.println("Waiting for 2 sec..");
        sleep(2_000);
        driver.navigate().back();
        out.println("Waiting for 2 sec..");
        sleep(2_000);
    }

    @Then("click skip sign in button")
    public void click_skip_ign_in_button() throws InterruptedException {
        driver.findElement(By.xpath("//button[@id='btn2']")).click();
        out.println("Waiting for 2 sec..");
        sleep(2_000);
    }

}
