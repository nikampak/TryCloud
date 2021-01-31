package com.Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BrowserUtilities {

    public static void sleep(int howLongSecond) {
        try {
            Thread.sleep(howLongSecond * 1000);
        } catch (InterruptedException e) {
        }
    }

    public static void getElementScreenshot(WebElement element) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(" MMMM/ dd, hh.mm a");


        File file = element.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("/Users/egemeneliz/Desktop/ScreenShotsForTest/Element Screenshot Of " + dtf.format(dateTime) + ".png"));
        } catch (IOException e) {

        }
    }

    public static void getPageScreenShot(WebDriver driver) {

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(" MMMM/ dd, hh.mm a");

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("/Users/egemeneliz/Desktop/ScreenShotsForTest/Screenshot Of " + dtf.format(dateTime) + ".png"));
        } catch (IOException e) {
        }
    }
}
