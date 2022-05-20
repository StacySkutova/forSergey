package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends FactoryPage {
    @FindBy(className = "bem-header__list-link")
    private WebElement wishListLink;

    @FindBy(id = "truste-consent-button")
    private WebElement acceptClick;

    @FindBy(xpath = "//a[contains(text(),'Start shopping')]")
    private WebElement startShoppingLink;

    public boolean isWishlistContainerDisplayed() {
        return wishListLink.isDisplayed();
    }

    public void clickAcceptCookies() {
        acceptClick.click();
    }

    public void clickOnStartShopping() {
        startShoppingLink.click();
    }
}
