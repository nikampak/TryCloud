package com.TryCloud.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "(//a[@href='/index.php/apps/files/'])[1]")
    WebElement files;
    @FindBy(xpath = "(//a[@href='/index.php/apps/photos/'])[1]")
    WebElement photos;
    @FindBy(xpath = "(//a[@href='/index.php/apps/activity/'])[1]")
    WebElement activity;
    @FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
    WebElement talk;
    @FindBy(xpath = "(//a[@href='/index.php/apps/contacts/'])[1]")
    WebElement contacts;
    @FindBy (xpath = "(//a[@href='/index.php/apps/calendar/'])[1]")
    WebElement calendar;
    @FindBy(xpath = "(//a[@href='/index.php/apps/notes/'])[1]")
    WebElement notes;

    public WebElement files(){
        return files;
    }
    public WebElement photos(){
        return photos;
    }
    public WebElement activity(){
        return activity;
    }
    public WebElement talk(){
        return talk;
    }
    public WebElement contacts(){
        return contacts;
    }
    public WebElement calendar(){
        return calendar;
    }
    public WebElement notes(){
        return notes;
    }
}
