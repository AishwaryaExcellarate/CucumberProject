package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.core.plugin.Options.Plugin;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/productsaddedTocart.feature",glue = {"com.stepdefinition"},
plugin = {"pretty","junit:target/cucumber.xml","html:target/htmlreport.html"})

public class TestRunner_withSingleTag 
{
  
}
