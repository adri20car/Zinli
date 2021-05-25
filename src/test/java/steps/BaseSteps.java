package steps;

import base.BaseDriver;
import helpers.WaitHelpers;
import io.appium.java_client.android.AndroidDriver;


public class BaseSteps {


    public AndroidDriver driver = (AndroidDriver) BaseDriver.getDriver();

    public WaitHelpers waitHelpers = new WaitHelpers();

}
