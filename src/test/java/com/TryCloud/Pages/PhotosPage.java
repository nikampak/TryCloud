package com.TryCloud.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhotosPage extends PageBase {

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

    public PhotosPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getYourPhotos(){
        return yourPhotos;
    }

    public WebElement getFavorites(){
        return favorites;
    }

    public WebElement getYourAlbums(){
        return yourAlbums;
    }

    public WebElement getSharedAlbums(){
        return sharedAlbums;
    }

    public WebElement getTaggedPhotos(){
        return taggedPhotos;
    }
}