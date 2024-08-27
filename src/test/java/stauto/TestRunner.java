package stauto;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@tests",features = {"src/test/resources/com/Features"}, glue = {"com.stepdefinition"}, dryRun = false, plugin = {
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" })

public class TestRunner extends AbstractTestNGCucumberTests {

}
