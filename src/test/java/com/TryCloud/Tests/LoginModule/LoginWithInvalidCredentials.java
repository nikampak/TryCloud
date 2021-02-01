package com.TryCloud.Tests.LoginModule;

import com.TryCloud.Tests.Base.TestBase;
import com.Utilities.BrowserUtilities;
import com.Utilities.Data;
import com.Utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginWithInvalidCredentials extends TestBase {

    @BeforeClass
    @Override
    public void setup() {
        driver = Driver.getDriver(Data.browser);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(Data.url);
    }

    @Test(description = "verify user cannot login with invalid credentials")
    public void Tc01() {

        driver.findElement(By.id("user")).sendKeys(Data.invalidUser);
        driver.findElement(By.cssSelector("#password")).sendKeys(Data.invalidPassword);
        BrowserUtilities.sleep(1);
        driver.findElement(By.id("submit-form")).click();
        BrowserUtilities.sleep(3);

        String expectedMessage = "Wrong username or password.";
        String actualMessage = driver.findElement(By.xpath("//p[@class='warning wrongPasswordMsg']")).getText();

        String expectedTitle = "Trycloud - QA";
        String actualTitle = driver.getTitle();


        Assert.assertEquals(actualMessage, expectedMessage);
        Assert.assertEquals(actualTitle, expectedTitle);

    }
}
