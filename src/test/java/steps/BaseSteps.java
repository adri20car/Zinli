package steps;

import base.BaseDriver;
import helpers.WaitHelpers;
import pom.common.CommonPage;
import utils.operations.MathematicalOperations;
import org.openqa.selenium.WebDriver;

public class BaseSteps {

    public MathematicalOperations mathOperations = new MathematicalOperations();
    public WebDriver driver = BaseDriver.getDriver();
    public CommonPage commonPage = new CommonPage(driver);
    public WaitHelpers waitHelpers = new WaitHelpers();

}
