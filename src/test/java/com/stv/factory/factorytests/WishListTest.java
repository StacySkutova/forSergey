package com.stv.factory.factorytests;

import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorypages.WishListPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WishListTest extends BasicFactoryTest{

    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @Test(description = "Assert the wishlist page is loaded")
    public void assertWishlistOpened() {
        mainFactoryPage.clickAccept();
        mainFactoryPage.clickOnWishlist();
        Assert.assertEquals(new WishListPage().isWishlistContainerDisplayed(), true, "Wishlist page isn't loaded properly");
//в конце работы программы стоит проверить существует ли объект и удалить его если это так
// для этого обнуляю объект и вызываю garbage collector для его утилизации
//если следующие две строчки закомментить то последний тест assertNull не будет пройден
        mainFactoryPage = null;
        System.gc();
        Assert.assertNull( mainFactoryPage,"Object is not null");
    }
}


