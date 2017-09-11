package SleniumJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by pavani on 8/22/17.
 */
public class TestGoogle {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/pavani/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }

    @Test
    public void testGoogle(){

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Page loaded");
        }
        else
        {
            System.out.println("Page Not found");
        }

        Assert.assertEquals(expectedTitle,actualTitle);

        WebElement display = driver.findElement(By.id("hplogo"));
        Boolean disp = display.isDisplayed();
        if(disp){
            System.out.println("Google is displayed");
        }



    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
