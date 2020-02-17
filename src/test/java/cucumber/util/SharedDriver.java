package cucumber.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.MalformedURLException;

public class SharedDriver {

    public SharedDriver() throws MalformedURLException {
        DriverFactory.addDriver(WebDriverFactory.createWebDriver());
    }
}


