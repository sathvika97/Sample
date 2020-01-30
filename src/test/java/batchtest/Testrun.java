package batchtest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="demojan28jan.feature",glue= {"stepde"},tags= {"@datadriven"},
plugin="json:target/cucumber-report.json")
public class Testrun {
}
//or-{"@regressionTest,@smoke"}
//not-{~@FunctionalTest}
//pulgin-json,html,xml