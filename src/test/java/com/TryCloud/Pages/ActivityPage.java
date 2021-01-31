package com.TryCloud.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityPage {
    WebDriver driver;

    public ActivityPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@data-navigation='all']")
    WebElement allActivities;
    @FindBy(xpath = "//a[@data-navigation='self']")
    WebElement byYou;
    @FindBy(xpath = "//a[@data-navigation='files_favorites']")
    WebElement favorites;
    @FindBy(xpath = "//a[@data-navigation='files']")
    WebElement fileChanges;
    @FindBy(xpath = "//a[@data-navigation='files_sharing']")
    WebElement fileShares;
    @FindBy(xpath = "//a[@data-navigation='calendar']")
    WebElement calendar;
    @FindBy(xpath = "//a[@data-navigation='calendar_todo']")
    WebElement todos;
    @FindBy(xpath = "//a[@data-navigation='comments']")
    WebElement comments;

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getAllActivities() {
        return allActivities;
    }

    public WebElement getByYou() {
        return byYou;
    }

    public WebElement getFavorites() {
        return favorites;
    }

    public WebElement getFileChanges() {
        return fileChanges;
    }

    public WebElement getFileShares() {
        return fileShares;
    }

    public WebElement getCalendar() {
        return calendar;
    }

    public WebElement getTodos() {
        return todos;
    }

    public WebElement getComments() {
        return comments;
    }
}
