package SleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by pavani on 8/19/17.
 */
public class TestSignIn {

    private WebDriver driver;
    @BeforeTest
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "./chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test1() {
        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("xyz");

        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("abc");

        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("xyz.abc@gmail.com");

        WebElement reenter = driver.findElement(By.name("reg_email_confirmation__"));
        reenter.sendKeys("xyz.abc@gmail.com");

        WebElement paswd = driver.findElement(By.name("reg_passwd__"));
        paswd.sendKeys("*****");

        WebElement bmonth = driver.findElement(By.name("birthday_month"));
        Select month = new Select(bmonth);
        month.selectByVisibleText("May");

        WebElement bday = driver.findElement(By.name("birthday_day"));
        Select day = new Select(bday);
        day.selectByValue("15");

        WebElement byear = driver.findElement(By.name("birthday_year"));
        Select year = new Select(byear);
        year.selectByValue("1999");

        WebElement sex = driver.findElement(By.name("sex"));
        sex.click();

        WebElement submit = driver.findElement(By.name("websubmit"));
        submit.click();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @AfterTest
    public void teardrop() {
        driver.quit();
    }


}
