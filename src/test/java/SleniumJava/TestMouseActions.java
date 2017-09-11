package SleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

/**
 * Created by pavani on 8/20/17.
 */
public class TestMouseActions {



    private WebDriver driver;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/pavani/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://store.demoqa.com");
    }

    @Test
    public void mouseHover(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement waittime = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Product Category")));
        // driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();


        WebElement element = driver.findElement(By.linkText("Product Category"));

        Actions action = new Actions(driver);

        action.moveToElement(element).perform();

        WebElement subElement = driver.findElement(By.linkText("iPads"));

        action.moveToElement(subElement);

        action.click();

        action.perform();

    }





    @AfterMethod
    public void tearDrop(){
        driver.quit();
    }

}
