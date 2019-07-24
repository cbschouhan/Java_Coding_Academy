package com.jpm.cucumber.dataTable;
import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format={"pretty","html:reports/test-report","json:target/test-report"},tags="@smokeTest")
//@Cucumber.Options(format={"pretty","html:reports/test-report/index.html"},tags="@smokeTest")
public class CucumberSeleniumRunner {

	
}
