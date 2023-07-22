package com.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FacebookLoginFeature",glue= {"com.cucumber"},
dryRun=false,monochrome=true,plugin= {"pretty","json:Cucumber/target/cucumber-reports/cucumber.json",
		"html:target/cucumber-reports","junit:target/cucumber-reports/cucumber.xml"})
public class TestRunner {

}
