package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\HP\\eclipse-workspace\\2022\\cucumberDemo\\src\\test\\java\\features\\TableDemo.feature",
glue= {"steps"},
dryRun=false,
plugin={"pretty",
		"html:target/report.html"}

)
public class TestRunner3 {
	

}
