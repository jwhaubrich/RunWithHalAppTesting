package co.tests.screenplay.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginScreen {
    public static final Target CONTINUE_WITH_GOOGLE_BUTTON = Target.the("Continue with Google button").located(MobileBy.accessibilityId("Continue with Google"));
    public static final Target AGREE_AND_SIGN_IN = Target.the("Agree and Sign In button").located(MobileBy.accessibilityId("Agree and Sign In"));
}
