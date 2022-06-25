package co.tests.screenplay.stepdefinitions;

import co.tests.screenplay.interactions.ElementClicker;
import co.tests.screenplay.tasks.LoginToRunWithHal;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.tests.screenplay.userinterface.LoginScreens.*;

public class LoginFunctionalityStepDefinitions {

    @Given("Andres selects Continue with Google")
    public void andresSelectsContinueWithGoogle() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ElementClicker.clickButtonOrElement(CONTINUE_WITH_GOOGLE_BUTTON)
        );
    }

    @When("he agrees to the terms of service")
    public void heAgreesToTheTermsOfService() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ElementClicker.clickButtonOrElement(AGREE_AND_SIGN_IN)
        );
    }

    @Then("he clicks on his Google account and signs in")
    public void heClicksOnHisGoogleAccountAndSignsIn() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ElementClicker.clickButtonOrElement(MAIN_GOOGLE_ACCOUNT)
        );
    }

    @Given("Andres is logged in to RunWithHal")
    public void theRunWithHalApplicationIsOpen() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginToRunWithHal.loginToApplication()
        );
    }
}
