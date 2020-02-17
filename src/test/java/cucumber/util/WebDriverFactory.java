package cucumber.util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverFactory {
    //private String PATH_SAFARI_DRIVER = "/usr/bin/safaridriver";
    public static WebDriver createWebDriver() throws MalformedURLException {
        String webdriver = System.getProperty("browser", "mobile");
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
                //throw new RuntimeException("Unsupported webdriver: " + webdriver);
            case "mobile":
                String userName = "ceavilaj1";
                String accessKey = "DETgaorNKhbyqm6yyKwU";
                String urlBrowserStack = String.format("https://%s:%s@hub-cloud.browserstack.com/wd/hub",
                        userName, accessKey);
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("device", "Samsung Galaxy S8");
                caps.setCapability("os_version", "7.0");
                caps.setCapability("project", "MiPago");
                caps.setCapability("build", "TEST");
                caps.setCapability("name", "MIPAGO_TEST");
                caps.setCapability("app", "bs://e8c0aeb0761dc03463ddb8539e2f993eff43317b");
                caps.setCapability("automationName","uiautomator2");
                caps.setCapability("browserstack.appiumLogs",true);
                caps.setCapability("browserstack.debug",true);
                caps.setCapability("browserstack.deviceLogs",true);
                caps.setCapability("browserstack.local",false);
                caps.setCapability("browserstack.networkLogs",true);
                caps.setCapability("browserstack.video",true);
                caps.setCapability("browserstack.video.disableWaterMark",true);
                return new AndroidDriver<AndroidElement>(new URL(urlBrowserStack), caps);
            default:
                throw new RuntimeException("Unsupported webdriver: " + webdriver);
        }
    }
}
