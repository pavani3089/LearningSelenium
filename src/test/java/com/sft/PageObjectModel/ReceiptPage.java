package com.sft.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by pavani on 8/20/17.
 */
public class ReceiptPage extends PageObject {
    @FindBy(tagName = "h1")
    private WebElement header;

    public ReceiptPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return header.isDisplayed();
    }

    public String confirmationHeader(){
        return header.getText();
    }
}
