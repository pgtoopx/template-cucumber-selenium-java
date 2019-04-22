package cucumber.exampleDefinition;

import cucumber.Hooks;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class exampleDefinition {
    WebDriver browser;
    private String URL_GOOGLE = "http://www.google.com";
    private WebDriver driver;

    public exampleDefinition(){
        driver= Hooks.driver;
    }

    @Given("i am on google search page")
    public void i_am_on_google_search_page() {
        driver.get(URL_GOOGLE);
    }

    @When("i search for {string}")
    public void i_search_for(String string) {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("the tittle have to contain {string}")
    public void the_tittle_have_to_contain(String string) {
        // Write code here that turns the phrase above into concrete actions
    }
}
