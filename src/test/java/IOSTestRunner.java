import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "classpath:feature",
        glue = { "classpath:steps"},
        monochrome = true,
        strict = true,
        tags = {"@IOS"},
        plugin = {"pretty", "html:target/cucumber-reports", "summary"}
)

public class IOSTestRunner extends AbstractTestNGCucumberTests {


}
