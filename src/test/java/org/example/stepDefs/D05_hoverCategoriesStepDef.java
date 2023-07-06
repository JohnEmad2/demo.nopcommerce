package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.example.stepDefs.Hooks.driver;
public class D05_hoverCategoriesStepDef {

    SoftAssert soft = new SoftAssert();

    P03_homePage hoverCategoriesS = new P03_homePage();

    Actions action = new Actions(driver);
    int count = hoverCategoriesS.maincategories.size();
    int min = 0;
    int max = count-1;
    int selectedCategory =  (int)Math.floor(Math.random()*(max-min+1)+min);


    @And("user selects random one of the three main categories")
    public void userSelectsRandomOneOfTheThreeMainCategories() throws InterruptedException  {


        System.out.println(selectedCategory);
        action.moveToElement(hoverCategoriesS.maincategories.get(selectedCategory)).perform();
        String selectedCategoryText = hoverCategoriesS.maincategories.get(selectedCategory).getText();
        System.out.println("to know which category is selected:   " +selectedCategoryText);
        Thread.sleep(1000);

        //hoverCategoriesS.maincategories.get(selectedUser).perform();

    }


    @And("user should hover on the selected category")
    public void userShouldHoverOnTheSelectedCategory() {
        String locator = "hoverCategoriesS.dropCategories";
        List<WebElement> subCategoryLinks = driver.findElements(By.cssSelector(locator));
        String selectedSubCategoryText;
        if(!subCategoryLinks.isEmpty()) {
            int subCategoryCount = subCategoryLinks.size();
            int selectedSubCategory = (int) Math.floor(Math.random() * (max - min + 1) + min);
            selectedSubCategoryText = subCategoryLinks.get(selectedSubCategory).getText();
            subCategoryLinks.get(selectedSubCategory).click();
            String acctext = hoverCategoriesS.Titles.getText();
            soft.assertEquals(selectedSubCategoryText.trim().toLowerCase(),acctext.trim().toLowerCase());
            soft.assertAll();
            System.out.println(acctext);

        }
        else
        {
            hoverCategoriesS.maincategories.get(selectedCategory).click();
            String acctextA = hoverCategoriesS.Titles.getText();
            String expectedText = hoverCategoriesS.maincategories.get(selectedCategory).getText();
            soft.assertEquals(acctextA.trim().toLowerCase(),expectedText.trim().toLowerCase());
            soft.assertAll();
            System.out.println(acctextA);

            // Do your assertion on selected main category
        }

        // reset it to the initial value
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @And("after hovering, user selects random one of the three sub categories")
    public void afterHoveringUserSelectsRandomOneOfTheThreeSubCategoriesLike()  {

       // Actions action = new Actions(driver);

        //int count = hoverCategoriesS.categories.size();



       // int min = 0;
       // int max = count-1;   // you are selecting random value from 0 to 2 that's why  max = count-1
       // int selectedUser =  (int)Math.floor(Math.random()*(max-min+1)+min);
       // System.out.println(selectedUser);



    }
//SoftAssert soft = new SoftAssert();
    @Then("Chosen categories")
    public void chosenCategories() {




//if (hoverCategoriesS.Titles.size() > 0) {
            // If the selected category contains sub-categories, click on a random sub-category
            //WebElement randomSubCategory = hoverCategoriesS.Titles.get(new Random().nextInt(hoverCategoriesS.Titles.size()));
          //  String subCategoryName = randomSubCategory.getText();
          //  randomSubCategory.click();

            // Assert that the opened page contains the sub-category name
          //  Assert.assertTrue(driver.getTitle().contains(subCategoryName));
       // } else {
            // If the selected category doesn't contain sub-categories, click on the main category itself
         //   String categoryName = selectedCategory.getText();
         //   selectedCategory.click();

            // Assert that the opened page contains the main category name
         //   Assert.assertTrue(driver.getTitle().contains(categoryName));
        //}
    }

}
