package cucumber.Page;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {


    public LoginPage (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//*[@text='SALTAR']")
    private MobileElement btnSaltar;

    @FindBy(xpath="//*[contains(@contentDescription, 'Ingresar RUT')]")
    private MobileElement inputRut;

    @FindBy(xpath="//*[@content-desc='Ingresar Clave internet')]")
    private MobileElement inputPassword;

    @FindBy(xpath="//*[@text='INICIAR']")
    private MobileElement btnIniciar;

    public void ClickBtnSaltar() {
        waitUntilElementIsVisible(btnSaltar);
        btnSaltar.click();
    }

    public void iniciarSesion(String rut, String password){
        waitUntilElementIsVisible(inputRut);
        inputRut.setValue(rut);
        waitUntilElementIsVisible(inputPassword);
        inputRut.setValue(password);
        waitUntilElementIsVisible(btnIniciar);
        btnIniciar.click();
    }

}
