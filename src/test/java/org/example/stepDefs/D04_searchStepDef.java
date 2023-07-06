package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.security.Key;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import static org.example.stepDefs.Hooks.driver;

public class D04_searchStepDef {
    P03_homePage search = new P03_homePage();
    @When("users enter product name {string} to search")
    public void usersEnterProductNameToSearch(String arg0)
    {
        search.searching.sendKeys(arg0);
    }

    @And("user click on search button")
    public void userClickOnSearchButton() {
        search.btn.click();
    }
    SoftAssert soft = new SoftAssert();

    @Then("user find relative product {string}")
    public void userFindRelativeProduct(String arg0) {
        driver.getCurrentUrl();
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://demo.nopcommerce.com/search?q=";
        boolean result = actualURL.contains(expectedURL);
        soft.assertTrue(result);
        soft.assertAll();





            int x = search.searchResult.size();
            for (int i=0; i<x; i++)
            {
                String results = search.searchResult.get(i).getText();
                System.out.println(i);
                System.out.println(results);
                soft.assertTrue(results.toLowerCase().contains(arg0));
            }

            int items = search.searchResult.size();
            System.out.println(items);

    }


















    @When("users enter product serial no {string} to search")
    public void usersEnterProductSerialNoToSearch(String arg0) {

        search.searching.sendKeys(arg0);
        System.out.println(driver.getCurrentUrl());


    }


    @When("And user click on search button")
    public void andUserClickOnSearchButton() {
        search.btn.click();

    }


    @Then("user find relative products {string}")
    public void userFindRelativeProducts(String arg0) {


        int x = search.products.size();
        for (int i = 0; i < x; i++) {
            String results = search.products.get(i).getText();
            System.out.println(i);
            System.out.println(results);
            soft.assertTrue(results.toLowerCase().contains("arg0"));

            search.products.get(i).click();

            // Verify that the product page has loaded

            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

            //Assert.assertTrue(search.SKU.getText().toLowerCase().contains(arg0));



        }
            //int items = search.products.size();
           // System.out.println(items);

        String accSku = search.SKU.getText().toLowerCase();
        boolean result  = accSku.contains(arg0.toLowerCase());
        Assert.assertTrue(result);




          //Loop through each product and open its page



        }


    }

// if (search.productA.isDisplayed() == true) {
//     search.productA.click();
// }


// else if (search.productB.isDisplayed() == true){

//   search.productB.click();


//  }
