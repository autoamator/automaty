package pages;

import driver.WebDriverSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class General {

    public static WebDriver driver = new WebDriverSetup().getWebdriver();
    public static WebDriverWait webDriverWait= new WebDriverWait(driver, Duration.ofSeconds(10));
    public void goToPage(String url) {
        driver.get(url);
    }
}
