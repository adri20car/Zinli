package steps.perfil;

import helpers.AssertsHelpers;

import io.cucumber.java.en.Then;

import pom.perfil.PerfilPage;
import steps.BaseSteps;


public class PerfilSteps extends BaseSteps {

    PerfilPage perfilPage = new PerfilPage(this.driver);

    @Then("Validar Nombre y apellido {string}")
    public void perfil(String nombreYapellido){
        //Nombre y Apellido
        AssertsHelpers.equals(perfilPage.lblNombreYapellido.getText(), nombreYapellido);
    }
    @Then("Validar porcentaje de perfil {string}")
    public void porcentaje(String porcentaje){
        //Porcentaje
        AssertsHelpers.equals(perfilPage.lblPorcentaje.getText(), porcentaje);
    }
    @Then("Validar Boton MIS DATOS {string}")
    public void btdatos(String datos){
        //Boton Mis Datos
        AssertsHelpers.equals(perfilPage.lblDatos.getText(), datos);
    }
    @Then("Validar Capacidad {string}")
    public void capacidad(String capacidad){
        //Capacidad
        AssertsHelpers.equals(perfilPage.lblCapacidad.getText(), capacidad);
    }
    @Then("Validar Balance {string}")
    public void balance(String balance){
        //Balance del Mes
        AssertsHelpers.equals(perfilPage.lblBalance.getText(), balance);
    }
    @Then("Validar Saldo {string}")
    public void saldo(String saldo){
        //Balance del Mes
        AssertsHelpers.equals(perfilPage.lblSaldo.getText(), saldo);
    }
    @Then("Validar Ingresos {string}")
    public void ingreso(String ingresos){
        //Ingresos del Mes
        AssertsHelpers.equals(perfilPage.lblIngreso.getText(), ingresos);
    }
    @Then("Validar Medios de Recarga {string}")
    public void recarga(String recarga){
        //Medios de Recarga
        AssertsHelpers.equals(perfilPage.lblRecarga.getText(), recarga);
    }
    @Then("Validar Seguridad {string}")
    public void seguridad(String seguridad){
        //Seguridad
        AssertsHelpers.equals(perfilPage.lblSeguridad.getText(), seguridad);
    }
    @Then("Validar Terminos y condiciones {string}")
    public void terminos(String terminos){
        //Terminos y Condiciones
        AssertsHelpers.equals(perfilPage.lblTerminos.getText(), terminos);
    }
    @Then("Validar Invitar a un amigo {string}")
    public void invitar(String invitar){
        //Invitar a un amigo
        AssertsHelpers.equals(perfilPage.lblInvitar.getText(), invitar);
    }
    @Then("Validar Versión {string}")
    public void version(String version){
        //Versión
        AssertsHelpers.equals(perfilPage.lblVersion.getText(), version);
    }
    @Then("Validar CERRAR SESIÓN {string}")
    public void cerrar(String cerrar){
        //Versión
        AssertsHelpers.equals(perfilPage.btnCerrar.getText(), cerrar);
    }

}
