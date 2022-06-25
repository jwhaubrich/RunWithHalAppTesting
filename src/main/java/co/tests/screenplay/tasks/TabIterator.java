package co.tests.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.tests.screenplay.userinterface.AllApplicationTabs.*;

public class TabIterator implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MORE_TAB),
                Click.on(STATS_TAB),
                Click.on(HAL_SAYS_TAB),
                Click.on(YOUR_PLAN_TAB)
        );
    }

    public static TabIterator clickOnTabs() {
        return Tasks.instrumented(TabIterator.class);
    }
}
