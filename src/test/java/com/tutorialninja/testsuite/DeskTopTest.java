package com.tutorialninja.testsuite;

import com.tutorialninja.pages.DeskTopPage;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeskTopTest extends BaseTest {
    DeskTopPage deskTopPage = new DeskTopPage();

    @Test
    //   1.Test name verifyProductArrangeInAlphabeticalOrder()
    public void verifyProductArrangeInAlphabeticalOrder() {
        //1.1 Mouse hover on Desktops Tab.and click
        deskTopPage.mouseHooverOnDeskTop();
        deskTopPage.clickOnDeskTop();


        //1.2 Click on “Show All Desktops”
        deskTopPage.clickOnShowAllDeskTops();
        // 1.3 Select Sort By position "Name: Z to A"
        deskTopPage.clickOnSortBy();
        deskTopPage.selectSortByPosition();

        // 1.4 Verify the Product will arrange in Descending order.

    }


    //2. Test name verifyProductAddedToShoppingCartSuccessFully()
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
        // 2.1 Mouse hover on Desktops Tab.and click
        deskTopPage.mouseHooverOnDeskTop();
        deskTopPage.clickOnDeskTop();

        //  2.2 Click on “Show All Desktops”
        deskTopPage.clickOnShowAllDeskTops();

        //  2.3 Select Sort By position "Name: A to Z"
        deskTopPage.clickOnSortBy();
        deskTopPage.selectSortByPositionZToA();

        //   2.4 Select product “HP LP3065”
        deskTopPage.clickOnLP3065();

        // 2.5 Verify the Text "HP LP3065"
        String expectedTextFromLP3065 = "HP LP3065";
        String actualTextFromLP3065 = deskTopPage.getTextFromProductLP3065();
        Assert.assertEquals(actualTextFromLP3065, expectedTextFromLP3065);

        // 2.6 Select Delivery Date "2022-11-30"
        deskTopPage.selectDateForLP3065();


       // 2.7.Enter Qty "1” using Select class.
        deskTopPage.enterQtyForLP3065();


        // 2.8 Click on “Add to Cart” button
        deskTopPage.addTOCartLP3065();

        // 2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart !”
        String expectedMessageFromLP3065 = "Success: You have added HP LP3065 to your shopping cart !";
        String actualMessageFromLP3065 = deskTopPage.getTextFromVerifyMessageForLP3065();
        // Assert.assertEquals(actualMessageFromLP3065,expectedMessageFromLP3065);


        // 2.10 Click on link “shopping cart”display into success message
        deskTopPage.mouseHooverOnShoppingCartAndClick();


        // 2.11 Verify the text "Shopping Cart"
        String expectedTextFromShoppingCart = "Shopping Cart";
        String actualTextFromShoppingCart = deskTopPage.getTextFromShoppingCart();
        // Assert.assertEquals(actualTextFromShoppingCart,expectedTextFromShoppingCart);


       // 2.12 Verify the Product name "HP LP3065"
        String expectedName = "HP LP3065";
        String actualName = deskTopPage.verifyProductName();
        Assert.assertEquals(actualName, expectedName);

        // 2.13 Verify the Delivery Date "2022-11-30"
        String expectedDeliveryDate = "Delivery Date:2011-04-22";
         String actualDeliveryDate = deskTopPage.dateOnShoppingCart();
        //  Assert.assertEquals(actualDeliveryDate,expectedDeliveryDate);

          // 2.14 Verify the Model "Product21"
        String actualProductName = deskTopPage.verifyProductName();
        String expectedProductName = "Product 21";
        Assert.assertEquals(actualProductName, expectedProductName);

        //2.15 Verify the Todat "$122.22"
        String expectedTotal = "$122.22";
        String actualTotal = deskTopPage.getTotalFromCart();
        Assert.assertEquals(actualTotal, expectedTotal);
    }
}