package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public interface Inputable extends helpers.Waitable {

    default void sendKey(By element, String value){

        try {
            waitForVisible(element);
            getDriver().findElement(element).sendKeys(value);
        }catch (Exception e){
            Assert.fail();
            new Exception(e);
        }
    }

    default void sendKey(WebElement element, String value){
        try {
            waitForVisible(element);
            element.sendKeys(value);
        }catch (Exception e){
            Assert.fail();
            new Exception(e);
        }
    }

    default void sendKey(WebElement element, String value, WebElement waitForElement){
        try {
            waitForVisible(element);
            element.sendKeys(value);
        }catch (Exception e){
            Assert.fail();
            new Exception(e);
        }
    }
}
