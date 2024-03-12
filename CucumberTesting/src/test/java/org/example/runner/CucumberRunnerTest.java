package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags =" ",
        features = {"src/test/resources/features"},
        glue = {"stepdefinations"},
        plugin = {"pretty", "html:target/cucumber-report.html"})

public class CucumberRunnerTest extends AbstractTestNGCucumberTests {


}


