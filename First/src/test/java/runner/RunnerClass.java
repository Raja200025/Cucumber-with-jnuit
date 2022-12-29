package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles", glue = { "stepDefinitions","hooks" }, 
dryRun = false,
strict=true,
monochrome = true, 
		plugin = { "html:report/WebReport", "json:report/jsonreport.json",
				"junit:report/junitxmlreport.xml" }, tags = { "@Back-Ground" })



public class RunnerClass {

}
