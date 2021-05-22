package pom.login;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import pom.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){

        super(driver);
    }


    //Button Ingresar desde el slide sin limite
    @AndroidFindBy(xpath = "ViewGroup[4]")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement btnSlideSinLimite;

    //Button Ingresar desde el slide distancia
    @AndroidFindBy(xpath = "")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement btnSlideDistancia;

    //Button Ingresar desde el slide sin preocupaciones
    @AndroidFindBy(xpath = "")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement btnSlideSinPreocupaciones;

    //Button Ingresar desde el slide sin costos
    @AndroidFindBy(xpath = "")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement btnSlideSinCostos;

    //Button Ingresar
    @AndroidFindBy(xpath = "")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement btnIngresar;

    //Input Correo electronico
    @AndroidFindBy(id = "et_login_email")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement inputEmail;

    //Input Contraseña
    @AndroidFindBy(id = "et_login_password")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement inputPassword;

    //Button Ingresar
    @AndroidFindBy(id = "button_sign_in_login")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement btnIngresarApp;







    }


