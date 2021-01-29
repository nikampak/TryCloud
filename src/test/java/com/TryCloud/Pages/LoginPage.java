package com.TryCloud.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "user")
    WebElement userName;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "submit-form")
    WebElement loginButton;

    public WebElement username(){
        return userName;
    }
    public WebElement password(){
        return password;
    }
    public WebElement loginButton(){
        return loginButton;
    }
}
