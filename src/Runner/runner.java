package Runner;

import java.io.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "." }, glue = "StepDefinitians", strict = false,
tags = {"@FunctionalTest"},  //@SmokeTest, @FunctionalTest, @DocString

		dryRun = false, plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html","rerun:target/rerun.txt" }, monochrome = true

)

public class runner {
	@AfterClass
	public static void writeExtentReport() {

		Reporter.loadXMLConfig(new File("resource/extent-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Mac OSX");
		Reporter.setTestRunnerOutput("Sample test runner output message");
	}
}