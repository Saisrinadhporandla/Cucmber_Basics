package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefnation",tags="@RegTest",
		plugin= {"pretty","html:target/CucumberReport.html"})
       //glue="stepDefnation",stepNotifications=true
public class TestRunner {
	

}
