package stepsDefinition;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import static java.lang.System.*;
import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class SwitchTo {
    private WebDriver driver;

    @Before
    public void setup() {
        setProperty("webdriver.chrome.driver",
                getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("open alert page")
    public void open_alert_page()   throws InterruptedException  {
        driver.get("https://demo.automationtesting.in/Alerts.html");
    }


// -----------Alerth with ok-----------

    @Then("click alert with {string}")
    public void click_alert_with(String o) throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='"+o+"']")).click();
        out.println("Waiting for 1 sec..");
        sleep(1_000);
    }
    @Then("select ok button")
    public void select_ok_button() throws InterruptedException {
            driver.switchTo().alert().accept();
            out.println("Waiting for 1 sec..");
            sleep(1_000);
    }

// -----------Alert with cancel--------
    @Then("click alert withh {string}")
    public void click_alert_withh(String cn) throws InterruptedException {
        driver.findElement(By.xpath("//*[@href='#"+cn+"']")).click();
        out.println("Waiting for 1 sec..");
        sleep(1_000);
    }

    @Then("click button")
    public void clickButton() throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='CancelTab']")).click();
        out.println("Waiting for 1 sec..");
        sleep(1_000);

    }
    @Then("accept")
    public void accept() throws InterruptedException {
        driver.switchTo().alert().accept();
        out.println("Waiting for 1 sec..");
        sleep(1_000);
    }

    @Then("dismiss")
    public void dismiss() throws InterruptedException {
        clickButton();
        driver.switchTo().alert().dismiss();
        sleep(1000);


    }
//--------------Alert with text------------
    @Then("click ok alert {string}")
    public void click_ok_alert_text(String txt) throws InterruptedException {
       driver.findElement(By.xpath("//*[@href='#"+txt+"']")).click();
       out.println("Waiting for 1 sec..");
       sleep(1_000);
}
    @Then("select demonstrate")
    public void select_demonstrate() throws InterruptedException {
        driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
        out.println("Waiting for 1 sec..");
        sleep(1_000);

    }

    @Then("write {string} and accept")
    public void writeAndAccept(String bn) throws InterruptedException {
        //driver.switchTo().alert().sendKeys(bn); - nu merge deloc... doar sa accept
        driver.switchTo().alert().accept();
        out.println("Waiting for 1 sec..");
        sleep(1_000);
    }

// -----------Iframes-----------

    @Given("open frames page")
    public void open_frames_page() {
        driver.get("https://demo.automationtesting.in/Frames.html");
        throw new io.cucumber.java.PendingException();
    }
    @Then("go to single frame")
    public void go_to_single_frame() {
        driver.findElement(By.xpath("//*[@id='singleframe']")).click();

        throw new io.cucumber.java.PendingException();
    }
    @Then("write {string}")
    public void write (String aa) {
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input")).sendKeys(aa);
        driver.switchTo().parentFrame();
        throw new io.cucumber.java.PendingException();
    }
    @Then("go to frames within an iframe")
    public void go_to_frames_within_an_iframe() throws InterruptedException {
        driver.findElement(By.xpath("//*[@href='#Multiple']")).click();
        sleep(1000);
        throw new io.cucumber.java.PendingException();
    }
    @Then("write 2 {string}")
    public void write_2(String bb) throws InterruptedException {
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='Multiple']/iframe")));
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input")).sendKeys(bb);
        driver.switchTo().parentFrame();
        sleep(3000);
        throw new io.cucumber.java.PendingException();
    }



}

