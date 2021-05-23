package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class BaseDriver {

    private static ThreadLocal<AndroidDriver> aDrivers = new ThreadLocal<>();
    private static List<AndroidDriver> aStoreDrivers = new ArrayList<>();

    static {
        Runtime.getRuntime().addShutdownHook(new Thread() {
                                                 public void run() {

                                                     aStoreDrivers.stream().forEach(AndroidDriver::quit);
                                                 }
                                             }
        );
    }

    public static void addDriver(AndroidDriver driver) {
        aStoreDrivers.add(driver);
        aDrivers.set(driver);
    }

    public static WebDriver getDriver() {
        return aDrivers.get();
    }

    public static void removeDriver() {

        aStoreDrivers.remove(aDrivers.get());
    }
}
