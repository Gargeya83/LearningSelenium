package com.testwithgargeya.ex02_Selenium_Basics;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium002_BasicSelenium {
    public static void main(String[] args) {

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://google.com");// This is your source code
    }
}