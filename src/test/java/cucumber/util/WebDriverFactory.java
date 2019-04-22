package cucumber.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {



    public static WebDriver createWebDriver() {
        String webdriver = System.getProperty("browser", "chrome");
        switch(webdriver) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            case "chrome":
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case "safari":
                //TODO: implement SafariDriver to factory
                //return new SafariDriver();
                throw new RuntimeException("Unsupported webdriver: " + webdriver);
            default:
                throw new RuntimeException("Unsupported webdriver: " + webdriver);
        }
    }
}
