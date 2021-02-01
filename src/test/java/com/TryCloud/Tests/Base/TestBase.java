package com.TryCloud.Tests.Base;

import com.TryCloud.Pages.FilePage;
import com.TryCloud.Pages.LoginPage;
import com.Utilities.Data;
import com.Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    public WebDriver driver;

    public TestBase() {
        this.driver =  Driver.getDriver(Data.browser);
    }

    @BeforeClass
    public void setup(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(Data.url);
        Login();
    }


    public void Login(){
        LoginPage log = new LoginPage(driver);
        FilePage file = new FilePage(driver);

        log.username().sendKeys(Data.user3);
        log.password().sendKeys(Data.password);
        log.loginButton().click();

        //Verify Users Land Home Page
        String expectedTitle = "Files - Trycloud - QA";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }


    @AfterClass
    public void tearDowns(){
        driver.close();
    }
}
