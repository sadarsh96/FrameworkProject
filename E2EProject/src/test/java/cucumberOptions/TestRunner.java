package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/java/feature/",
		glue= {"stepDefinitions"},
		tags= "@smoke"
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
