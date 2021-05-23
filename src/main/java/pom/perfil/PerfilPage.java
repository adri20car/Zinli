package pom.perfil;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import pom.BasePage;

public class PerfilPage extends BasePage {

    public PerfilPage(WebDriver driver){ super(driver); }

    //nombre y apellido
    @iOSXCUITFindBy(xpath = "pending")
    @AndroidFindBy(xpath = "")
    public MobileElement lblNombreYapellido;
    public MobileElement lblPorcentaje;
    public MobileElement lblDatos;
    public MobileElement lblCapacidad;
    public MobileElement lblBalance;
    public MobileElement lblSaldo;
    public MobileElement lblIngreso;
    public MobileElement lblRecarga;
    public MobileElement lblSeguridad;
    public MobileElement lblTerminos;
    public MobileElement lblInvitar;
    public MobileElement lblVersion;
    public MobileElement btnCerrar;


}