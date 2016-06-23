import core.UISelector;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by felipe on 6/17/2016.
 */
public class Runner {
    public static void main (String[] args) {

        new UISelector().resourceId("hello");


    }


}
