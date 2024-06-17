package RunnerClass;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features=".//Features/CreateProject.feature",
	glue="StepDefination",
	dryRun = false,
	monochrome = true,
	plugin = {"pretty"}
)
public class Run {

}
