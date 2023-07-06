package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;
public class D08_WishlistStepDef {

        P03_homePage wishList = new P03_homePage();
        @Given("user clicks on the wishlist of a product")
        public void userClicksOnTheWishListOfAProduct() {

          wishList.HTC.get(2).click();

        }
    SoftAssert soft = new SoftAssert();

    @And("verify success message and background")
    public void verifySuccessMessageAndBackground() {

        SoftAssert soft = new SoftAssert();

           String accColor = wishList.color.getCssValue("background-color");
           System.out.println(accColor);
           String actualColorHex = Color.fromString(accColor).asHex();
        soft.assertEquals(actualColorHex,"#4bb07a");
        soft.assertEquals(accColor,"rgba(75, 176, 122, 1)");


        soft.assertAll();
    }

    @And("user checks the wishlist")
    public void userChecksTheWishlist() {
WebDriverWait Explicet = new WebDriverWait(driver,Duration.ofSeconds(5));
        Explicet.until(ExpectedConditions.invisibilityOf(wishList.color));
        wishList.wishlistBTN.click();



    }

    @And("remove the item")
    public void removeTheItem() {
        int Accqty = Integer.parseInt(wishList.QTY.getAttribute("value"));
        soft.assertTrue(Accqty >0);
        System.out.println(Accqty);
        soft.assertAll();
    }

    @Then("user checks the wishlist get empty")
    public void userChecksTheWishlistGetEmpty() {

        wishList.cancel.click();

        String accText = wishList.msg.getText();
        String expText = "The wishlist is empty!";
        boolean result = accText.contains(expText);
        soft.assertAll();
    }
}
