package cucumber.StepDefinition;

import cucumber.Page.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class LoginDef {
    //String urlSitio = "";
    private WebDriver driver;
    LoginPage loginPage;

    public LoginDef(){ driver= Hooks.driver; }

    @Given("Soy Usuario de la aplicacion MiPago")
    public void soyUsuarioDeLaAplicacionMiPago() throws InterruptedException {
        Thread.sleep(2000);
    }

    @When("Salto el proceso de bienvenida")
    public void saltoElProcesoDeBienvenida() throws InterruptedException {
        //assertTrue("No se visualiza boton SALTAR de bienvenida", MiPagoMainTest.loginPage.BtnSaltar());
        Thread.sleep(2000);
        loginPage.ClickBtnSaltar();
        Thread.sleep(2000);
    }

    @And("Ingreso mi usuario {string} y clave {string}")
    public void ingresoMiUsuarioUsuarioYClaveClave(String usuario, String clave) throws InterruptedException {
        //assertTrue("No se visualiza boton SALTAR de bienvenida", loginPage.BtnSaltar());
        loginPage.SetUser3(usuario);
        Thread.sleep(3000);
        //Utils.pausa(1, this.getClass());
        //MiPagoMainTest.loginPage.SetUser1(usuario);
        //Utils.pausa(1, this.getClass());
        //MiPagoMainTest.loginPage.SetUser2(usuario);
        //Utils.pausa(1, this.getClass());
        //MiPagoMainTest.loginPage.SetUser3(usuario);
        //Utils.pausa(1, this.getClass());

        loginPage.SetContrasena(clave);
        Thread.sleep(2000);
    }

    @And("Hago clic en boton INICIAR")
    public void hagoClicEnBotonINICIAR() throws InterruptedException {
        Thread.sleep(2000);
        loginPage.ClickBtnIniciar();
        Thread.sleep(2000);
    }

    @Then("Hago Login en la aplicacion MiPago")
    public void hagoLoginEnLaAplicacionMiPago() {
    }

    @And("Hago Logout de la aplicacion")
    public void hagoLogoutDeLaAplicacion() {

    }
}
