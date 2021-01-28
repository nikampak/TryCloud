package com.TryCloud.Tests.TestBase;

import org.openqa.selenium.WebDriver;

public abstract class TestBase {
    public WebDriver driver;

    public TestBase(WebDriver driver) {
        this.driver = driver;
    }

    public void setup(){

    }

    public void tearDowns(){

    }
}
