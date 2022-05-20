package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustomerEmailValidation extends FactoryPage {
    @FindBy(xpath = "//input[@id = 'DualRegisterEmailModel_Email']")
    private WebElement dualRegisterEmailModelEmail;

    @FindBy(xpath = "//button[@id = 'qa-dual-register'] ")
    private WebElement qaDualRegister;

    public void clickOnInputEmail(String email) {
        dualRegisterEmailModelEmail.sendKeys(email);
    }

    public void clickOnContinueButton() {
        qaDualRegister.click();
    }
}
