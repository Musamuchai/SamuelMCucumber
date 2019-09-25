package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "\\Users\\Eli Muchai\\eclipse-workspace\\Spring19\\Project_CucumberQ1\\src\\test\\java\\features\\todo.feature", 
glue = { "steps" },
 dryRun = false,
 monochrome = true,
 plugin = {"pretty", "html:test-output"}
 )
public class ToDo_Runner {
	
	

}
