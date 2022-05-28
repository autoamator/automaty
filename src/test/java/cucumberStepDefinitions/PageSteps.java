package cucumberStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.General;
import pages.GoogleMain;
import pages.GoogleResults;
import pages.Wiki;

import static org.assertj.core.api.Assertions.*;


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

    @Then("I see the proper result in result page")
    public void i_see_the_result_in_result_page() {
        GoogleResults googleResults= new GoogleResults();
        assertThat(googleResults.isKiszkaZiemniaczanaVisibleInResults()).isTrue();
    }

    @Then("I click the result")
    public void i_click_the_result() {
        GoogleResults googleResults= new GoogleResults();
        googleResults.openSearchResultKiszka();
    }
    @Then("proper page opens")
    public void proper_page_opens() {
        Wiki wiki = new Wiki();
        assertThat(wiki.isWikiPageOpened()).isTrue();
        assertThat(wiki.isProperContentDisplayed()).isTrue();
    }

}
