package co.tests.screenplay.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class YourPlanTab {
    public static final Target ARROW_DOWN_EXPAND_PLAN = Target.the("down arrow that expands your plan").located(MobileBy.xpath("//android.view.View[@content-desc=\"Completed This Week Distance 7.2 Duration 85 min\"]/android.view.View[8]"));
    public static final Target CLOSEOUT_OF_TRAINING_PLAN = Target.the("close out of training plan button").located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
    public static final Target PLAN_SETTINGS = Target.the("plan settings button").located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView"));
    public static final Target BACK_BUTTON = Target.the("back button").located(MobileBy.accessibilityId("Back"));
    public static final Target EXPAND_WORKOUT = Target.the("expand workout").located(MobileBy.accessibilityId("Base Run Planned 4.0 miles 50 min 12:28 min/mi"));
    public static final Target START_RUN_BUTTON = Target.the("start run button").located(MobileBy.accessibilityId("Start Run"));
//    public static final Target _BUTTON = Target.the("back button").located(MobileBy.accessibilityId("Back"));
//    public static final Target BACK_BUTTON = Target.the("back button").located(MobileBy.accessibilityId("Back"));
//    public static final Target BACK_BUTTON = Target.the("back button").located(MobileBy.accessibilityId("Back"));
//    public static final Target BACK_BUTTON = Target.the("back button").located(MobileBy.accessibilityId("Back"));




}
