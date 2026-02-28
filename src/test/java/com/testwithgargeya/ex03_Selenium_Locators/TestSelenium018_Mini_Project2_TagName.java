package com.testwithgargeya.ex03_Selenium_Locators;

import com.testwithgargeya.CommonToAll;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium018_Mini_Project2_TagName extends CommonToAll {

    @Owner("Gargeya")
    @Severity(SeverityLevel.BLOCKER)
    @TmsLink("https://bugz.atlassian.net/browse/BUG-17")
    @Description("Verify that the error message comes with invalid email on signup page.")
    @Test
    public void vwo_free_trail_error_verify() {
        WebDriver driver= new ChromeDriver();
        driver.get("https://app.vwo.com");

        WebElement a_Tag_free_trail_full_match = driver.findElement(By.linkText("Start a free trial"));
        a_Tag_free_trail_full_match.click();

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free trail"));

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");

        WebElement checkbox_policy = driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        checkbox_policy.click();

        WebElement button_create_account = driver.findElement(By.tagName("button"));
        button_create_account.click();

        WebElement error_message = driver.findElement(By.className("invalid-reason"));


        Assert.assertEquals(error_message.getText(),"The email address you entered is incorrect.");
    }
}
