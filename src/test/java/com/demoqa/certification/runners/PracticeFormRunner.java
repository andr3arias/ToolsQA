package com.demoqa.certification.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/practiceform.feature",
        snippets = SnippetType.CAMELCASE,
        glue= "com.demoqa.certification.stepsdefinitions"
)

public class PracticeFormRunner {
}
