package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/feature/Login.feature",
                          glue ="stepDefs",
                          monochrome = true,
                          publish = true)

public class runner extends AbstractTestNGCucumberTests {
                          
                      }
