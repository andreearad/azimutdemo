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

public class Register {
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

    @Given("open azimut page")
    public void open_azimut_page() {
        driver.get("https://demo.automationtesting.in/Index.html");
    }

    @Then("enter email {string}")
    public void enter_email (String adresaDeEmail) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys(adresaDeEmail);
        out.println("Waiting for 1 sec..");
        sleep(1_000);


    }
    @Then("click log in button")
    public void click_log_in_button() {
        driver.findElement(By.xpath("//*[@id='enterimg']")).click();

    }
    @Then("enter first name {string}")
    public void enter_first_name(String nume) throws InterruptedException {

        driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys(nume);

        out.println("Waiting for 1 sec..");
        sleep(1_000);

    }

    @Then("enter last name {string}")
    public void enter_last_name(String nume2) throws InterruptedException {
        driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys(nume2);
        out.println("Waiting for 1 sec..");
        sleep(1_000);


    }

    @Then("enter adress {string}")
    public void enter_adress(String adresa) throws InterruptedException {
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(adresa);
        out.println("Waiting for 1 sec..");
        sleep(1_000);

    }



    @Then("enter emaill {string}")
    public void enter_emaill(String email) throws InterruptedException {
        driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys(email);
        out.println("Waiting for 1 sec..");
        sleep(1_000);

    }

    @Then("enter phone numer {string}")
    public void enter_phone_numer(String number) throws InterruptedException {
        driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(number);
        out.println("Waiting for 1 sec..");
        sleep(1_000);

    }

    @Then("select gender {string}")
    public void select_gender(String female) throws InterruptedException {
       driver.findElement(By.xpath("//input[@value='"+female+"']")).click();
        out.println("Waiting for 1 sec..");
        sleep(1_000);
    }

    @Then("select hobbies {string}")
    public void select_hobbies(String movies) throws InterruptedException {
     driver.findElement(By.xpath("//input[@value='"+movies+"']")).click();
        out.println("Waiting for 1 sec..");
        sleep(1_000);
    }

    @Then("select skills {string}")
    public void select_skills(String cwp) throws InterruptedException {
        driver.findElement(By.xpath("//select[@id='Skills']/option[@value='"+cwp+"']")).click();
        out.println("Waiting for 1 sec..");
        sleep(1_000);
    }

    @Then("enter country")
    public void enter_country() throws InterruptedException {
        driver.findElement(By.xpath("//select[@ng-model='country']")).click();
        out.println("Waiting for 1 sec..");
        sleep(1_000);
    }

    @Then("contry nimic {string}")
    public void contry_nimic(String country) throws InterruptedException {
        driver.findElement(By.xpath("//select[@id='country']/option[@value='"+country+"']")).click();
        out.println("Waiting for 1 sec..");
        sleep(1_000);
    }

    @Then("select language {string}")
    public void select_language(String language) throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='msdd']")).click();
        driver.findElement(By.xpath("//*[a='"+language+"']")).click();
        out.println("Waiting for 1 sec..");
        sleep(1_000);

    }

    @Then("country")
    public void country() throws InterruptedException {
        driver.findElement(By.xpath("//span[@id='select2-country-container']"));
        out.println("Waiting for 1 sec..");
        sleep(1_000);
    }

    @Then("year {string}")
    public void year(String year) throws InterruptedException {
        driver.findElement(By.xpath("//select[@ng-model='yearbox']/option[@value='"+year+"']")).click();
        out.println("Waiting for 1 sec..");
        sleep(1_000);
    }

    @Then("month {string}")
    public void month(String month) throws InterruptedException {
        driver.findElement(By.xpath("//select[@ng-model='monthbox']/option[@value='"+month+"']")).click();
        out.println("Waiting for 1 sec..");
        sleep(1_000);
    }

    @Then("day {string}")
    public void day(String day) throws InterruptedException {
        driver.findElement(By.xpath("//select[@ng-model='daybox']/option[@value='"+day+"']")).click();
        out.println("Waiting for 1 sec..");
        sleep(1_000);
    }

    @Then("password {string}")
    public void password(String parola) throws InterruptedException {
        driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys(parola);
        out.println("Waiting for 1 sec..");
        sleep(1_000);
    }



    @Then("confirm password {string}")
    public void confirm_password(String parola) throws InterruptedException {
        driver.findElement(By.xpath("//input[@ng-model='CPassword']")).sendKeys(parola);
        out.println("Waiting for 1 sec..");
        sleep(1_000);
    }



    @Then("submit")
    public void submit() throws InterruptedException {
        driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
        out.println("Waiting for 1 sec..");
        sleep(1_000);
    }



}

