package com.selenium.fpt.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory {
    public static WebDriver driver;

    public BrowserFactory() {
    }

    @SuppressWarnings("deprecation")
    public static WebDriver getDriver() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            options.setPageLoadStrategy(PageLoadStrategy.NONE);
            System.setProperty("webdriver.chrome.driver", "E:/Selenium/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
        }
        return driver;
    }
}
