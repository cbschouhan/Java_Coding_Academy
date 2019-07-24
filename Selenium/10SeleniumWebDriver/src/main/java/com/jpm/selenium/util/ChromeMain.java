package com.jpm.selenium.util;

import org.openqa.selenium.WebDriver;

public class ChromeMain {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ChromeDriverUtil.getDriver();
		System.out.println("Loading the browser....");
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		System.out.println("Opening google.com....");
		String title=driver.getTitle();
		if (title.equals("Google"))
			System.out.println("The Title is : "+title);
		else
			System.out.println("Wrong title detected");
		
		driver.quit();
		

	}

}
