package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class  AssertsHelpers {

    static helpers.WaitHelpers waitHelpers = new helpers.WaitHelpers();

    //Assert Equals
    public static void equals(String value1, String value2) {
        try {
            Assert.assertEquals(value1, value2);
        } catch (Exception e) {
            Assert.fail();
            new Exception(e);
        }
    }


    public static void equals(WebDriver driver, WebElement element, String value2, int index, String splitBy) {

        try {
            waitHelpers.visible(driver, element);
            String[] value = element.getText().split(splitBy);

            Assert.assertEquals(value[index], value2);

        } catch (Exception e) {
            Assert.fail();
            new Exception(e);
        }
    }

    //Assert Equals
    public static void equals(WebDriver driver, By element, String value2) {

        try {

            waitHelpers.visible(driver, element);
            String value = driver.findElement(element).getText();

            Assert.assertEquals(value, value2);

        } catch (Exception e) {
            Assert.fail();
            new Exception(e);
        }
    }

    //Assert Equals
    public static void equals(WebDriver driver, WebElement element, String value2) {

        try {

            waitHelpers.visible(driver, element);
            String value = element.getText();

            if(value.equals(""))
                value = element.getAttribute("value");

            Assert.assertEquals(value, value2);

        } catch (Exception e) {
            Assert.fail();
            new Exception(e);
        }
    }

    //Assert Contains
    public static void contains(WebDriver driver, By element, String value2) {

        try {

            waitHelpers.visible(driver, element);
            String value = driver.findElement(element).getText();

            Boolean flag = value.contains(value2);
            Assert.assertTrue(flag);

        } catch (Exception e) {
            Assert.fail();
            new Exception(e);
        }
    }

    //Assert Contains
    public static void contains(WebDriver driver, WebElement element, String value2) {

        try {

            waitHelpers.visible(driver, element);
            String value = element.getText();

            Boolean flag = value2.contains(value);
            Assert.assertTrue(flag);

        } catch (Exception e) {
            Assert.fail();
            new Exception(e);
        }
    }



    //Assert Exist
    public static void exist(WebDriver driver, By element) {

        try {

            waitHelpers.visible(driver, element);

            boolean value = driver.findElement(element).isDisplayed();
            Assert.assertTrue(value);

        } catch (Exception e) {
            Assert.fail();
            new Exception(e);
        }
    }

    //Assert Exist
    public static void exist(WebDriver driver, WebElement element) {

        try {

            waitHelpers.visible(driver, element);

            boolean value = element.isDisplayed();
            Assert.assertTrue(value);

        } catch (Exception e) {
            Assert.fail();
            new Exception(e);
        }
    }

    //Assert no Exist
    public static void noExist(WebDriver driver, By element) {

        try {
            waitHelpers.invisible(driver, element);

            driver.findElement(element);
            Assert.assertTrue(false);

        } catch (org.openqa.selenium.NoSuchElementException e) {

        } catch (Exception e) {
            Assert.fail();
            new Exception(e);
        }
    }

    //Assert no Exist
    public static void noExist(WebDriver driver, WebElement element) {

        try {
            waitHelpers.invisible(driver, element);

            boolean ele = element.isDisplayed();
            Assert.assertTrue(!ele);

        } catch (org.openqa.selenium.NoSuchElementException e) {

        } catch (Exception e) {
            Assert.fail();
            new Exception(e);
        }
    }


}
