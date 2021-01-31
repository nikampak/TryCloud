package com.TryCloud.Tests.MainModule;

import com.TryCloud.Pages.HomePage;
import com.TryCloud.Tests.Base.TestBase;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainModules extends TestBase {

    @Test(description = "verify users access to the main modules")
    public void verifyMainModules(){
        HomePage hP = new HomePage(driver);
        hP.files().click();
        Assert.assertEquals(driver.getTitle(), "Files - Trycloud - QA");
        hP.photos().click();
        Assert.assertEquals(driver.getTitle(), "Photos - Trycloud - QA");
        hP.activity().click();
        Assert.assertEquals(driver.getTitle(), "Activity - Trycloud - QA");
        hP.talk().click();
        Assert.assertEquals(driver.getTitle(), "Talk - Trycloud - QA");
        hP.contacts().click();
        Assert.assertEquals(driver.getTitle(), "Contacts - Trycloud - QA");
        hP.calendar().click();
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter  dtf = DateTimeFormatter.ofPattern("MMMM yyyy");
        Assert.assertEquals(driver.getTitle(), dtf.format(dateTime)+" - Calendar - Trycloud - QA");
        hP.notes().click();
        Assert.assertEquals(driver.getTitle(), "Notes - Trycloud - QA");

    }
}
