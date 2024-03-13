package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.core.plugin.Options.Plugin;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\Tags.feature",glue = {"com.runner"},
plugin = {"pretty","junit:target/cucumber.xml"},tags = "@smoke")

public class TestRunner_withSingleTag 
{
  
}
