package com.TryCloud.Tests.Login;

import com.TryCloud.Pages.LoginPage;
import com.TryCloud.TestBase.TestBase;
import com.Utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogIn extends TestBase {

    @Test
    public void Login() {
        LoginPage log = new LoginPage(driver);

        log.username().sendKeys(Data.user1);
        log.password().sendKeys(Data.password);
        log.loginButton().click();

        //Verify Users Land Home Page
        String expectedTitle = "Files - Trycloud - QA";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
