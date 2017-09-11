package SleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.*;
import org.openqa.selenium.chrome.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by pavani on 8/19/17.
 */
public class TestFbLogin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/pavani/Downloads/chromedriver");

        // Create object of HashMap Class
        Map<String, Object> prefs = new HashMap<String, Object>();

        // Set the notification setting it will override the default setting
        prefs.put("profile.default_content_setting_values.notifications", 2);

        // Create object of ChromeOption class
        ChromeOptions options = new ChromeOptions();

        // Set the experimental option
        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
        WebElement uname = driver.findElement(By.name("email"));
        uname.sendKeys("*******");
        WebElement passwrd = driver.findElement(By.name("pass"));
        passwrd.sendKeys("*****");
        WebElement login = driver.findElement(By.id("u_0_0"));
        login.click();
        Thread.sleep(12000);
        //driver.switchTo().alert().accept();
        WebElement name = driver.findElement(By.xpath("//div[@id='userNav']//div[@class='linkWrap noCount']"));
        String x=name.getText();
        Assert.assertEquals(x,"Pavani Yuvaraju");

    }

}
