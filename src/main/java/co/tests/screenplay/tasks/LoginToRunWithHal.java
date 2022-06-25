package co.tests.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.tests.screenplay.userinterface.LoginScreens.*;

public class LoginToRunWithHal implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CONTINUE_WITH_GOOGLE_BUTTON),
                Click.on(AGREE_AND_SIGN_IN),
                Click.on(MAIN_GOOGLE_ACCOUNT)
        );
    }

    public static LoginToRunWithHal loginToApplication() {
        return Tasks.instrumented(LoginToRunWithHal.class);
    }
}
