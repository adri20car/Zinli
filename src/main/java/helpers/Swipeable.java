package helpers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public interface Swipeable extends Waitable{

     /*
    SwipeHelpers.drag(BaseAndroidDriver.getDriver(), "//android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.ImageView", 1, 3000, 900);
    SwipeHelpers.swipeHorizontal(BaseAndroidDriver.getDriver(),0.9,0.01,0.5,1000);

For scroll up: swipeVertical((AppiumDriver)driver,0.9,0.1,0.5,3000);

For scroll down: swipeVertical((AppiumDriver)driver,0.1,0.9,0.5,3000);

For right to left: swipeHorizontal((AppiumDriver) driver,0.9,0.01,0.5,3000);

For left to right: swipeHorizontal((AppiumDriver) driver,0.01,0.9,0.5,3000);

    public static void swipeHorizontal(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage, int duration) throws Exception {

        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * finalPercentage);
        new TouchAction(driver).press(PointOption.point(startPoint, anchor)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration))).moveTo(PointOption.point(endPoint, anchor)).release().perform();
    }*/


    default void swipeVertical(double startPercentage, double finalPercentage, double anchorPercentage, int duration) throws Exception {
        Dimension size = getDriver().manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * finalPercentage);
        //new TouchAction((PerformsTouchActions) driver).press(anchor, startPoint).waitAction(Duration.ofMillis(duration)).moveTo(anchor, endPoint).release().perform();
    }

    default void drag(WebElement element, int xOffset, int yOffset) {

        waitForClickable(element);

        TouchAction drag=new TouchAction((AppiumDriver) getDriver());

        int startX=element.getLocation().getX();
        int startY=element.getLocation().getY();

        drag.press(PointOption.point(startX,startY)).moveTo(PointOption.point(xOffset,yOffset)).release().perform();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    default void drag(By element, int xOffset, int yOffset) {

        waitForClickable(element);
        WebElement ele = getDriver().findElement(element);

        TouchAction drag=new TouchAction((AppiumDriver) getDriver());

        int startX=ele.getLocation().getX();
        int startY=ele.getLocation().getY();

        drag.press(PointOption.point(startX,startY)).moveTo(PointOption.point(xOffset,yOffset)).release().perform();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
