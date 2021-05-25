package steps;

import base.BaseDriver;
import utils.enums.EGlobalVars;
import utils.getFiles.GetXMLfile;
import utils.vars.GlobalVars;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.URL;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public AndroidDriver<AndroidElement> aDriver = null;
    DesiredCapabilities capabilities = new DesiredCapabilities();


    @Before
    @SuppressWarnings("unchecked")
    public void setUp() throws Exception {


        String os = "ANDROID";
        GlobalVars.setVar(EGlobalVars.SYSTEM_OPERATION, os);
        File f;
        File app;

        if (os.toUpperCase().equals("ANDROID")) {

            f = new File("src/main/resources/app/android");
            app = new File(f, GetXMLfile.getConfProperties("ANDROID_APK"));

            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, GetXMLfile.getConfProperties("ANDROID_DEVICE_NAME"));
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, GetXMLfile.getConfProperties("ANDROID_PLATFORM_NAME"));
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, GetXMLfile.getConfProperties("ANDROID_AUTOMATION_NAME"));
            capabilities.setCapability(MobileCapabilityType.VERSION, GetXMLfile.getConfProperties("ANDROID_VERSION"));
            capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 300);
            capabilities.setCapability("appPackage", GetXMLfile.getConfProperties("ANDROID_APP_PACKAGE"));
            capabilities.setCapability("appActivity", GetXMLfile.getConfProperties("ANDROID_APP_ACTIVITY"));
            capabilities.setCapability("bundleID", GetXMLfile.getConfProperties("ANDROID_BUNDLE_ID"));
            capabilities.setCapability("disableWindowAnimation", true);
            aDriver = new AndroidDriver(new URL(GetXMLfile.getConfProperties("APPIUM_SERVER_URL")), capabilities);

            aDriver.manage().timeouts().implicitlyWait(Integer.parseInt(GetXMLfile.getConfProperties("IMPLICIT_WAIT")), TimeUnit.SECONDS);
            BaseDriver.addDriver(aDriver);
        }

    }

    @After
    public void after() throws Exception {
        BaseDriver.getDriver().quit();
        BaseDriver.removeDriver();
    }
}
