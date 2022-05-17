package hellocucumber;

import io.cucumber.junit.Cucumber;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.*;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("hellocucumber")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/hellocucumber/test.feature",
        glue= {"hellocucumber"},
        plugin = ("json:target/CucumberTestReport.json"),
        monochrome = true
)

public class RunCucumberTest {
}
