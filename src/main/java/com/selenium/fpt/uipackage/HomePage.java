/**
 * 
 */
package com.selenium.fpt.uipackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author This PC
 *
 */
public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5")
    @CacheLookup
    WebElement element;

    public void clickElement() {
        try {
            element.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
