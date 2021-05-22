package pom.common;

import pom.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;

public class CommonPage extends BasePage {

    public CommonPage(WebDriver driver){ super(driver); }

    //Spinner
    @iOSXCUITFindBy(xpath = "pending")
    @AndroidFindBy(id = "progress_bar")
    public MobileElement lblSpinner;

    //Drag confirmation button
    @iOSXCUITFindBy(accessibility = "slider_arrow")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Deslizá para confirmar' or @text='Deslizá para pagar']//..//android.widget.ImageView")
    public MobileElement btnConfirmOperation;




}
