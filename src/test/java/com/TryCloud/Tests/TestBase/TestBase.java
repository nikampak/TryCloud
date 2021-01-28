package com.TryCloud.Tests.TestBase;

import com.Utilities.WebDriverUtilities;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    public WebDriver driver;

    public TestBase() {
        this.driver =  WebDriverUtilities.getDriver("chrome");
    }

    @BeforeClass
    public void setup(){
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://qa.trycloud.net/index.php/login?clear=1");
    }
    @AfterClass
    public void tearDowns(){
        driver.close();
    }
}
