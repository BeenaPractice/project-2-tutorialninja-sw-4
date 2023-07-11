package com.tutorialninja.testsuite;

import com.tutorialninja.pages.LaptopAndNotebookPage;
import com.tutorialninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LapTopAndNoteBookTest extends BaseTest {

    LaptopAndNotebookPage laptop = new LaptopAndNotebookPage();
    //1. Test name verifyProductsPriceDisplayHighToLowSuccessfully()
    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        //1.1 Mouse hover on Laptops & Notebooks Tab.and click
        laptop.clickOnLapTopsAndNotebooks();

        //1.2 Click on “Show All Laptops & Notebooks”
        laptop.clickOnShowAllLaptopAndNoteBook();

        // 1.3 Select Sort By "Price (High > Low)"
        laptop.sortByPriceHighToLow();

        //  1.4 Verify the Product price will arrange in High to Low order.
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);

        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);

        //1.3 Select Sort By "Price (High > Low)"
        laptop.sortByPositionName("Price (High > Low)");

        // After filter Price (High > Low) Get all the products price and stored into array list
        products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(afterSortByPrice);

        //1.4 Verify the Product price will arrange in High to Low order.
        Assert.assertEquals(originalProductsPrice, afterSortByPrice);

    }
    @Test
       //    2. Test name verifyThatUserPlaceOrderSuccessfully()
    public void verifyThatUserPlaceOrderSuccessfully ()throws InterruptedException {

        //2.1 Mouse hover on Laptops & Notebooks Tab.and click
        laptop.clickOnLapTopsAndNotebooks();

        //2.2 Click on “Show All Laptops & Notebooks”
        laptop.clickOnShowAllLaptopAndNoteBook();

        //   2.3 Select Sort By "Price (High > Low)"
        laptop.sortByPriceHighToLow();

        //    2.4 Select Product “MacBook”
        laptop.selectMacBook();

        //   2.5 Verify the text “MacBook”
        String expectedTextFromMacbook = "MacBook";
        String actualTextFromMacbook = laptop.textFromMacbookPage();
        Assert.assertEquals(actualTextFromMacbook,expectedTextFromMacbook);

       //    2.6 Click on ‘Add To Cart’ button
        laptop.clickOnAddToCart();

       //   2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        String expectedMessage = "Success: You have added MacBook to your shopping cart!";
        String actualMessage = laptop.getMessageFromAddToCart();
       // verifyText(driver, By.xpath("//div[@class='alert alert-success alert-dismissible']"),"Success: You have added MacBook to your shopping cart!");
      //      2.8 Click on link “shopping cart” display into success message
        laptop.clickOnShoppingCart();

//        //2.9 Verify the text "Shopping Cart"
//        verifyText(driver,By.xpath("//h1[contains(text(),'Shopping Cart')]"),"Shopping Cart");

        //    2.10 Verify the Product name "MacBook"
        String actualProductName = "MacBook";
        String expectedProductName = laptop.verifyProductName();
        Assert.assertEquals(actualProductName,expectedProductName);

          //  2.11 Change Quantity "2"
        laptop.mouseHooverToChangeQty();
        laptop.changeQtyOnShoppingCart();

          //    2.12 Click on “Update” Tab
        laptop.clickOnUpdateTab();

        //2.13 Verify the message “Success: You have modified your shopping cart!”
        String expectedModifiedMessage = "Success: You have modified your shopping cart!";
        String actualModifiedMessage = laptop.modifiedMessageFrom();
     //   Assert.assertEquals(actualModifiedMessage,expectedModifiedMessage);
       //    2.14 Verify the Total £737.45
        String expectedTotal = "£737.45";
        String actualTotal = laptop.verifyTotalFrom();
      //  Assert.assertEquals(actualTotal,expectedTotal);

       //     2.15 Click on “Checkout” button
        laptop.mouseHooverOnCheckOutButton();
        laptop.clickOnCheckOutButton();

       //2.16 Verify the text “Checkout”
        String expectedCheckOutText = "Checkout";
        String actualCheckOutText = laptop.verifyCheckOutText();
        Assert.assertEquals(actualCheckOutText,expectedCheckOutText);

          //  2.17 Verify the Text “New Customer”
        String expectedCustomerText = "New Customer";
        String actualCustomerText = laptop.verifyNewCustomer();
     //   Assert.assertEquals(actualCustomerText,expectedCustomerText);

      //      2.18 Click on “Guest Checkout” radio button
        laptop.clickOnGuestCheckOutRadioButton();

        //2.19 Click on “Continue” tab
        laptop.clickOnContinueTab();

       //2.20 Fill the mandatory fields
        laptop.insertDetails();

        //2.21 Click on “Continue” Button
        laptop.clickOnContinueButton();

       //2.22 Add Comments About your order into text area
        laptop.inserText();

        //2.23 Check the Terms & Conditions check box
        laptop.clickOnTermsAndConditions();

        //2.24 Click on “Continue” button
        laptop.clickOnPaymentContinue();

        //2.25 Verify the message “Warning: Payment method required!”
        String expectedWarningMessage = "Warning: No Payment options are available. Please contact us for assistance!";
        String actualWarningMessage = laptop.getMessageFromWarning();
        Assert.assertEquals(actualWarningMessage,expectedWarningMessage);

    }
}

