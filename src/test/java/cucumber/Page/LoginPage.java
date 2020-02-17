package cucumber.Page;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {


    public LoginPage (WebDriver driver){
        super(driver);
    }

    @AndroidFindBy(xpath="//*[@text='SALTAR']")
    private MobileElement btnSaltar;

    @AndroidFindBy(accessibility="Ingresar RUT")
    private MobileElement inputRut;

    @AndroidFindBy(accessibility="Ingresar Clave internet")
    private MobileElement inputPassword;

    @AndroidFindBy(xpath="//*[@text='INICIAR']")
    private MobileElement btnIniciar;

    public void ClickBtnSaltar() {
        waitUntilElementIsVisible(btnSaltar);
        btnSaltar.click();
    }

    public void iniciarSesion(String rut, String password) throws InterruptedException {
        waitUntilElementIsVisible(inputRut);
        inputRut.setValue(rut);
        waitUntilElementIsVisible(inputPassword);
        inputPassword.setValue(password);
        btnIniciar.click();
    }

}
