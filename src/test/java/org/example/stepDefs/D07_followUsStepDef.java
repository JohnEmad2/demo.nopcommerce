package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

import static org.example.stepDefs.Hooks.driver;

public class D07_followUsStepDef {
    P03_homePage follow = new P03_homePage();
    @Given("user opens facebook link")
    public void userOpensFacebookLink() {
        follow.facebook.click();



    }



    @And("{string} is opened in new tab")
    public void isOpenedInNewTab(String arg0) {
        System.out.println(driver.getCurrentUrl());

        WebDriverWait explicit = new WebDriverWait(driver, Duration.ofSeconds(10));
        explicit.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList <String> tabs = new ArrayList (driver.getWindowHandles());
        System.out.println("id of each tab" + tabs);
        driver.switchTo().window(tabs.get(1));
        System.out.println("url after moving to tab 1" + driver.getCurrentUrl());

        driver.getCurrentUrl();
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.facebook.com/nopCommerce";
        boolean result = actualURL.contains(expectedURL);
        Assert.assertTrue(result);

        driver.close();

        driver.switchTo().window(tabs.get(0));
        System.out.println(driver.getCurrentUrl());



    }

    @Given("user opens twitter link")
    public void userOpensTwitterLink() {
        follow.twitter.click();

    }

    @Then("{string} is opened in newTab")
    public void isOpenedInNewtab(String arg0) {
        System.out.println(driver.getCurrentUrl());

        WebDriverWait explicitA = new WebDriverWait(driver, Duration.ofSeconds(10));
        explicitA.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList <String> tabs = new ArrayList (driver.getWindowHandles());
        System.out.println("id of each tab" + tabs);
        driver.switchTo().window(tabs.get(1));
        driver.getCurrentUrl();
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://twitter.com/i/flow/login?redirect_after_login=%2FnopCommerce";
        boolean result = actualURL.contains(expectedURL);
        Assert.assertTrue(result);
        driver.close();

        driver.switchTo().window(tabs.get(0));
        System.out.println(driver.getCurrentUrl());




    }

    @Given("user opens rss link")
    public void userOpensRssLink() {
        follow.rss.click();

    }

    @Then("{string} is opened as a new tab")
    public void isOpenedAsANewTab(String arg0) {
        System.out.println(driver.getCurrentUrl());

        WebDriverWait explicit = new WebDriverWait(driver, Duration.ofSeconds(10));
        explicit.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList <String> tabs = new ArrayList (driver.getWindowHandles());
        System.out.println("id of each tab" + tabs);
        driver.switchTo().window(tabs.get(1));
        System.out.println("url after moving to tab 1" + driver.getCurrentUrl());

        driver.getCurrentUrl();
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://demo.nopcommerce.com/nopcommerce-new-release";
        boolean result = actualURL.contains(expectedURL);
        Assert.assertTrue(result);

        driver.close();

        driver.switchTo().window(tabs.get(0));
        System.out.println(driver.getCurrentUrl());
    }

    @Given("user opens youtube link")
    public void userOpensYoutubeLink() {
        follow.youtube.click();
    }

    @Then("{string} is opened in a new tab")
    public void isOpenedInANewTab(String arg0) {
        System.out.println(driver.getCurrentUrl());

        WebDriverWait explicit = new WebDriverWait(driver, Duration.ofSeconds(10));
        explicit.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList <String> tabs = new ArrayList (driver.getWindowHandles());
        System.out.println("id of each tab" + tabs);
        driver.switchTo().window(tabs.get(1));
        System.out.println("url after moving to tab 1" + driver.getCurrentUrl());

        driver.getCurrentUrl();
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.youtube.com/user/nopCommerce";
        boolean result = actualURL.contains(expectedURL);
        Assert.assertTrue(result);

        driver.close();

        driver.switchTo().window(tabs.get(0));
        System.out.println(driver.getCurrentUrl());
    }
}
