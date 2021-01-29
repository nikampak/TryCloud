package com.TryCloud.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilePage {
    WebDriver driver;

    public FilePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'All files')]")
    WebElement allFiles;
    @FindBy(xpath = "//a[contains(text(),'Recent')]")
    WebElement recent;
    @FindBy(xpath = "//a[contains(text(),'Favorites')]")
    WebElement favorites;
    @FindBy(xpath = "//a[contains(text(),'Shares')]")
    WebElement shares;
    @FindBy(xpath = "//a[contains(text(),'Tags')]")
    WebElement tags;
    @FindBy(xpath = "//a[contains(text(),'Deleted Files')]")
    WebElement deletedFiles;
    @FindBy(xpath = "//button[contains(text(),'Settings')]")
    WebElement settings;
    @FindBy(css = "a[class='button new']")
    WebElement addNewFileButton;
}
