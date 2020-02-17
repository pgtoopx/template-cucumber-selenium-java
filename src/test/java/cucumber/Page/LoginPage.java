package cucumber.Page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidMobileCommandHelper;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    WebDriver driver;

    public LoginPage (WebDriver driver){
        super(driver);
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//*[@text='SALTAR']")
    private MobileElement btnSaltar;

    @FindBy(xpath="//*[contains(@contentDescription, 'Ingresar RUT')]")
    private MobileElement inputRut4;

    @FindBy(xpath="//*[@content-desc='Ingresar Clave internet')]")
    private MobileElement inputPassword;

    @FindBy(xpath="//*[@text='INICIAR']")
    private MobileElement btnIniciar;


    public void     SetUser3(String usuario) { inputRut4.sendKeys(usuario); }
    public void     SetContrasena(String contrasena) {
        inputPassword.sendKeys(contrasena);
    }
    public void     ClickBtnIniciar() { btnIniciar.click(); }
    public void     ClickBtnSaltar() {
        waitUntilElementIsVisible(btnSaltar);
        btnSaltar.click();
    }

}
