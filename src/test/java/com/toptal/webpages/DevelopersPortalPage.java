package com.toptal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by pavani on 9/6/17.
 */
public class DevelopersPortalPage {
    private WebDriver driver;

    @FindBy(xpath = "//div/h1[@class='modal-content-header is-centered']")
    private WebElement heading;

    @FindBy(linkText = "JOIN TOPTAL")
    private WebElement joinToptalButton;

    public DevelopersPortalPage (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isPageOpened(){
        return heading.getText().toString().contains("Developer Portal");
    }

    public void clikOnJoin(){
        joinToptalButton.click();
    }
}
