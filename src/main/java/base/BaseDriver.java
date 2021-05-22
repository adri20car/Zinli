package base;

import utils.enums.EGlobalVars;
import utils.vars.GlobalVars;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import java.util.List;

public class BaseDriver {

    private static ThreadLocal<AndroidDriver> aDrivers = new ThreadLocal<>();
    private static List<AndroidDriver> aStoreDrivers = new ArrayList<>();
    private static ThreadLocal<IOSDriver> iDrivers = new ThreadLocal<>();
    private static List<IOSDriver> iStoreDrivers = new ArrayList<>();

    static {
        Runtime.getRuntime().addShutdownHook(new Thread() {
                                                 public void run() {

                                                     aStoreDrivers.stream().forEach(AndroidDriver::quit);
                                                 }
                                             }
        );
    }
    static {
        Runtime.getRuntime().addShutdownHook(new Thread() {
                                                 public void run() {

                                                     iStoreDrivers.stream().forEach(IOSDriver::quit);
                                                 }
                                             }
        );
    }

    public static void addDriver(AndroidDriver driver) {
        aStoreDrivers.add(driver);
        aDrivers.set(driver);
    }

    public static void addDriver(IOSDriver<IOSElement> driver) {
        iStoreDrivers.add(driver);
        iDrivers.set(driver);
    }

    public static WebDriver getDriver() {

        if(GlobalVars.getVar(EGlobalVars.SYSTEM_OPERATION).toUpperCase().equals("ANDROID"))
            return aDrivers.get();
        else
            return iDrivers.get();
    }

    public static void removeDriver() {

        if(GlobalVars.getVar(EGlobalVars.SYSTEM_OPERATION).toUpperCase().equals("ANDROID"))
            aStoreDrivers.remove(aDrivers.get());
        else
            iStoreDrivers.remove(iDrivers.get());
    }
}
