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
        loginPage.ClickBtnSaltar();
        Thread.sleep(2000);
    }

    @And("Ingreso mi rut {string} y clave {string}")
    public void ingresoMiUsuarioUsuarioYClaveClave(String rut, String clave) throws InterruptedException {
        loginPage.iniciarSesion(rut, clave);
    }

    @Then("Hago Login en la aplicacion MiPago")
    public void hagoLoginEnLaAplicacionMiPago() {
    }

    @And("Hago Logout de la aplicacion")
    public void hagoLogoutDeLaAplicacion() {

    }
}
