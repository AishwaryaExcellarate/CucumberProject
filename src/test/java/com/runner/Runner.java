package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",features = {"src/test/resources/Features"},glue = {"com.stepdefinition"},
plugin = {"pretty","html:target/htmlreport.html","json:Reports//JsonReports//Cucumber.json","junit:Reports//JunitReports//Cucumber.xml"})

public class Runner extends AbstractTestNGCucumberTests
{
	

}
