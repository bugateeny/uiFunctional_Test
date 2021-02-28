package hook_TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)  // find out ow this works
@CucumberOptions(features = "src/main/resources/featureFiles",
        strict = true, plugin = {"pretty", "html:target/ReportDestination"}, tags = "@TestRun")

public class TestRunner {


}
