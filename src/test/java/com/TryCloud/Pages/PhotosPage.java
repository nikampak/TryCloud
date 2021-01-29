package com.TryCloud.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhotosPage {
    WebDriver driver;

    public PhotosPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@title='Your photos']")
    WebElement yourPhotos;
    @FindBy(xpath = "//span[@title='Favorites']")
    WebElement favorites;
    @FindBy(xpath = "//span[@title='Your albums']")
    WebElement yourAlbums;
    @FindBy(xpath = "//span[@title='Shared albums']")
    WebElement sharedAlbums;
    @FindBy(xpath = "//span[@title='Tagged photos']")
    WebElement taggedPhotos;
}