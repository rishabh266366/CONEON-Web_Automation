package com.coneon.automation.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By mobileField = By.id("mobile");
    private By sendOtpButton = By.cssSelector("button.btn-submit");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void enterMobile(String mobileNumber) {
        WebElement mobileInput =
                wait.until(ExpectedConditions.visibilityOfElementLocated(mobileField));
        mobileInput.clear();
        mobileInput.sendKeys(mobileNumber);
    }

    public void clickSendOtp() {
        WebElement button =
                wait.until(ExpectedConditions.elementToBeClickable(sendOtpButton));
        button.click();
    }

    // New Method
    public void waitForOtpPage() {
        wait.until(ExpectedConditions.urlContains("/otp"));
    }
}
