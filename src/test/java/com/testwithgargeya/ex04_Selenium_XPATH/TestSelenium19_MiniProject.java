package com.testwithgargeya.ex04_Selenium_XPATH;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.testwithgargeya.CommonToAll;

public class TestSelenium19_MiniProject extends CommonToAll {
    @Owner("Gargeya")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify login is working")
    @Test
    public void test_OHRM_login() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        customWait(3000);

        WebElement input_username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement input_password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
        WebElement button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));

        input_username.sendKeys("Admin");
        input_password.sendKeys("admin123");
        button.click();

        customWait(3000);
        WebElement h6 = driver.findElement(By.xpath("//span[@class=\"oxd-topbar-header-breadcrumb\"]/h6"));
        Assert.assertEquals(h6.getText(), "Dashboard");

        closeBrowser(driver);

    }
}
