package com.jpm.selenium.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxUtil {
	public static WebDriver getDriver(){
		WebDriver driver = null;
		// step 1 : driver class
		// driver class for firefox
		String driverClassKey="webdriver.gecko.driver";
		// step 2 : driver path
		String driverPathValue=".\\driver\\geckodriver.exe";
		// step 3 : Set the system properties (K,V) (driverClassKey, driverPathValue) 
		System.setProperty(driverClassKey, driverPathValue);
		// step 4 : set the desired capabilities of the Browser
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		// step 5 : get the driver instance by passing the DesiredCapabilities
		driver = new FirefoxDriver(capabilities);
		return driver;
	}

}
