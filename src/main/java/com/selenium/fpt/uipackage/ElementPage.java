package com.selenium.fpt.uipackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ElementPage {

    WebDriver driver;

    public ElementPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"item-0\"]")
    @CacheLookup
    WebElement textBoxElement;

    public void TextBoxElementClick() {
        try {
            textBoxElement.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
