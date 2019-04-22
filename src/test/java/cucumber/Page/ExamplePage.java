package cucumber.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExamplePage extends BasePage {
    WebDriver driver;


    @FindBy(name="q")
    WebElement inputQ;

    public ExamplePage(WebDriver driver){
        super(driver);
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }



    public void setInputQ(String qText){
        waitForElementToBeVisible(inputQ);
        inputQ.sendKeys(qText);
    }

    public void submitInputQ(){
        inputQ.submit();
    }
}
