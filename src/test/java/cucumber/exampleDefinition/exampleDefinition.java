package cucumber.exampleDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class exampleDefinition {
    @Given("i am on google search page")
    public void i_am_on_google_search_page() {
        // Write code here that turns the phrase above into concrete actions
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
