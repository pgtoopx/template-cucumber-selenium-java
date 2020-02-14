package cucumber.Page;

import io.appium.java_client.MobileElement;
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
    //@AndroidFindBy(xpath = "//*[@text='SALTAR']")
    @FindBy(xpath="//*[@text='SALTAR']")
    private MobileElement btnSaltar;
    //*[@content-desc='RUT']
    //@AndroidFindBy(xpath = "//*[@content-desc='RUT']")
    //private MobileElement inputRut;
    //@AndroidFindBy(accessibility = "//*[@content-desc='RUT']")
    //private MobileElement inputRut2;
    /*@FindBy(xpath = "//*[contains(@contentDescription, 'Ingresar RUT')]")
    private MobileElement inputRut3;*/
    @FindBy(xpath="//*[contains(@contentDescription, 'Ingresar RUT')]")
    private MobileElement inputRut4;
    //@AndroidFindBy(xpath = "//*[contains(@contentDescription, 'Ingresar RUT')]")
    //MobileElement inputRut3 = (MobileElement) driver.findElementsByXPath("//*[contains(@contentDescription, 'Ingresar RUT')]");
    //@AndroidFindBy(xpath = "//*[contains(@contentDescription, 'Ingresar Clave internet')]")
    //MobileElement inputPassword;
    /*@AndroidFindBy(xpath = "//*[@content-desc='Ingresar Clave internet')]")
    private MobileElement inputPassword;*/
    @FindBy(xpath="//*[@content-desc='Ingresar Clave internet')]")
    private MobileElement inputPassword;
    @FindBy(xpath="//*[@text='INICIAR']")
    private MobileElement btnIniciar;


    //METODOS
    //public LoginPage() {
     //   PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    //}
    //public boolean  BtnSaltar() { return Utils.estaElementoDesplegado(btnSaltar); }
    //public String   getPlaceholderInputContrasenaLogin(){ return Utils.obtenerPlaceHolder(inputContrasena);}
    //public boolean  InputRut1() { return Utils.estaElementoDesplegado(inputRut); }
    //public boolean  InputRut2() { return Utils.estaElementoDesplegado(inputRut2); }
    //public boolean  InputRut3() { return Utils.estaElementoDesplegado(inputRut3); }
    //public boolean  InputRut4() { return Utils.estaElementoDesplegado(inputRut4); }
    //public boolean  InputPassword() { return Utils.estaElementoDesplegado(inputPassword); }
    //public boolean  BtnIniciar() { return Utils.estaElementoDesplegado(btnIniciar); }

    //public void     SetUser(String usuario) { inputRut.sendKeys(usuario); }
    //public void     SetUser1(String usuario) { inputRut2.sendKeys(usuario); }
    //public void     SetUser2(String usuario) { inputRut3.sendKeys(usuario); }
    public void     SetUser3(String usuario) { inputRut4.sendKeys(usuario); }
    public void     SetContrasena(String contrasena) {
        inputPassword.sendKeys(contrasena);
    }
    public void     ClickBtnIniciar() { btnIniciar.click(); }
    public void     ClickBtnSaltar() { btnSaltar.click(); }
    //public String   getTypeContrasena() { return Utils.obtenerAtributoElemento(inputPassword, "type"); }
}
