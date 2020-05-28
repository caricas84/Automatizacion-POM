package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features/CalculadoraIMC.feature",
        tags = "@ImcExitoso",
        glue = "definitions",
        snippets = SnippetType.CAMELCASE
)
public class ImcRunner {
}
