package steps.login;

import helpers.AssertsHelpers;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import pom.home.HomePage;
import pom.login.LoginPage;
import steps.BaseSteps;

public class LoginSteps extends BaseSteps {

    private final LoginPage loginPage = new LoginPage(driver);
    private final HomePage homePage = new HomePage(driver);

    @Dado("El usuario Avanza en los sliders de beneficiones informativos")
    public void sliderSinLimite(){
        //slider
        loginPage.click(loginPage.btnSlideSinLimite);
        loginPage.click(loginPage.btnSlideDistancia);
        loginPage.click(loginPage.btnSlideSinPreocupaciones);
        loginPage.click(loginPage.btnSlideSinCostos);
        loginPage.click(loginPage.btnIngresar);
    }

    @Cuando("El usuario ingresa con {string} y {string}")
    public void sliderSinLimite(String usuario, String password){
        //usuario
        loginPage.sendKey(loginPage.inputEmail, usuario);
        //password
        loginPage.sendKey(loginPage.inputPassword, password);
        //click ingresar
        loginPage.click(loginPage.btnIngresarApp);
        //Validar que estamos en la home
        AssertsHelpers.exist(driver,homePage.btnPerfil);

    }












}
