package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorypages.NewCustomerEmailValidation;
import com.stv.factory.factorypages.NewCustomerPage;
import com.stv.factory.factorypages.WishListPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL_WISHLIST;


public class IndividualTaskSteps extends BasicFactoryTest {
    WishListPage wishListPage = new WishListPage();
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    NewCustomerEmailValidation newCustomerEmailValidation = new NewCustomerEmailValidation();
    NewCustomerPage newCustomerPage = new NewCustomerPage();


    @Given("^User is on Wishlist page$")
    public void NavigationPanelIsVisible() {
        getDriver().get(START_URL_WISHLIST);
        getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        try {
            wishListPage.clickAcceptCookies();
        } catch (NoSuchElementException e) {
            return;
        }
        getDriver().manage().window().maximize();
    }

    @When("Push Start shopping button")
    public void userPushStartShopping() {
        getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wishListPage.clickOnStartShopping();
    }

    @And("Push Your account link")
    public void pushYourAccountButton() {
        getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        mainFactoryPage.clickOnAccountLink();
    }

    @And("Type {string} address for customer")
    public void typeAddressForCustomer(String email) {
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        newCustomerEmailValidation.clickOnInputEmail(email);
    }

    @And("Click Continue button")
    public void checkContinueButton() {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        newCustomerEmailValidation.clickOnContinueButton();
    }

    @Then("Check New customer page is opened")
    public void checkNewCustomerPageIsOpened() {
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        newCustomerPage.isNewCustomerPageDisplayed();
        newCustomerPage.openMainPage();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mainFactoryPage.clickOnWishlist();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
