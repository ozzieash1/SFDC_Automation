package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(format = { "pretty", "html:target/cucumber-html-report", "json:target/cucumber.json" }, features = {
		"src/test/resources/features" }, glue = { "sfdc.automation.steps" },
		tags = {"@currentt"}
		//tags = { "@runme " }
        // tags = { "@runme3" }
// monochrome = true ,
// dryRun = false
)

public class SalesForceRunner {

}
