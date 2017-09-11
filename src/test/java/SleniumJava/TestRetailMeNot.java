package SleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import java.util.List;

/**
 * Created by pavani on 8/20/17.
 */
public class TestRetailMeNot {
    private WebDriver driver;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/pavani/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.retailmenot.com/ideas/hot-products");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Electronics")));

       // driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testElectroics(){
        WebElement link = driver.findElement(By.linkText("Electronics"));
        link.click();
        List <WebElement> list = driver.findElements(By.xpath("//section[@id='Electronics']/div[@class='grid-row col-4']/div"));
        System.out.println(list.size());
        Assert.assertEquals(list.size(), 13,"Failed to load");
    }

    @Test
    public void items_Electronics(){
        List <WebElement> title = driver.findElements(By.xpath("//section[@id='Electronics']/div[@class='grid-row col-4']//h6/a"));
        for (WebElement t:title) {
            System.out.println(t.getText());
        }
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
