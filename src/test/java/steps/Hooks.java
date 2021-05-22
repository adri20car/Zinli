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

        String mode = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("mode");
        String os = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("os");
        GlobalVars.setVar(EGlobalVars.SYSTEM_OPERATION, os);
        File f;
        File app = null;

        switch (mode.toUpperCase()){
            case "LOCAL":
                if(os.toUpperCase().equals("ANDROID")){

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
                }
                else if(os.toUpperCase().equals("IOS")){

                    f = new File("src/main/resources/app/ios");
                    app = new File(f, GetXMLfile.getConfProperties("IOS_IPA"));

                    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, GetXMLfile.getConfProperties("IOS_DEVICE_NAME"));
                    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, GetXMLfile.getConfProperties("IOS_PLATFORM_NAME"));
                    capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
                    capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
                    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, GetXMLfile.getConfProperties("IOS_PLATFORM_VERSION"));
                    capabilities.setCapability("udid", GetXMLfile.getConfProperties("IOS_UID"));
                    capabilities.setCapability("xcodeOrgId", GetXMLfile.getConfProperties("IOS_XCODEORGID"));
                    capabilities.setCapability("xcodeSigningId", GetXMLfile.getConfProperties("IOS_XCODESIGNINGID"));
                    capabilities.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS, true);
                    capabilities.setCapability("disableWindowAnimation", true);

                    iDriver = new IOSDriver(new URL(GetXMLfile.getConfProperties("APPIUM_SERVER_URL")), capabilities);

                }
                break;
            case "REMOTO":

                String environment = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("environment");
                String jsonConfigFile = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("jsonConfigFile");
                JSONParser parser = new JSONParser();
                JSONObject config;

                if(os.toUpperCase().equals("ANDROID"))
                    config = (JSONObject) parser.parse(new FileReader("src/main/resources/conf/android/" + jsonConfigFile));
                else
                    config = (JSONObject) parser.parse(new FileReader("src/main/resources/conf/ios/" + jsonConfigFile));

                JSONObject envs = (JSONObject) config.get("environments");

                Map<String, String> envCapabilities = (Map<String, String>) envs.get(environment);
                Iterator it = envCapabilities.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry pair = (Map.Entry) it.next();
                    capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
                }

                Map<String, String> commonCapabilities = (Map<String, String>) config.get("capabilities");
                it = commonCapabilities.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry pair = (Map.Entry) it.next();
                    if (capabilities.getCapability(pair.getKey().toString()) == null) {
                        capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
                    }
                }

                String username = System.getenv("BROWSERSTACK_USERNAME");
                if (username == null) {
                    username = (String) config.get("user");
                }

                String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");
                if (accessKey == null) {
                    accessKey = (String) config.get("key");
                }

                String ap = System.getenv("BROWSERSTACK_APP_ID");
                if (app != null && !ap.isEmpty()) {
                    capabilities.setCapability("app", ap);
                }

                if (capabilities.getCapability("browserstack.local") != null
                        && capabilities.getCapability("browserstack.local") == "true") {
                    l = new Local();
                    Map<String, String> options = new HashMap<String, String>();
                    options.put("key", accessKey);
                    l.start(options);
                }
                capabilities.setCapability("disableWindowAnimation", true);

                    if(os.toUpperCase().equals("ANDROID"))
                        aDriver = new AndroidDriver(new URL("http://" + username + ":" + accessKey + "@" + config.get("server") + "/wd/hub"), capabilities);
                    else
                        iDriver = new IOSDriver(new URL("http://" + username + ":" + accessKey + "@" + config.get("server") + "/wd/hub"), capabilities);
                break;
        }
        if(os.toUpperCase().equals("ANDROID")){
            aDriver.manage().timeouts().implicitlyWait(Integer.parseInt(GetXMLfile.getConfProperties("IMPLICIT_WAIT")), TimeUnit.SECONDS);
            BaseDriver.addDriver(aDriver);
        }
        else{
            iDriver.manage().timeouts().implicitlyWait(Integer.parseInt(GetXMLfile.getConfProperties("IMPLICIT_WAIT")), TimeUnit.SECONDS);
            BaseDriver.addDriver(iDriver);
        }
    }

    @After
    public void after() throws Exception {
        BaseDriver.getDriver().quit();
        BaseDriver.removeDriver();
        if(l != null) l.stop();
        }
}
