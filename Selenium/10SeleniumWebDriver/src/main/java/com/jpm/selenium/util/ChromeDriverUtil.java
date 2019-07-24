package com.jpm.selenium.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverUtil {
	public static WebDriver getDriver(){
		WebDriver driver = null;
		// step 1 : driver class
		// driver class for firefox
		String driverClassKey="webdriver.chrome.driver";
		// step 2 : driver path
		String driverPathValue=".\\driver\\chromedriver.exe";
		// step 3 : Set the system properties (K,V) (driverClassKey, driverPathValue) 
		System.setProperty(driverClassKey, driverPathValue);
		// step 4 : set the desired capabilities of the Browser
		ChromeOptions options = new ChromeOptions();
		// step 5 : get the driver instance by passing the DesiredCapabilities
		driver = new ChromeDriver(options);
		return driver;
	}

}
