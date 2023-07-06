package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class D03_currenciesStepDef {
P03_homePage homepage = new P03_homePage();
@Given("user select euro currency")
    public void euro(){
    Select euro = new Select(homepage.currencyList);
    euro.selectByIndex(1);

}


    @Then("euro symbol shows on the products displayed in Home page")
    public void euroSymbolShowsOnTheProductsDisplayedInHomePage() {
   int x = homepage.prices.size();
   for (int i=0; i<x; i++)
        {
            String price = homepage.prices.get(i).getText();
            System.out.println(i);
            System.out.println(price);
            Assert.assertTrue(price.contains("€"));
        }

    }



}
