package cucumberOptions;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@Test
@CucumberOptions(features="src/test/java/features",
glue="stepDefnation",tags="@SmokeTest and @RegTest")
public class testngTest extends AbstractTestNGCucumberTests{
 
}
