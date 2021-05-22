package pom.home;

import pom.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){ super(driver); }

    //Label - User Name
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Hola,')]")
    @AndroidFindBy(id = "user_label")
    public MobileElement lblUserName;

    //Accounts
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='CUENTAS'])[1]")
    @AndroidFindBy(id = "action_accounts")
    public MobileElement btnAccounts;

    //Menu Options
    public By BtnMenuOption(String option) {return By.xpath("//android.widget.TextView[contains(@text,'" + option + "')]");}

}