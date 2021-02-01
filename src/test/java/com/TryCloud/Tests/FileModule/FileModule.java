package com.TryCloud.Tests.FileModule;

import com.TryCloud.Pages.FilePage;
import com.TryCloud.Pages.HomePage;
import com.TryCloud.Tests.Base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileModule extends TestBase {

    @Test
    public void accesToFileModule(){
        HomePage hp = new HomePage(driver);
        hp.files().click();
        //TODO ADD EXPECTED TITLE
        Assert.assertEquals(driver.getTitle(),"");
    }
    @Test
    public void selectAllFiles(){
        FilePage fP = new FilePage(driver);
        fP.selectAllFiles().click();

    }


}
