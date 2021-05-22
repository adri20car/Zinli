package steps.login;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import pom.login.LoginPage;
import steps.BaseSteps;

public class LoginSteps extends BaseSteps {

    private final LoginPage loginPage = new LoginPage(driver);

    @Dado("Ingresa con las credenciales {string} y {string}")
    public void login(String userEmail, String userPassword){

        //Avanza en los slaider
        loginPage.click(loginPage.btnNextSlide);
        loginPage.click(loginPage.btnNextSlide);
        loginPage.click(loginPage.btnNextSlide);
        loginPage.click(loginPage.btnNextSlide);

        //Button - Ingresar_1
        loginPage.click(loginPage.btnIngresar_1);

        //Input - Email
        loginPage.sendKey(loginPage.inputEmail, userEmail);

        //Input - Password
        loginPage.sendKey(loginPage.inputPassword, userPassword);

        //Button - Ingresar_2
        loginPage.click(loginPage.btnIngresar);


    }

    @Dado("Ingresa a la app y avanza en los sliders")
    public void advanceSlider(){
        //slider
        loginPage.click(loginPage.btnNextSlide);
        loginPage.click(loginPage.btnNextSlide);
        loginPage.click(loginPage.btnNextSlide);
    }

    @Cuando("Selecciona el boton Ingresar")
    public void selectCreateAccount(){
        loginPage.click(loginPage.btnIngresar_1);
    }
}
