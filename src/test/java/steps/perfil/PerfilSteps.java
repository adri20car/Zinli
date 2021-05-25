package steps.perfil;

import helpers.AssertsHelpers;
import io.cucumber.java.en.Then;
import pom.perfil.PerfilPage;
import steps.BaseSteps;



public class PerfilSteps extends BaseSteps {

    PerfilPage perfilPage = new PerfilPage(this.driver);


   @Then("Valida los elementos de perfil")

   public void Perfil() {

       //Valido que estoy en Perfil

       AssertsHelpers.exist(driver, perfilPage.lblPerfil);

       //Validar Nombre y apellido

       AssertsHelpers.exist(driver, perfilPage.lblNombreYapellido);

       //Validar Porcentaje del perfil

       AssertsHelpers.exist(driver, perfilPage.lblPorcentaje);

       //Validar Boton MIS DATOS

       AssertsHelpers.exist(driver, perfilPage.btDatos);

       //Validar Capacidad de la billetera
       AssertsHelpers.exist(driver, perfilPage.lblCapacidad);


       //Validar Balance del Mes
       AssertsHelpers.exist(driver, perfilPage.lblBalance);


       //Validar saldo
       AssertsHelpers.exist(driver, perfilPage.lblSaldo);


       //Validar Ingresos del Mes
       AssertsHelpers.exist(driver, perfilPage.lblIngreso);


       //Validar Medios de Recarga
       AssertsHelpers.exist(driver, perfilPage.lblRecarga);

       //Validar Seguridad
       AssertsHelpers.exist(driver, perfilPage.lblSeguridad);

    // Implementacion necesario para scrolear y appium pueda identificar los elementos que no estaban en el screen principal
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"CERRAR SESIÓN\"));");

      //Validar Terminos y Condiciones
       AssertsHelpers.exist(driver, perfilPage.lblTerminos);

       //Validar Invitar a un amigo
       AssertsHelpers.exist(driver, perfilPage.lblInvitar);

       //Validar Versión de la app
       AssertsHelpers.exist(driver, perfilPage.lblVersion);

       //Validar Cerrar sesion
       perfilPage.click(perfilPage.btnCerrar);

   }

   }

