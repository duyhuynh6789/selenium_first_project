package com.selenium.fpt.common;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Helper {
    public static WebDriver driver;
    BrowserFactory obj1;

    public Helper() {
    }

    @BeforeSuite
    public void beforeSuite() {

    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("in @BeforeClass");
    }

    @BeforeMethod
    public void beforeMethodClass() {
        System.out.println("in @BeforeMethod");
        Helper.driver = BrowserFactory.getDriver();

    }

    @AfterMethod
    public void close() {
        // this.driver.close();
    }

    @AfterClass
    public void afterClass() {

    }

    @AfterSuite
    public void afterSuite() throws IOException {
        driver.quit();
    }

    public void enterText(WebElement element, String text) {
        element.sendKeys(text);
    }

    public void verify(WebElement element, String text) {
        Assert.assertEquals(element.getText(), text);
    }
}
