package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
        public static WebDriver driver;


        @Before
        public static void Openbrowser()
        {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://demo.nopcommerce.com/");
    }


    @After
    public void quitDriver() throws InterruptedException
    {
        Thread.sleep(3000);
        driver.quit();
    }










}
