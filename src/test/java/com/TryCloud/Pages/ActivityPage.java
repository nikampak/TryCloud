package com.TryCloud.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ActivityPage {
    WebDriver driver;

    public ActivityPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
}
