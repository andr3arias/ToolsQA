package com.demoqa.certification.stepsdefinitions;

import com.demoqa.certification.models.UserData;
import com.demoqa.certification.tasks.FilltheStudentRegistration;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class PracticeFormStepsDefinitions {
    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Andre");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^the user is in the student registration form$")
    public void theUserIsInTheStudentRegistrationForm() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://demoqa.com/automation-practice-form"));
    }

    @When("^the user ty to fill the form with her data$")
    public void theUserTyToFillTheFormWithHerData(List<UserData> userData) {
        OnStage.theActorInTheSpotlight().attemptsTo(FilltheStudentRegistration.form(userData.get(0)));
    }

    @Then("^check the wellcome message$")
    public void checkTheWellcomeMessage() {

    }

}
