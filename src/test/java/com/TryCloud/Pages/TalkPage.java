package com.TryCloud.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkPage extends PageBase {

    public TalkPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@placeholder='Search conversations or users']")
    WebElement searchConversationsOrUsers;
    @FindBy(xpath = "//button[@class='toggle has-tooltip']")
    WebElement plusIcon;
    @FindBy(xpath = "//div[@class='acli__content__line-one']")
    WebElement talkUpdates;
    @FindBy(xpath = "//button[@aria-label='Conversation settings']")
    WebElement menuToggle;
    @FindBy(xpath = "//a[@class='app-navigation-toggle']")
    WebElement navigationToggle;

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getSearchConversationsOrUsers() {
        return searchConversationsOrUsers;
    }

    public WebElement getPlusIcon() {
        return plusIcon;
    }

    public WebElement getTalkUpdates() {
        return talkUpdates;
    }

    public WebElement getMenuToggle() {
        return menuToggle;
    }

    public WebElement getNavigationToggle() {
        return navigationToggle;
    }
}
