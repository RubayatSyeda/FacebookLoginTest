package facebookTest;


import org.openqa.selenium.TakesScreenshot;
import pages.FacebookHomePage;

import org.testng.annotations.Test;
import reusables.testingBase;

public class loginPageTest extends testingBase {
    FacebookHomePage facebookhomePage;

    @Test
    public void verifyLogin() throws InterruptedException {
       facebookhomePage = new FacebookHomePage(getDriver());

        facebookhomePage.enterUsername("syedaRubayat@gmail.com");
        facebookhomePage.enterPassword("1234567890");
        facebookhomePage.clickSignInButton();

        Thread.sleep(4000);
    }


}


