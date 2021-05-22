package steps.home;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import pom.home.HomePage;
import steps.BaseSteps;


public class HomeSteps extends BaseSteps {

    HomePage homePage = new HomePage(this.driver);

    @When("El usuario hace click en perfil")
    public void perfil(){
        //Perfil
        homePage.click(homePage.btnPerfil);
    }
}
