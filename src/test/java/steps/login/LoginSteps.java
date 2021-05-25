package steps.login;

import helpers.AssertsHelpers;
import io.cucumber.java.en.Given;
import pom.home.HomePage;
import pom.login.LoginPage;
import steps.BaseSteps;

public class LoginSteps extends BaseSteps {

    private final LoginPage loginPage = new LoginPage(driver);
    private final HomePage homePage = new HomePage(driver);


    @Given("El usuario ingresa con {string} y {string}")

    public void Home(String usuario, String password){

        loginPage.click(loginPage.btnIngresarApp);

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
