package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = { ".\\Features\\appium.feature" }, glue = "StepDefination", dryRun = false, monochrome = true,
					plugin = {"pretty", "html:Reports\\cucumber-reports.html" })
public class Run {

}
