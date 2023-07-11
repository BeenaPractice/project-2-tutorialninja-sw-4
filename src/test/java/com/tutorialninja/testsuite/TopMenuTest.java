package com.tutorialninja.testsuite;

import com.tutorialninja.pages.TopMenuPage;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

        TopMenuPage topMenuPage = new TopMenuPage();

        @Test
                public void verifyUserShouldNavigateToDesktop() {
//1.1 Mouse hover on “Desktops” Tab and click
            topMenuPage.mouseHoverOnDesktops();

            //1.2 call selectMenu method and pass the menu = “Show All Desktops”
            topMenuPage.selectMenu("Show AllDesktops");

            //1.3 Verify the text ‘Desktops’
            String actualDesktopsText = topMenuPage.verifyDesktopsText();
            Assert.assertEquals(actualDesktopsText, "Desktops", "text not match");
        }
@Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        topMenuPage.mouseHoverOnLaptopAndNotebook();

        //2.2 call selectMenu method and pass the menu = “Show AllLaptops & Notebooks”
        topMenuPage.selectMenu("Show AllLaptops & Notebooks");
        
        // 2.3 Verify the text ‘Laptops & Notebooks’
        String expectedTextFromLaptopAndNoteBook = "Laptops & Notebooks";
        String actualTextFromLaptopAndNoteBook = topMenuPage.verifytextlaptopAndNoteBookText();
        Assert.assertEquals(actualTextFromLaptopAndNoteBook,expectedTextFromLaptopAndNoteBook);

    }

@Test
   public void  verifyUserShouldNavigateToComponentsPageSuccessfully() {

          //3.1 Mouse hover on “Components” Tab and click
        topMenuPage.mouseHoverOnComponents();
         //3.2 call selectMenu method and pass the menu = “Show All Components”
       topMenuPage.selectMenu("Show AllComponents");
       //   3.3 Verify the text ‘Components’
        String expectedTextFromComponent = "Components";
        String actualTextFromComponent = topMenuPage.getTextFromComponent();
       Assert.assertEquals(actualTextFromComponent,expectedTextFromComponent);
   }

   }













