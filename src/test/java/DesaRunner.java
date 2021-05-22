import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "classpath:features",
        glue = { "classpath:steps"},
        monochrome = true,
        strict = true,
        tags = {"@ANDROID"},
        plugin = {"pretty", "html:target/cucumber-reports", "summary"}
)

public class DesaRunner extends AbstractTestNGCucumberTests {


}
