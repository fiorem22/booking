import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.io.File;

public class CreateDriverSession {

    public static AppiumDriver initializeDriver(String platformName) throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "ANDROID");
        capabilities.setCapability("appium:newCommandTimeOut", 360);

        URL url = new URL("http://0.0.0.0:4723");

        switch (platformName) {
            case "Android":

                capabilities.setCapability("appium:automationName", "UiAutomator2");
                capabilities.setCapability("appium:deviceName", "pixel_7_pro");
                capabilities.setCapability("appium:app", "/Users/fiorellamosqueirazapta/IdeaProjects/Booking/src/main/resources/booking-com-32-9.apk");
                capabilities.setCapability("appium:avdLaunchTimeout", 180000);
                capabilities.setCapability("appium:udid", "emulator-5554");
                capabilities.setCapability("appium:newCommandTimeOut", 360);
                capabilities.setCapability("appium:avd", "Pixel_7_Pro_API_33");
                 // String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                //     + File.separator + "resources" + File.separator + "booking-com-32-9.apk";
                //caps.setCapability("appPackage", "io.appium.android.apis");
                //caps.setCapability("appActivity", "io.appium.android.apis.accessibility.CustomViewAccessibilityActivity");
                //caps.setCapability("app", appUrl);
                //capabilities.setCapability("appium:appPackage", "com.google.android.apps.maps");
                //capabilities.setCapability("appium:appActivity", "com.google.android.maps.MapsActivity");

                return new AndroidDriver(url, capabilities);

            case "iOs":
                capabilities.setCapability("platformName", "iOS");
                capabilities.setCapability("deviceName", "iPhone 15 Pro Max");
                capabilities.setCapability("automationName", "XCUITest");
                capabilities.setCapability("simulatorStartupTimeout", 180000);
                capabilities.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
                return new IOSDriver(url, capabilities);

            default:
                throw new Exception("Invalid platform");

        }
    }
}
