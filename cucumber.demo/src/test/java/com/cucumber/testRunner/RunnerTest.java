package com.cucumber.testRunner;


import java.io.File;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/features/",
		glue={"com.cucumber.stepDefinition"},
		format = {"pretty", "json:target/json/output.json", "html:target/html/"},
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
		
		tags = {"@smoke"}
		
		)
 
public class RunnerTest {
	
    @BeforeClass
    public static void setup() {
    	
    	ExtentCucumberFormatter.initiateExtentCucumberFormatter();
    	ExtentCucumberFormatter.loadConfig(new File("/Users/shrikant.kanase/workspace/cucumber.demo/resources/extent-config.xml"));
    }
    
}
