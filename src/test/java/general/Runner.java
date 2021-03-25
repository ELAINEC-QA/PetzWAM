package general;


import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith()
@CucumberOptions(
        features = "src/test/resources/festures",
        glue =     "steps",
        plugin =    {"pretty",
                    "html:target/relatoriosimples",
                "Json:target/relatoriosimples.json",
                "com.vilmaselvam.listenner.ExtentCucumberFormatter:target/dashboard.html"

        }
)

public class Runner {
}
