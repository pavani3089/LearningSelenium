package com.toptal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by pavani on 9/6/17.
 */
public class DevelopersApplyPage {
    private WebDriver driver;

    @FindBy(xpath = "//div/h1[@class='modal-content-header is-centered is-medium']")
    private WebElement heading;

    @FindBy(xpath = "//div[@class='input']")
    private WebElement IAmADev;

    @FindBy(id = "talent_email")
    private WebElement Email;

    @FindBy(id = "talent_password")
    private WebElement Password;

    @FindBy(id = "talent_password_confirmation")
    private WebElement Password_confirmation;

    @FindBy(name = "talent[full_name]")
    private WebElement FullName;

    @FindBy(name = "talent[skype]")
    private WebElement SkypeName;

    @FindBy(name = "commit")
    private WebElement join;

    public DevelopersApplyPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setEmail(String email){
        Email.clear();
        Email.sendKeys(email);
    }

    public void setPassword(String password){
        Password.clear();
        Password.sendKeys(password);
    }

    public void setPassword_confirmation(String pswd_conf){
        Password_confirmation.clear();
        Password_confirmation.sendKeys(pswd_conf);
    }

    public void setFullName(String fullName){
        FullName.clear();
        FullName.sendKeys(fullName);
    }

    public void setSkypeName(String skypeName){
        SkypeName.clear();
        SkypeName.sendKeys(skypeName);
    }

    public boolean isPageOpened(){
        return heading.getText().toString().contains("Apply to Join our Network");
    }

    public boolean isDisplayed(){
        return IAmADev.getText().toString().contains("I am a Developer");
    }

    public void clikOnJoin(){
        join.click();
    }
}
