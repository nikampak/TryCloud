package com.TryCloud.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
    WebDriver driver;

    public ContactsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "button#new-contact-button")
    WebElement newContract;
    @FindBy(xpath = "//span[@title='+ New group']")
    WebElement newGroup;
    @FindBy(xpath = "//button[@class='icon action-item__menutoggle icon-add']")
    WebElement plusIconAction;
    @FindBy(xpath = "//button[@class='primary']")
    WebElement createContact;

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getNewContract() {
        return newContract;
    }

    public WebElement getNewGroup() {
        return newGroup;
    }

    public WebElement getPlusIconAction() {
        return plusIconAction;
    }

    public WebElement getCreateContact() {
        return createContact;
    }
}
