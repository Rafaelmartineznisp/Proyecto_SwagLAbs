package co.com.choucair.swaglabs.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/compra_swaglabs.feature",
        tags = "@Historia2",
        glue ="co.com.choucair.swaglabs.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class RunnersTagsCompra {
}
