package steps.home;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pom.home.HomePage;
import steps.BaseSteps;


public class HomeSteps extends BaseSteps {

    HomePage homePage = new HomePage(this.driver);

    @And("El usuario hace click en perfil")
    public void perfil(){
        //Perfil
        homePage.click(homePage.btnPerfil);
    }
}
