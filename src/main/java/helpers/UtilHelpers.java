package helpers;

import automation_frontend.utils.getFiles.GetXMLfile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class UtilHelpers {

    public boolean displayed(WebDriver driver, By element) {

        boolean value = false;
        try {

            driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
            value = driver.findElements(element).size() != 0;
            driver.manage().timeouts().implicitlyWait(Integer.parseInt(GetXMLfile.getConfProperties("IMPLICIT_WAIT")), TimeUnit.SECONDS);

        } catch (Exception e) {
            value = false;
        }
        return value;
    }


}
