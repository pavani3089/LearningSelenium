package com.sft.PageObjectModel;

import com.sft.util.ReadGuru99ExcelFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by pavani on 8/20/17.
 */
public class SignUpFormTest {


    protected static WebDriver driver;

    @BeforeMethod
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/pavani/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @DataProvider(name = "regiform")
    public Object[][] pullDataFromExcel() throws IOException {

        ReadGuru99ExcelFile r=new ReadGuru99ExcelFile();
        String filePath = "/";
        Object[][] x=r.readExcel(filePath,"xyz.xlsx","pavani");
        for(Object s[]:x)
        {
            for(Object y:s)
            {
                System.out.println(y);
            }
        }

        return x;
    }



    @Test(dataProvider = "regiform", groups = {"Test1"})
    public void signUp(String fname,String lname,String streetadd){
        driver.get("http://www.kimschiller.com/page-object-pattern-tutorial/index.html");

        SignUpPage signUpPage = new SignUpPage(driver);
        Assert.assertTrue(signUpPage.isInitialized());

        signUpPage.enterName(fname,lname);
        signUpPage.enterAddress(streetadd,"94538");
        //By.cssSelector("")

        ReceiptPage receiptPage = signUpPage.submit();
        Assert.assertTrue(receiptPage.isInitialized());

        Assert.assertEquals("Thank you!", receiptPage.confirmationHeader());
    }

    @Test(groups ={"Test1"} )
    public void xyz(){
        Assert.assertEquals(1,1);
    }
    @Test(groups ={"Test1","Test2"} )
    public void xyz1(){
        Assert.assertEquals(1,1);
    }
    @Test(groups ={"Test1","Test2"} )
    public void xyz2(){
        Assert.assertEquals(1,1);
    }
    @Test(groups ={"Test1"} )
    public void xyz3(){
        Assert.assertEquals(1,1);
    }
    @Test(groups ={"Test1"} )
    public void xyz4(){
        Assert.assertEquals(1,1);
    }


    @AfterMethod
    public static void tearDown(){
        driver.close();
    }
}
