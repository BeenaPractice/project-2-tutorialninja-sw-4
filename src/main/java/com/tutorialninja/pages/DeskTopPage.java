package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class DeskTopPage extends Utility {

    By deskTop = (By.xpath("//a[normalize-space()='Desktops']"));
    By showAllDeskTop = By.xpath("//a[normalize-space()='Show AllDesktops']");
    By sortByPosition = By.xpath("//select[@id='input-sort']");
    By prductLP3065 = (By.xpath("//img[@title='HP LP3065']"));
    By LP3065Text = By.xpath("//h1[normalize-space()='HP LP3065']");
    By selectDate = (By.xpath("//input[@id='input-option225']"));
    By enterQtyForLP3065 = (By.xpath("//input[@id='input-quantity']"));
    By addToCartLP3065 = (By.xpath("//button[@id='button-cart']"));
  //  By getTextFromVerifyMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']//a[contains(text(),'HP LP3065')]");
    By getGetTextFromVerifyMessage =By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By shoppingCartLink = (By.xpath("//a[normalize-space()='shopping cart']"));
    By verifyMessageShoppingCart = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By verifyProductName = By.linkText("HP LP3065");

    By getDateFromShoppingCart = By.xpath("//small[contains(text(),'Delivery Date:2011-04-22')]");
    By verifyModel = By.xpath(" //td[contains(text(),'Product 21')]");
    By verifyTotal = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]");
    public void mouseHooverOnDeskTop(){
        mouseHoverToElement(deskTop);
    }
    public void clickOnDeskTop(){
        clickOnElement(deskTop);
    }
    public void clickOnShowAllDeskTops(){
        clickOnElement(showAllDeskTop);
    }
    public void clickOnSortBy(){
        clickOnElement(sortByPosition);
    }
    public void selectSortByPosition(){
        selectByVisibleTextFromDropDown(sortByPosition,"Name (Z - A)");
    }
    public void selectSortByPositionZToA(){
        selectByVisibleTextFromDropDown(sortByPosition,"Name (A - Z)");
    }
    public void clickOnLP3065(){
        clickOnElement(prductLP3065);
    }
    public String getTextFromProductLP3065(){
        return getTextFromElement(LP3065Text);
    }
    public void selectDateForLP3065(){
        sendTextToElement(selectDate,"30-11-22");
    }
    public void enterQtyForLP3065(){
        sendTextToElement(enterQtyForLP3065,"1");
    }
    public void addTOCartLP3065(){
        clickOnElement(addToCartLP3065);
    }
    public String getTextFromVerifyMessageForLP3065(){
        return getTextFromElement(getGetTextFromVerifyMessage);
    }
    public void mouseHooverOnShoppingCartAndClick(){
        mouseHoverToElementAndClick(shoppingCartLink);
    }
    public String getTextFromShoppingCart(){
        return getTextFromElement(verifyMessageShoppingCart);
    }
    public String verifyProductName(){
        return getTextFromElement(verifyProductName);
    }
    public String dateOnShoppingCart(){
        return getTextFromElement(getDateFromShoppingCart);
    }
    public String getProductName(){
        return getTextFromElement(verifyModel);
    }
    public String getTotalFromCart(){
        return getTextFromElement(verifyTotal);
    }

}
