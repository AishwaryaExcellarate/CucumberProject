package com.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/hooksdemo.feature",glue = {"com.runner"},
plugin = {"pretty","junit:target/cucumber.xml"})

public class TestRunnerforHooks {

}
