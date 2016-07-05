import api.android.Android;
import core.MyLogger;
import core.UiObject;
import core.UiSelector;
import core.ADB;
import core.managers.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Level;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


/**
 * Created by felipe on 6/17/2016.
 */
public class Runner {
    public static void main (String[] args) throws MalformedURLException {
        MyLogger.log.setLevel(Level.DEBUG);
        AndroidDriver driver = null;
        try{
            DriverManager.createDriver();

            Android.adb.openAppsActivity("com.instagram.android","com.instagram.android.activity.MainTabActivity");



            //UiObject url = new UiSelector().resourceId("com.android.chrome:id/url_bar").makeUiObject();

            //logo.waitToAppear(15);

           // try {
           //     Thread.sleep(2000);
           // } catch (InterruptedException e) {
           //     e.printStackTrace();
          //  }

          //  url.tap();
          //  url.typeText("IBM");

        }finally {
            DriverManager.killDriver();
        }

    }
}
