package framework.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "classpath:features",
        glue = "framework.steps",
        dryRun = false,
        plugin = {
                "html:target/cucumber_report/report.html",
                "json:target/jsonReports/report.json"

        }

)
public class ProjectRunner {
}
