package org.example.stepDefs;
import static org.example.stepDefs.Hooks.driver;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.example.pages.P01_register;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class D01_registerStepDef
{


P01_register register = new P01_register();

@Given("user go to register page")
public void go_to_register_page(){
    register.regi().click();

}


    @And("user select gender type")
    public void userSelectGenderType() {
       register.gender.click();
     }



    @And("user enter first name and last name")
    public void userEnterFirstNameAndLastName() {
        register.FirstName.sendKeys("automation");
        register.LastName.sendKeys("tester");
    }



    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        Select day = new Select(register.day);
        day.selectByValue("1");

        Select month = new Select(register.month);
        month.selectByValue("11");

        Select year = new Select(register.year);
        year.selectByValue("1996");
    }

    @And("user enter email field")

    public void userEnterEmailField() {

    register.email.sendKeys("test2@example.com");
    }


    @And("user fills Password fields")
    public void userFillsPasswordFields() {
   register.password.sendKeys("P@ssw0rd");
   register.ConfirmationPassword.sendKeys("P@ssw0rd");


    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
    register.registerButton.click();
    }


    SoftAssert soft = new SoftAssert();
    @And("success message is displayed")
    public void successMessageIsDisplayed() {
        SoftAssert soft = new SoftAssert();

        soft.assertEquals(register.result.getText(),"Your registration completed");
        soft.assertEquals(register.result.getCssValue("color"),"rgba(76, 177, 124, 1)");







        String accColor = register.result.getCssValue("color");
        System.out.println(accColor);
        String actualColorHex = Color.fromString(accColor).asHex();
        soft.assertEquals(actualColorHex,"##4cb17c");
        soft.assertEquals(accColor,"rgba(76, 177, 124, 1)");

        soft.assertAll();
    }















}
