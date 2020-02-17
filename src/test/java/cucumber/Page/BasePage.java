package cucumber.Page;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static java.util.concurrent.TimeUnit.*;
import static org.awaitility.Awaitility.*;


public class BasePage {

    private static final int WAIT_TIMEOUT = 30;
    private static final int DEFAULT_TIMEOUT = 1;
    private static final int POLLING = 100;
    protected Logger log = LogManager.getLogger(this.getClass());

    final WebDriver driver;
    private final WebDriverWait wait;

    protected BasePage(WebDriver driver){
        this.driver=driver;
        this.wait= new WebDriverWait(driver, WAIT_TIMEOUT, POLLING);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,DEFAULT_TIMEOUT), this);
    }

    protected BasePage(WebDriver driver, int timeOutSec){
        this.driver=driver;
        this.wait= new WebDriverWait(driver, timeOutSec, POLLING);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,DEFAULT_TIMEOUT), this);
    }

    protected BasePage(WebDriver driver, int timeOutSec, int pollingSec){
        this.driver=driver;
        this.wait= new WebDriverWait(driver, timeOutSec, pollingSec);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,DEFAULT_TIMEOUT), this);
    }

    protected WebDriver getDriver(){
        return driver;
    }

    protected void waitForElementToAppear(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void waitForElementToDisappear(WebElement element) {
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    protected void waitForTextToDisappear(WebElement element, String text) {
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(element, text)));
    }

    protected boolean isVisible(WebElement webElement){
        boolean isVisible;
        try {
            return webElement.isDisplayed();
        }catch (NoSuchElementException | StaleElementReferenceException e){
            return false;
        }catch (Exception e){
            log.error(e);
            return false;
        }
    }

    protected boolean isInvisible(WebElement element){
        try {
            return !element.isDisplayed();
        } catch (NoSuchElementException | StaleElementReferenceException e){
            return true;
        }catch (Exception e){
            log.error(e);
            return false;
        }
    }

    public void waitUntilElementIsVisible(WebElement element){
        await().atMost(60, SECONDS).until(()->isVisible(element));
    }

    public void waitUntilElementIsInVisible(WebElement element){
        await().atMost(60, SECONDS).until(()->isInvisible(element));
    }



    protected void waitFor(int segundos){
        try {
            log.debug("Esperando por "+segundos+" segundos");
            log.warn("Usar con precaución!!");
            Thread.sleep(segundos*1000);
        }catch (InterruptedException e){
            log.error(e);
        }
    }

    public byte[] takeScreenshot(){
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}