package com.coneon.automation.ui.tests;

import com.coneon.automation.ui.base.BaseTest;
import com.coneon.automation.ui.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.coneon.automation.ui.config.Config;


public class LoginTest extends BaseTest {

    @Test
    public void testLoginWithMobile() {

   
        // @BeforeMethod runs automatically

        driver.get(Config.LOGIN_URL);

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterMobile("9876543210");
        loginPage.clickSendOtp();

        // wait for redirect
        loginPage.waitForOtpPage();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(
                currentUrl.contains("/otp"),
                "User not redirected to OTP page. URL: " + currentUrl
        );

        System.out.println("Redirected to OTP page successfully");
    }
}
