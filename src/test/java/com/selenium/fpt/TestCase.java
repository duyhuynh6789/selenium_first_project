package com.selenium.fpt;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.selenium.fpt.common.Helper;
import com.selenium.fpt.uipackage.ElementPage;
import com.selenium.fpt.uipackage.HomePage;
import com.selenium.fpt.uipackage.elementPackage.TextBoxComponent;

public class TestCase extends Helper {
    @Test
    public void f() {
        try {
            driver.get("https://demoqa.com/");
            HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.clickElement();
            ElementPage elementPage = PageFactory.initElements(driver, ElementPage.class);
            elementPage.TextBoxElementClick();
            TextBoxComponent txtBoxCpmt = PageFactory.initElements(driver, TextBoxComponent.class);
            String fullName = "DuyHV";
            String email = "duyhv@fsoft.com.vn";
            String cAddress = "DuyHV - Address 1";
            String pAddress = "DuyHV - Address 2";
            enterText(txtBoxCpmt.fullName, fullName);
            Thread.sleep(2000);
            enterText(txtBoxCpmt.email, email);
            Thread.sleep(2000);
            enterText(txtBoxCpmt.currentAddress, cAddress);
            Thread.sleep(2000);
            enterText(txtBoxCpmt.permanentAddress, pAddress);
            Thread.sleep(2000);
            txtBoxCpmt.submitForm();

            verify(txtBoxCpmt.nameLbl, "Name:" + fullName);
            verify(txtBoxCpmt.emailLbl, "Email:" + email);
            verify(txtBoxCpmt.currentAddressLbl, "Current Address :" + cAddress);
            verify(txtBoxCpmt.permanentAddressLbl, "Permananet Address :" + pAddress);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
