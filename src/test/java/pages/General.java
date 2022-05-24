package pages;

import driver.WebDriverSetup;

import java.util.concurrent.TimeUnit;

public class General {

    WebDriverSetup webDriver = new WebDriverSetup();
    public void goToPage(String url) throws InterruptedException {
        org.openqa.selenium.WebDriver driver = webDriver.getWebdriver();
        driver.get(url);
        TimeUnit.SECONDS.sleep(3);
        driver.quit();
    }
}
