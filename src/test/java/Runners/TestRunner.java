package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        //path to all the feature file
        //   features = "src/test/resources/features/Login.feature"
        // features = "src/test/resources/features/EmployeeSearch.feature"
        features = "src/test/resources/features/",
        //name of  the package where all the step definitions available
        glue = "steps",
        //if we set the value to true, it stops execution and scan all the step definitions and gives missing steps
        dryRun = false,
        tags = "@addEmp",
        //html report
        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"}


)

public class TestRunner {
}
