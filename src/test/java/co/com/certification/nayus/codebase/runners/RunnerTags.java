package co.com.certification.nayus.codebase.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/test.feature",
        glue = {"co.com.certification.nayus.codebase.stepdefinitions","co.com.certification.nayus.codebase.util"},
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {

}