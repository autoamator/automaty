package cucumberStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.General;
import pages.GoogleMain;
import pages.GoogleResults;

import static org.assertj.core.api.Assertions.assertThat;


public class PageSteps {

    General general = new General();

    @Given("I open google page")
    public void iOpenGooglePage() {
        general.goToPage("https://www.google.com");
    }

    @Given("I close the disclaimer")
    public void iCloseTheDisclaimer(){
        GoogleMain googleMain = new GoogleMain();
        googleMain.agreeToTerms();

    }

    @When("I search for the term {string}")
    public void i_search_for_the_term(String text) {
        GoogleMain googleMain = new GoogleMain();
        googleMain.searchForSomething(text);
    }

    @Then("I see the result {string} in result page")
    public void i_see_the_result_in_result_page(String string) {
        GoogleResults googleResults= new GoogleResults();
        assertThat(googleResults.isKiszkaZiemniaczanaVisibleInResults()).isTrue();
    }

}
