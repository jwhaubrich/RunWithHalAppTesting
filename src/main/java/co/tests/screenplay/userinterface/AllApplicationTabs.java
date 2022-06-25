package co.tests.screenplay.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class AllApplicationTabs {
    public static final Target YOUR_PLAN_TAB = Target.the("Your Plan tab").located(MobileBy.accessibilityId("Your Plan Tab 1 of 4"));
    public static final Target HAL_SAYS_TAB = Target.the("Hal Says tab").located(MobileBy.accessibilityId("Hal Says Tab 2 of 4"));
    public static final Target STATS_TAB = Target.the("Stats tab").located(MobileBy.accessibilityId("Stats Tab 3 of 4"));
    public static final Target MORE_TAB = Target.the("More tab").located(MobileBy.accessibilityId("More Tab 4 of 4"));

}
