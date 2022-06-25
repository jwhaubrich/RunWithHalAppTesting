package co.tests.screenplay.stepdefinitions;
import co.tests.screenplay.tasks.TabIterator;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

public class BasicFunctionalityStepDefinitions {
    @Then("Andres clicks on each of the main tabs")
    public void heClicksOnHisGoogleAccountAndSignsIn() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                TabIterator.clickOnTabs()
        );
    }
}


