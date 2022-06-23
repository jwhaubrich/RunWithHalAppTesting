package co.tests.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class FirstScreenInPhone {
    public static final Target RUN_WITH_HAL_APP = Target.the("Run With Hal Application").locatedBy("//android.widget.TextView[@content-desc=\"Run With Hal\"]");

}
