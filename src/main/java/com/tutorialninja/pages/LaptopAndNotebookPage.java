package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopAndNotebookPage extends Utility {
    By lapTopsAndNoteBooks = By.xpath("//a[normalize-space()='Laptops & Notebooks']");
    By showAllLaptopAndNoteBook = (By.xpath("//a[normalize-space()='Show AllLaptops & Notebooks']"));
    By sortPriceHighToLow = By.xpath("//select[@id='input-sort']");
    By sort= By.xpath("//select[@id='input-sort']");
    By productMacBook = By.xpath("//img[@title='MacBook']");
    By textFromMacBook = By.xpath("//h1[normalize-space()='MacBook']");
    By addToCart = (By.xpath("//button[@id='button-cart']"));
    By verifyMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By shoppingCart = By.xpath("//a[text()='shopping cart']");
    By productName = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
    By changeQty = By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]");
    By updateTab = (By.xpath("//button[@type='submit']"));
    By modifiedMessage = By.xpath("//body/div[@id='checkout-cart']/div[1]");
    By verifyTotal = By.xpath("//tbody//tr//td[6]");
    By checkOutButton = (By.xpath("//a[@class='btn btn-primary']"));
    By verifyCheckOut = By.xpath("//h1[contains(text(),'Checkout')]");
    By newCustomer = By.xpath("//h2[normalize-space()='New Customer']");
    By guestCheckoutRadioButton = By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/label[1]/input[1]");
    By continueTab = (By.xpath("//input[@id='button-account']"));
    By inputFirstName = By.xpath("//input[@id='input-payment-firstname']");
    By inputLastName = By.xpath("//input[@id='input-payment-lastname']");
    By inputEmail = By.xpath("//input[@id='input-payment-email']");
    By inputPhone = By.xpath("//input[@id='input-payment-telephone']");
    By inputAddress = By.xpath("//input[@id='input-payment-address-1']");
    By inputCity = By.xpath("//input[@id='input-payment-city']");
    By inputPostCode = By.xpath("//input[@id='input-payment-postcode']");
    By inputCountry = By.xpath("//select[@id='input-payment-country']");
    By inputRegion = By.xpath("//select[@id='input-payment-zone']");

    By continueButton = By.xpath("//input[@id='button-guest']");
    By termsAndConditions = By.xpath("//input[@name='agree']");
    By insertTextArea = (By.xpath("//textarea[@name='comment']"));
    By paymentContinue = By.id("button-payment-method");
    By warningMessage = By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]");

    public void clickOnLapTopsAndNotebooks(){
        mouseHoverToElementAndClick(lapTopsAndNoteBooks);
    }
    public void clickOnShowAllLaptopAndNoteBook(){
        clickOnElement(showAllLaptopAndNoteBook);
    }
    public void sortByPositionName(String name) {
        selectByVisibleTextFromDropDown(sort, name);
    }
    public void sortByPriceHighToLow(){
        mouseHoverToElement(sortPriceHighToLow);
        selectByVisibleTextFromDropDown(sortPriceHighToLow,"Price (High > Low)");
    }
    public void selectMacBook(){
        mouseHoverToElement(productMacBook);
        clickOnElement(productMacBook);
    }
    public String textFromMacbookPage(){
        return getTextFromElement(textFromMacBook);
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public String getMessageFromAddToCart(){
        return getTextFromElement(verifyMessage);
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCart);
    }
    public String verifyProductName(){
        return getTextFromElement(productName);
    }
    public void mouseHooverToChangeQty(){
        mouseHoverToElement(changeQty);
    }


    public void changeQtyOnShoppingCart(){

        sendTextToElement(changeQty,"2");
    }
    public void clickOnUpdateTab(){
        clickOnElement(updateTab);
    }
    public String modifiedMessageFrom(){
        return getTextFromElement(modifiedMessage);
    }
    public String verifyTotalFrom(){
        return getTextFromElement(verifyTotal);
    }
    public void mouseHooverOnCheckOutButton(){
        mouseHoverToElement(checkOutButton);
    }
    public void clickOnCheckOutButton(){
        clickOnElement(checkOutButton);
    }
    public String verifyCheckOutText(){
        return getTextFromElement(verifyCheckOut);
    }
    public String verifyNewCustomer(){
        return getTextFromElement(newCustomer);
    }
    public void clickOnGuestCheckOutRadioButton(){
        clickOnElement(guestCheckoutRadioButton);
    }
    public void clickOnContinueTab(){
        clickOnElement(continueTab);
    }
    public void insertDetails() throws InterruptedException {
        sendTextToElement(inputFirstName, "Prime");
        sendTextToElement(inputLastName, "Testing");
        sendTextToElement(inputEmail, "prime1@gmail.com");
        sendTextToElement(inputPhone, "0123456789");
        sendTextToElement(inputAddress, "23 Bury Lane");
        sendTextToElement(inputCity, "London");
        sendTextToElement(inputPostCode, "WD3 1ED");
        Thread.sleep(3000);
       // sendTextToElement(inputCountry,"United Kingdom");
        mouseHoverToElement(inputRegion);
        selectByVisibleTextFromDropDown(inputRegion,"Aberdeen");
    }


    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public void clickOnTermsAndConditions(){
        clickOnElement(termsAndConditions);
    }
    public void inserText(){
        sendTextToElement(insertTextArea,"Thank You");
    }
    public void clickOnPaymentContinue(){
        clickOnElement(paymentContinue);
    }
    public String getMessageFromWarning(){
        return getTextFromElement(warningMessage);
    }
}




