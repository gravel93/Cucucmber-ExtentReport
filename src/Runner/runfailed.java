package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "@target/rerun.txt" }, // Cucumber picks the failed scenarios from this file
		format = { "pretty", "html:target/site/cucumber-pretty",
				"json:target/cucumber.json" }, dryRun = false, glue = "StepDefinitians", strict = false

)
public class runfailed {

}
