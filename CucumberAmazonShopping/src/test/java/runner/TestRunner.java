package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/amazon.feature",
        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:runnerReports/cucumber-reports.html",
        "json:runnerReports/cucumber-reports.json"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
