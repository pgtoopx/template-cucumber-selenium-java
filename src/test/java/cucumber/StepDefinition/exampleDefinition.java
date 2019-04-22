package cucumber.StepDefinition;

import cucumber.Page.ExamplePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class exampleDefinition {
    private String URL_GOOGLE = "http://www.google.com";
    private WebDriver driver;
    ExamplePage examplePage;
    public exampleDefinition(){
        driver= Hooks.driver;
    }

    @Given("i am on google search page")
    public void i_am_on_google_search_page() {
        driver.get(URL_GOOGLE);
        examplePage = new ExamplePage(driver);
    }

    @When("i search for {string}")
    public void i_search_for(String string) {
        examplePage.setInputQ(string);
        examplePage.submitInputQ();
    }

    @Then("the tittle have to contain {string}")
    public void the_tittle_have_to_contain(String string) {
        Assert.assertTrue(driver.getTitle().contains(string));
    }
}
