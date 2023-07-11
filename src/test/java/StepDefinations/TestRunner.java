package StepDefinations;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features",glue= {"StepDefinations"},
monochrome=true,plugin={"pretty","json:target/JSON/report.json"}
//tags="@ask"
)
public class TestRunner {

}
