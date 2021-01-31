package com.TryCloud.Tests.userStory2;

import com.TryCloud.Pages.LoginPage;
import com.TryCloud.TestBase.TestBase;
import com.Utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase_01 extends TestBase {

    @Test(description = "Test case #1 - verify users access to the main modules")
    public void tc01_verify_users_can_access_to_the_main_module(){

        //1. Login as a user
        LoginPage log = new LoginPage(driver);

        log.username().sendKeys(Data.user3);
        log.password().sendKeys(Data.password);
        log.loginButton().click();

        //2. Verify the user see the following modules:
        //Files Galleries Activity Talk Contacts Calendar Note
        WebElement photos = driver.findElement(By.xpath("(//a[@aria-label='Photos'])[1]"));
        Assert.assertTrue(photos.isDisplayed());

        WebElement activity = driver.findElement(By.xpath("(//a[@aria-label='Activity'])[1]"));
        Assert.assertTrue(activity.isDisplayed());

        WebElement talk = driver.findElement(By.xpath("(//a[@aria-label='Talk'])[1]"));
        Assert.assertTrue(talk.isDisplayed());

        WebElement contacts = driver.findElement(By.xpath("(//a[@aria-label='Contacts'])[1]"));
        Assert.assertTrue(contacts.isDisplayed());

        WebElement calendar = driver.findElement(By.xpath("(//a[@aria-label='Calendar'])[1]"));
        Assert.assertTrue(calendar.isDisplayed());

        WebElement notes = driver.findElement(By.xpath("(//a[@aria-label='Notes'])[1]"));
        Assert.assertTrue(notes.isDisplayed());



    }

}
