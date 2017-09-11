package com.toptal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by pavani on 9/6/17.
 */
public class DevelopersPage {

    private WebDriver driver;

    /*@FindBy(xpath = "//div[@class='page_header_top-logotype']")
    private WebElement header;*/

    @FindBy(linkText = "APPLY AS A DEVELOPER")
    private WebElement applyAsDev_button;

    public DevelopersPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public boolean isPageOpen(){
        return applyAsDev_button.isDisplayed();
    }

    public void clickButton(){
        applyAsDev_button.click();
    }
}
