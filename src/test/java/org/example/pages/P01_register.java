package org.example.pages;
import io.cucumber.messages.types.Hook;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;
public class P01_register {

    public WebElement regi(){

       return driver.findElement(By.className("ico-register"));


           // register.RegisterBtn.click();

    }
public P01_register()
{
    PageFactory.initElements(driver,this);
}

//@FindBy(className = "ico-register")
//public WebElement RegisterBtn;

@FindBy (id="gender-male")
    public WebElement gender;


@FindBy(id="FirstName")
    public WebElement FirstName;


@FindBy (id="LastName")
    public WebElement LastName;

@FindBy(name="DateOfBirthDay")
    public WebElement day;

@FindBy (name="DateOfBirthMonth")
    public WebElement month;



@FindBy(name="DateOfBirthYear")
    public WebElement year;


@FindBy(css = "input[id=\"Email\"]")
    public WebElement email;



@FindBy(css = "input[id=\"Password\"]")
    public WebElement password;


@FindBy(css = "input[id=\"ConfirmPassword\"]")
    public WebElement ConfirmationPassword;


@FindBy(css = "button[name=\"register-button\"]")
    public WebElement registerButton;

@FindBy (className ="result")
    public WebElement result;

}
