package cucumber.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExamplePage {
    WebDriver driver;

    @FindBy(name="q")
    WebElement inputQ;

    public ExamplePage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    public void setInputQ(String qText){
        inputQ.sendKeys(qText);
    }

    public void submitInputQ(){
        inputQ.submit();
    }
}
