package com.toptal.tests;

/**
 * Created by pavani on 9/14/17.
 */
import com.toptal.webpages.DevelopersApplyPage;
import com.toptal.webpages.DevelopersPage;
import com.toptal.webpages.DevelopersPortalPage;
import com.toptal.webpages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by pavani on 9/6/17.
 */
public class ApplyAsDeveloperTest {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @DataProvider(name = "test1")

    public Object[][] data()
    {
        Object[][] x ={{"abcd@gmai.com","Pa","Pa","x","xy"},
                {"abcd@gmai.com","Pa","Pa","x","xy"}
        };

        return x;
    }

    @Test(dataProvider = "test1")
    public void applyasdeveloper(String email,String pass,String conP,String fname,String sname){
        HomePage hp = new HomePage(driver);
        hp.clickon_hireTopDev();

        DevelopersPage dp = new DevelopersPage(driver);
        Assert.assertTrue(dp.isPageOpen());
        dp.clickButton();

        DevelopersPortalPage dpp = new DevelopersPortalPage(driver);
        Assert.assertTrue(dpp.isPageOpened());
        dpp.clikOnJoin();

        DevelopersApplyPage apply = new DevelopersApplyPage(driver);
        Assert.assertTrue(apply.isPageOpened());
        Assert.assertTrue(apply.isDisplayed());

        apply.setEmail(email);
        apply.setPassword(pass);
        apply.setPassword_confirmation(conP);
        apply.setFullName(fname);
        apply.setSkypeName(sname);
        apply.clikOnJoin();
    }

    @AfterTest
    public void close(){
        driver.close();
    }
}
