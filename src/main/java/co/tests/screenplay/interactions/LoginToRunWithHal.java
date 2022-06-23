package co.tests.screenplay.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.tests.screenplay.userinterface.LoginScreen.*;

public class LoginToRunWithHal implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CONTINUE_WITH_GOOGLE_BUTTON),
                Click.on(AGREE_AND_SIGN_IN)
        );
    }

    public static LoginToRunWithHal loginToApplication() {
        return Tasks.instrumented(LoginToRunWithHal.class);
    }
}
