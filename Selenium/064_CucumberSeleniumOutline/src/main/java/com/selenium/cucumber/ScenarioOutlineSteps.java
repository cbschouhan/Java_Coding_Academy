package com.selenium.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.table.DataTable;

public class ScenarioOutlineSteps {
	WebDriver driver=ChromeDriverUtil.getDriver();
	
	@Given("^i am on the facebook login page$")
	public void i_am_on_the_facebook_login_page() {
		driver.get("https://www.facebook.com/login/");
	    System.out.println("Opening facebook login page...");
	    // Express the Regexp above with the code you wish you had
	
	}

	@When("^I entered Username as \"([^\"]*)\"$")
	public void I_entered_Username_as(String arg1) {
	    // Express the Regexp above with the code you wish you had
		driver.findElement(By.id("email")).sendKeys(arg1);
	}

	@When("^I entered Password as \"([^\"]*)\"$")
	public void I_entered_Password_as(String arg1) {
	    // Express the Regexp above with the code you wish you had
		driver.findElement(By.id("pass")).sendKeys(arg1);
		driver.findElement(By.id("loginbutton")).click();
	
	}

	@Then("^Login should fail$")
	public void Login_should_fail(DataTable arg1) {
	    // Express the Regexp above with the code you wish you had
	    // For automatic conversion, change DataTable to List<YourType>
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
