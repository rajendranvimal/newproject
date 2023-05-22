package cucu;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=("/Users/VI20463981/eclipse-vimaljava1/demoproject/src/main/java/cucu/demo.feature"),
		glue={"cucu"},
		tags="@ABC",
		dryRun=true,monochrome=true,
				plugin = { "pretty",

						"json:target/cucumber-reports/reports.json", "junit:target/cucumber-reports/Cucumber.xml",

		"html:target/cucumber-reports/reports2.html" }
		
		)
public class runner extends AbstractTestNGCucumberTests{

	
}
