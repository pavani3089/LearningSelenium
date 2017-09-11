package com.toptal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by pavani on 9/6/17.
 */
public class HomePage {
    private WebDriver driver;
    private static String Page_URL = "https://www.toptal.com";


   // @FindBy(xpath = "//*[@id='content']/section[3]/div/ul/li[1]/a/span[3]")
    @FindBy(xpath = "//div[@class='home_verticals-inner']//span[text()='Hire top developers']")
    private WebElement hireTopDev_Button;

    public HomePage(WebDriver driver){
        this.driver = driver;
        driver.get(Page_URL);
        PageFactory.initElements(driver,this);
    }

    public void clickon_hireTopDev(){
        hireTopDev_Button.click();
    }
}


