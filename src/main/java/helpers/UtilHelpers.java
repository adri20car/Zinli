package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class UtilHelpers {

    public boolean displayed(WebDriver driver, By element) {

        boolean value = false;
        try {

            driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
            value = driver.findElements(element).size() != 0;
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        } catch (Exception e) {
            value = false;
        }
        return value;
    }


}
