package pom.login;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import pom.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){

        super(driver);
    }

    // Slide button
    @iOSXCUITFindBy(accessibility = "wt button")
    @AndroidFindBy(id = "wtNextButton")
    public MobileElement btnNextSlide;

    //Button Ingresar desde el slide

    @AndroidFindBy(id = "ViewGroup[4]")
    public MobileElement btnIngresar_1;

    //Input Correo electronico

    @AndroidFindBy(id = "et_login_email")
    public MobileElement inputEmail;

    //Input Contraseña

    @AndroidFindBy(id = "et_login_password")
    public MobileElement inputPassword;

    //Button Ingresar

    @AndroidFindBy(id = "button_sign_in_login")
    public MobileElement btnIngresar;


    }


