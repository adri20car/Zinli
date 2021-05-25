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


    //Button Ingresar desde los slider
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='INGRESAR']")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement btnIngresar;

    //Input Correo electronico
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Correo electrónico']/../../android.widget.EditText")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement inputEmail;

    //Input Contraseña
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Contraseña']/../../android.widget.EditText")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement inputPassword;

    //Button Ingresar
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='INGRESAR']")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement btnIngresarApp;







    }


