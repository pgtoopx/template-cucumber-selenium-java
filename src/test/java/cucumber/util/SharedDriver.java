package cucumber.util;

import java.net.MalformedURLException;

public class SharedDriver {

    public SharedDriver() throws MalformedURLException {
        DriverFactory.addDriver(WebDriverFactory.createWebDriver());
    }
}


