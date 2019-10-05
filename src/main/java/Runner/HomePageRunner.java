package Runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "Features",
glue = { "stepDefination" }, 
tags = { "@test" }, 
plugin = {"pretty", "html:target/cucumberHtmlReport", "json:target/json-report/report.json" })

@Test
public class HomePageRunner extends AbstractTestNGCucumberTests {

}
