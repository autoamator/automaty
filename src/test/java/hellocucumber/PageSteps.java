package hellocucumber;

import io.cucumber.java.en.Given;
import pages.General;

public class PageSteps {

    General general = new General();

    @Given("I open the page")
    public void iOpenThePage() throws InterruptedException {
        general.goToPage("https://www.onet.pl");

    }
}
