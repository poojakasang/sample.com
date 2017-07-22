package com.inportia.June10framework;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src\\test\\java\\ResourcesScenario",
		glue="stepdef",
		tags={"@DropDown"},
		monochrome=true,
		dryRun=false
		)
public class Runner {

}
