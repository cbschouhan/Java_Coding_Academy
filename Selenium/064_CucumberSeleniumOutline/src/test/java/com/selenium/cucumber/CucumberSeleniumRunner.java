package com.selenium.cucumber;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format={"pretty","html:reports/test-report",
		"json:target/test-report"},tags="@smokeTest")
public class CucumberSeleniumRunner {

}
