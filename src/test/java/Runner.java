import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
//        format = { "pretty", "html:target/pippo", "json:target/cucumber.json" },
//        features = {"src/main/resources/features"},
        glue = "com.step.definitions")
public class Runner {

}
