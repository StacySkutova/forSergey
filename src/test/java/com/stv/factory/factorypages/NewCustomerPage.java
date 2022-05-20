package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustomerPage extends FactoryPage {
    @FindBy(className = "bem-checkout")
    private WebElement newCustomerPage;

    @FindBy(className = "bem-checkout__logo")
    private WebElement mainPage;

    public boolean isNewCustomerPageDisplayed() {
        return newCustomerPage.isDisplayed();
    }

    public void openMainPage() {
        mainPage.click();
    }
}
