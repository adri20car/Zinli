package pom.perfil;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import pom.BasePage;

public class PerfilPage extends BasePage {

    public PerfilPage(WebDriver driver){ super(driver); }

    //nombre y apellido
    @iOSXCUITFindBy(xpath = "pending")
    @AndroidFindBy(xpath = "")
    public MobileElement lblNombreYapellido;

}