package cucumber.StepDefinition;

import cucumber.Page.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.util.DriverFactory;
import cucumber.util.SharedDriver;
import org.openqa.selenium.WebDriver;


public class LoginDef {
    LoginPage loginPage;

    public LoginDef(SharedDriver driver){
        loginPage = new LoginPage(DriverFactory.getDriver());
    }

    @Given("Soy Usuario de la aplicacion MiPago")
    public void soyUsuarioDeLaAplicacionMiPago() throws InterruptedException {
    }

    @When("Salto el proceso de bienvenida")
    public void saltoElProcesoDeBienvenida() throws InterruptedException {
        loginPage.ClickBtnSaltar();
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
