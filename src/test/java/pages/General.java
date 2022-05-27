package pages;

import driver.WebDriverSetup;
import org.openqa.selenium.WebDriver;

public class General {

    public static WebDriver driver = new WebDriverSetup().getWebdriver();
    public void goToPage(String url) throws InterruptedException {
        driver.get(url);
//        TimeUnit.SECONDS.sleep(10);
    }
}
