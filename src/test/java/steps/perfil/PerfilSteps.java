package steps.perfil;

import helpers.AssertsHelpers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pom.home.HomePage;
import pom.perfil.PerfilPage;
import steps.BaseSteps;


public class PerfilSteps extends BaseSteps {

    PerfilPage perfilPage = new PerfilPage(this.driver);

    @Then("Validar Nombre y apellido {string}")
    public void perfil(String nombreYapellido){
        //Perfil
        AssertsHelpers.equals(perfilPage.lblNombreYapellido.getText(), nombreYapellido);
    }
}
