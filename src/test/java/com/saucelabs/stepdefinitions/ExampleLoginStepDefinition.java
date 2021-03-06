package com.saucelabs.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleLoginStepDefinition {
    WebDriver driver;
    By usernameInput = By.id("txtUsername");
    By passwordInput = By.id("txtPassword");
    By loginButton = By.id("btnLogin");

    @Given("User will be on Login Page")
    public void method1(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @When("User enter correct username and password and click login")
    public void method2(){

        driver.findElement(usernameInput).sendKeys("Admin");
        driver.findElement(passwordInput).sendKeys("admin123");
        driver.findElement(loginButton).click();
    }
    @Then("Verify Login")
    public void method3(){
        Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/dashboard", driver.getCurrentUrl());
    }
}