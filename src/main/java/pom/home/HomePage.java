package pom.home;

import pom.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){ super(driver); }

    //Perfil
    @iOSXCUITFindBy(xpath = "pending")
    @AndroidFindBy(xpath = "")
    public MobileElement btnPerfil;

}