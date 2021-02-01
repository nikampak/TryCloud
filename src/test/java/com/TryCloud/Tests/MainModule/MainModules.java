package com.TryCloud.Tests.MainModule;

import com.TryCloud.Pages.HomePage;
import com.TryCloud.Tests.Base.TestBase;

import org.testng.Assert;
import org.testng.annotations.Test;


public class MainModules extends TestBase {

    @Test(description = "verify users access to the main modules")
    public void verifyMainModules(){
        HomePage hP = new HomePage(driver);
        hP.files().click();
        Assert.assertTrue(hP.files().isDisplayed());
        hP.photos().click();
        Assert.assertTrue(hP.photos().isDisplayed());
        hP.activity().click();
        Assert.assertTrue(hP.activity().isDisplayed());
        hP.talk().click();
        Assert.assertTrue(hP.talk().isDisplayed());
        hP.contacts().click();
        Assert.assertTrue(hP.contacts().isDisplayed());
        hP.calendar().click();
        Assert.assertTrue(hP.calendar().isDisplayed());
        hP.notes().click();
        Assert.assertTrue(hP.notes().isDisplayed());

    }
}
