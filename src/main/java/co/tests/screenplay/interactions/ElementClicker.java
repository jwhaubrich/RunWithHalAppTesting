package co.tests.screenplay.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ElementClicker implements Interaction {
    private Target elementToClick;

    public ElementClicker(Target elementToClick) {
        this.elementToClick = elementToClick;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(elementToClick)
        );
    }

    public static ElementClicker clickButtonOrElement(Target elementToClick) {
        return Tasks.instrumented(ElementClicker.class, elementToClick);
    }
}
