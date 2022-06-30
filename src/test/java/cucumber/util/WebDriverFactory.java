package cucumber.util;

import com.browserstack.local.Local;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;

public class WebDriverFactory {
    //private String PATH_SAFARI_DRIVER = "/usr/bin/safaridriver";
    public static WebDriver createWebDriver() throws Exception {
        String webdriver = System.getProperty("browser", "chrome");
        boolean bsLocal = System.getenv("BS_LOCAL").equals("true");
        Local local;
        switch(webdriver) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            case "chrome":
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case "bs-chrome":
                if(bsLocal){
                    local = new Local();
                    HashMap<String, String> bsLocalArgs = new HashMap<String, String>();
                    bsLocalArgs.put("key", "CmFt243AEbpXbFWqzarn");
                    local.start(bsLocalArgs);
                }
            case "safari":
                //TODO: implement SafariDriver to factory
                //return new SafariDriver();
                //throw new RuntimeException("Unsupported webdriver: " + webdriver);
            default:
                throw new RuntimeException("Unsupported webdriver: " + webdriver);
        }
    }
}
