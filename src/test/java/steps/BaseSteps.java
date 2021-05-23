package steps;

import base.BaseDriver;
import helpers.WaitHelpers;
import org.openqa.selenium.WebDriver;

public class BaseSteps {


    public WebDriver driver = BaseDriver.getDriver();

    public WaitHelpers waitHelpers = new WaitHelpers();

}
