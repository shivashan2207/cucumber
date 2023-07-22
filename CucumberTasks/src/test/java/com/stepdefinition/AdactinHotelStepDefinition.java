package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotelStepDefinition {
	WebDriver driver;

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
	    }

	@When("user enter the valid {string} and {string}")
	public void user_enter_the_valid_and(String uname, String password) {
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(password);
	    }

	@When("click the login buttton")
	public void click_the_login_buttton() {
		driver.findElement(By.id("login")).click();
	    }

	@Then("The should be valid Success message")
	public void the_should_be_valid_Success_message() {
		boolean status = driver.findElement(By.xpath("//td[text()='Welcome to Adactin Group of Hotels']")).isDisplayed();
		Assert.assertTrue(status);
		
	    }
}
