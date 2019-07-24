/**
 * 
 */
package com.selenium.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;


public class LoginStepDefinition {
	WebDriver driver=ChromeDriverUtil.getDriver();

	@Given("^i am on the facebook login page$")
	public void i_am_on_the_facebook_login_page() {
		
		driver.get("https://www.facebook.com/login/");
		
	    System.out.println("Opening facebook login page...");
	    }

	@When("^I entered username as \"([^\"]*)\"$")
	public void I_entered_username_as(String arg1) {
		System.out.println("Entering username...");
		driver.findElement(By.id("email")).sendKeys(arg1);
		}

	@When("^I entered password as \"([^\"]*)\"$")
	public void I_entered_password_as(String arg1) {
		System.out.println("Entering password...");
		driver.findElement(By.id("pass")).sendKeys(arg1);
		driver.findElement(By.id("loginbutton")).click();
	}

	@Then("^Login should fail$")
	public void Login_should_fail() throws InterruptedException {
		System.out.println("Login failed as entered the wrong username ans password...");
		if (driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100")){
			System.out.println("Test1 pass");
			}
		
		else {
				System.out.println("Test1 Failed");
			}
		
		driver.close();
			
	}
	
		

}
