package co.tests.screenplay.stepdefinitions;

import co.tests.screenplay.interactions.LoginToRunWithHal;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

public class RunWithHalStepDefinitions {
    @Given("he logs in to RunWithHal")
    public void theRunWithHalApplicationIsOpen() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginToRunWithHal.loginToApplication()
        );
    }

    @Then("he clicks on the More option")
    public void heClicksOnTheMoreIconToOpenIt() {
    }
}
