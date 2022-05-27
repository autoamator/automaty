package cucumberStepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.support.PageFactory;
import pages.General;
import pages.GoogleMain;

public class PageSteps {

    General general = new General();

    @Given("I open google page")
    public void iOpenGooglePage() throws InterruptedException {
        general.goToPage("https://www.google.com");
    }

    @Given("I close the disclaimer")
    public void iCloseTheDisclaimer(){
        GoogleMain googleMain = PageFactory.initElements(general.driver, GoogleMain.class);
        googleMain.agreeToTerms();

    }

//    @Given("I search for the term (.*)")
//    public void iSearchForTheTerm(String text) {
//        google.searchForSomething("text");
//    }
//
//    @Then("I see some result")
//    public void iSeeSomeResult() throws InterruptedException {
//        TimeUnit.SECONDS.sleep(10);
////        driver.quit();
//    }

}
