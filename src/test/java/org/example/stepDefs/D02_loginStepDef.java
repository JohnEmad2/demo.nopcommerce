package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import java.awt.*;


public class D02_loginStepDef {
    P02_login loginpage = new P02_login();
    @Given("User login tap")
    public void userGoToLogin(){
   loginpage.loginTap.click();

    }


    @And("user enter valid email and password")
    public void userEnterValidEmailAndPassword() {

        loginpage.mail.sendKeys("test2@example.com");
        loginpage.Password.sendKeys("P@ssw0rd");
    }


    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {

        loginpage.login.click();

    }


    @And("user login with invalid email and password")
    public void userLoginWithInvalidEmailAndPassword() {
     loginpage.invalidEmail.sendKeys("Wrong@example.com");
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        loginpage.password.sendKeys("P@ssw0rd");

    }
    SoftAssert soft = new SoftAssert();
    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        loginpage.loginbutn.click();
    String acctext = loginpage.result.getText();
    String exptext = "Login was unsuccessful";
    boolean result = acctext.contains(exptext);
    soft.assertTrue(result);


   soft.assertEquals(loginpage.result.getCssValue("color"),"rgba(228, 67, 75, 1)");


    soft.assertAll();


    }
}
