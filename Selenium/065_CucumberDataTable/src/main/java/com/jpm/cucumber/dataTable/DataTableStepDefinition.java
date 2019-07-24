package com.jpm.cucumber.dataTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Table;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.table.DataTable;

public class DataTableStepDefinition {
	protected WebDriver driver;
	
	@Given("^I am on the user registration page$")
	public void I_am_on_the_user_registration_page() {
	    driver=ChromeDriverUtil.getDriver();
	    System.out.println("Loading the website FaceBook.....");
		driver.get("https://www.facebook.com");
	 }

	@When("^I enter invalid data on the page$")
	public void I_enter_invalid_data_on_the_page(DataTable table) throws InterruptedException {
	    // Express the Regexp above with the code you wish you had
	    // For automatic conversion, change DataTable to List<YourType>
		List<List<String>> data = table.raw();
		System.out.println(data.get(1).get(1));
	    
		driver.findElement(By.name("firstname")).sendKeys(data.get(1).get(1));
		driver.findElement(By.name("lastname")).sendKeys(data.get(2).get(1));
		driver.findElement(By.name("reg_email__")).sendKeys(data.get(3).get(1));
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys(data.get(4).get(1));
		driver.findElement(By.name("reg_passwd__")).sendKeys(data.get(5).get(1));
		
		Select dropdownB = new Select(driver.findElement(By.name("birthday_day")));
		dropdownB.selectByValue("29");
		
		Select dropdownM = new Select(driver.findElement(By.name("birthday_month")));
		dropdownM.selectByValue("5");
		
		Select dropdownY = new Select(driver.findElement(By.name("birthday_year")));
		dropdownY.selectByValue("1990");
		Thread.sleep(5000);
		driver.findElement(By.className("_58mt")).click();
	}

	@Then("^User Registration should be unsuccessful$")
	public void User_Registration_should_be_unsuccessful() {
	    // Express the Regexp above with the code you wish you had
		if(driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/"))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Failed");
		}
		driver.close();
	}

}
