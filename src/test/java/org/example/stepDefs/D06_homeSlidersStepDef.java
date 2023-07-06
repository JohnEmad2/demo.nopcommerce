package org.example.stepDefs;
import  static org.example.stepDefs.Hooks.driver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.example.pages.P02_login;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

public class D06_homeSlidersStepDef {
    P03_homePage sliders = new P03_homePage();
            @Given("user click on slider button")
    public void userClickOnSliderButton(){
            sliders.sliderA.click();
            }
SoftAssert soft = new SoftAssert();
    @And("user reviews the result of that click")
    public void userReviewsTheResultOfThatClick() {
        driver.getCurrentUrl();
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://demo.nopcommerce.com/nokia-lumia-1020";
        soft.assertEquals(actualURL, expectedURL);
        soft.assertAll();
    }

    @Given("user click on the second slider button")
    public void userClickOnTheSecondSliderButton() {
        sliders.sliderB.click();

    }

    @And("user reviews the second result of that click")
    public void userReviewsTheSecondResultOfThatClick() {
        driver.getCurrentUrl();
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://demo.nopcommerce.com/iphone-6";
        soft.assertEquals(actualURL, expectedURL);
        soft.assertAll();
    }
}
