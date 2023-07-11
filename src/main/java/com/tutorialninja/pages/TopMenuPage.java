package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopMenuPage extends Utility {
    public void selectMenu(String menu) {
        List<WebElement> topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }

    By desktopLink = By.linkText("Desktops");
    By desktopsText = By.xpath("//h2[contains(text(),'Desktops')]");
    By laptopAndNotebook = By.xpath("//a[normalize-space()='Laptops & Notebooks']");
    By laptopAndNoteBookText = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    By components = By.xpath("//a[normalize-space()='Components']");
    By componentText = By.xpath("//h2[contains(text(),'Components')]");
        public String verifyDesktopsText() {
        return getTextFromElement(desktopsText);
    }
    public void mouseHoverOnDesktops() {
        mouseHoverToElementAndClick(desktopLink);
    }
    public void mouseHoverOnLaptopAndNotebook() {
        mouseHoverToElementAndClick(laptopAndNotebook);
    }
    public String verifytextlaptopAndNoteBookText(){
        return getTextFromElement(laptopAndNoteBookText);
    }
    public void mouseHoverOnComponents() {
        mouseHoverToElementAndClick(components);
    }
    public String getTextFromComponent(){
        return getTextFromElement(componentText);
    }
}
