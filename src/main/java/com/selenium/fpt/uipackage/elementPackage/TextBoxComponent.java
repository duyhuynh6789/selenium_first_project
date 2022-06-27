package com.selenium.fpt.uipackage.elementPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TextBoxComponent {
    WebDriver driver;

    public TextBoxComponent(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//input[@id=\"userName\"]")
    @CacheLookup
    public WebElement fullName;

    @FindBy(how = How.XPATH, using = "//input[@id=\"userEmail\"]")
    @CacheLookup
    public WebElement email;

    @FindBy(how = How.XPATH, using = "//textarea[@id=\"currentAddress\"]")
    @CacheLookup
    public WebElement currentAddress;

    @FindBy(how = How.XPATH, using = "//textarea[@id=\"permanentAddress\"]")
    @CacheLookup
    public WebElement permanentAddress;

    @FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")
    @CacheLookup
    WebElement buttonSumit;

    @FindBy(how = How.XPATH, using = "//p[@id=\"name\"]")
    @CacheLookup
    public WebElement nameLbl;

    @FindBy(how = How.XPATH, using = "//p[@id=\"email\"]")
    @CacheLookup
    public WebElement emailLbl;

    @FindBy(how = How.XPATH, using = "//p[@id=\"currentAddress\"]")
    @CacheLookup
    public WebElement currentAddressLbl;

    @FindBy(how = How.XPATH, using = "//p[@id=\"permanentAddress\"]")
    @CacheLookup
    public WebElement permanentAddressLbl;

    public void submitForm() {
        buttonSumit.click();
    }

}
