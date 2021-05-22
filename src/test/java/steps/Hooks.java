package steps;

import base.BaseDriver;
import utils.enums.EGlobalVars;
import utils.getFiles.GetXMLfile;
import utils.vars.GlobalVars;
import com.browserstack.local.Local;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;

import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public AndroidDriver<AndroidElement> aDriver = null;
    public IOSDriver<IOSElement> iDriver = null;
    DesiredCapabilities capabilities = new DesiredCapabilities();

    private Local l;
    File d = null;

    @Before
    @SuppressWarnings("unchecked")
    public void setUp() throws Exception {

        String os = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("os");
        GlobalVars.setVar(EGlobalVars.SYSTEM_OPERATION, os);
        File f;
        File app = null;

        if (os.toUpperCase().equals("ANDROID")) {

            f = new File("src/main/resources/app/android");
            app = new File(f, GetXMLfile.getConfProperties("ANDROID_APK"));

            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, GetXMLfile.getConfProperties("ANDROID_DEVICE_NAME"));
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, GetXMLfile.getConfProperties("ANDROID_PLATFORM_NAME"));
            capabilities.setCapability(MobileCapabilityType.PLATFORM, GetXMLfile.getConfProperties("ANDROID_PLATFORM"));
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
        } else if (os.toUpperCase().equals("IOS")) {

            //IOS IMPLEMENTACION
        }

        if (os.toUpperCase().equals("ANDROID")) {
            aDriver.manage().timeouts().implicitlyWait(Integer.parseInt(GetXMLfile.getConfProperties("IMPLICIT_WAIT")), TimeUnit.SECONDS);
            BaseDriver.addDriver(aDriver);
        } else {
            //GUARDAMOS EL DRIVER IOS
        }

    }

    @After
    public void after() throws Exception {
        BaseDriver.getDriver().quit();
        BaseDriver.removeDriver();
    }
}
