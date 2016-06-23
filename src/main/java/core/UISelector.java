package core;

/**
 * Created by felipe on 6/22/2016.
 */
public class UISelector {
    private String locator = "new UiSelector()";

    public UISelector resourceId(String value) {
        locator += ".resourceId(\""+value+"\")";

        System.out.println(locator);
        return this;
    }

}
