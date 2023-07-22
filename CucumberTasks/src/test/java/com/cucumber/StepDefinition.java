package com.cucumber;

import com.greens.FacebookLogin;
import com.test.BaseClassAdactinHotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClassAdactinHotel{
	//public static WebDriver driver;
		FacebookLogin obj;

	@Given("User launch the facebook web application")
	public void user_launch_the_facebook_web_application() {
		//WebDriverManager.chromedriver().setup();
//		getdriver();
//		getUrl("https://www.facebook.com/");
		
		
//		driver= new ChromeDriver();
//	    driver.get("https://www.facebook.com/");
//	    driver.manage().window().maximize();
	}

	@When("User enters valid username and valid password")
	public void user_enters_valid_username_and_valid_password() {
		obj= new FacebookLogin();
		sendKeys(obj.getTxtUserName(), "mura@123");
		sendKeys(obj.getTxtPassWord(), "123456");
//		driver.findElement(By.id("email")).sendKeys("gowtham@233");
//		driver.findElement(By.id("pass")).sendKeys("142122121");
	}

	@When("User needs click the login button")
	public void user_needs_click_the_login_button() {
		click(obj.getBtnLogin());
		//driver.findElement(By.name("login")).click();
		
	   }
	@When("User enters valid {string} and valid {string}")
	public void user_enters_valid_and_valid(String username, String password) {
		obj =new FacebookLogin();
		sendKeys(obj.getTxtUserName(), username);
		sendKeys(obj.getTxtUserName(), password);
//		driver.findElement(By.id("email")).sendKeys(username);
//		driver.findElement(By.id("pass")).sendKeys(password);

		
	   }

	@Then("verify user is navigating to home page or not")
	public void verify_user_is_navigating_to_home_page_or_not() {
			System.out.println("verify_user_is_navigating_to_home_page_or_not ");
	    }

}
