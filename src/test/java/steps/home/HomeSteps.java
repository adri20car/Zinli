package steps.home;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import pom.home.HomePage;
import steps.BaseSteps;


public class HomeSteps extends BaseSteps {

    HomePage homePage = new HomePage(this.driver);

    @Dado("Selecciona el perfil")
    public void optionIngresar(){
        //Menu Option
        waitHelpers.visible(this.driver, homePage.BtnIngresar);
        homePage.click(homePage.BtnIngresar("INGRESAR"));
    }

    }

    @Cuando("Selecciona el menu recargar transporte")
    public void optionPhoneRecharge(){
        //Menu Option
        waitHelpers.visible(this.driver, homePage.lblUserName);
        homePage.click(homePage.BtnMenuOption("transporte"));
    }
}
