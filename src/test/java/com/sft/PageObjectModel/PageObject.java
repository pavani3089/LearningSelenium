package com.sft.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by pavani on 8/20/17.
 */
public class PageObject {


    protected WebDriver driver;

    public PageObject(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
