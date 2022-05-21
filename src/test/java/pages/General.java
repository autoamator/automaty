package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class General {

    private WebDriver getWebdriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public void goToPage(String url) {
        WebDriver driver = getWebdriver();
        driver.get(url);
        driver.quit();
    }
}
