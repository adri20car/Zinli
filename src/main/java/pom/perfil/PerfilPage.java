package pom.perfil;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import pom.BasePage;

public class PerfilPage extends BasePage {

    public PerfilPage(WebDriver driver){ super(driver); }

    //PERFIL

    @AndroidFindBy(xpath = "//android.view.View[@text='Perfil']")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement lblPerfil;

    //Nombre y Apellido
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Denisse de los Rios']")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement lblNombreYapellido;

    //Porcentaje del perfil
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Perfil al 70%']")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement lblPorcentaje;

    //Boton MIS DATOS
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='MIS DATOS']")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement btDatos;

    //Capacidad de la billetera
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='La capacidad de tu billetera es de $1,000.00']")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement lblCapacidad;

    //Balance del Mes Actual
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Balance en mayo']")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement lblBalance;

    //Saldo
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Saldo actual']")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement lblSaldo;

    //Ingreo del Mes
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Ingresos del mes']")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement lblIngreso;

    //Medios de Recarga
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Medios de recarga']")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement lblRecarga;

    //Seguridad
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Seguridad']")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement lblSeguridad;

    //Terminos y Condiciones
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Términos y condiciones']")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement lblTerminos;

    //Invitar a un Amigo
    // @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Invitar a un amigo')]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Invitar a un amigo')]")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement lblInvitar;

    //Version APP
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Versión 1.0.0 - Compilación 108']")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement lblVersion;

    //Cerrar sesion
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='CERRAR SESIÓN']")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement btnCerrar;

}