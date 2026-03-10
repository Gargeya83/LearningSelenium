package com.testwithgargeya.ex06_Input_Select_Alerts_Radio;

import com.testwithgargeya.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium025_Input_Checkbox_Radio extends CommonToAll {
    @Description("This is description")
    @Test
    public void test_HTMLTags() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        // Input
        // WebElement firstname = driver.findElement(By.name("firstname"));
        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("Hello jarvis");


        // Radio
        WebElement radiobutton = driver.findElement(By.xpath("//input[@id='sex-1']"));
        radiobutton.click();

        // Checkbox
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='tool-0']"));
        checkbox.click();

        closeBrowser(driver);




    }


}
