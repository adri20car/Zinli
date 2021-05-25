import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = { "classpath:steps"},
        tags = {"@Android"},

        plugin = {"pretty", "html:target/cucumber-reports"}

)
class TestRunner {

}