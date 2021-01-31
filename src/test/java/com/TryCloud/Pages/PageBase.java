package com.TryCloud.Pages;

import com.Utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase {

    public PageBase() {
        PageFactory.initElements(Driver.getDriver("chrome"),this);
    }
}
