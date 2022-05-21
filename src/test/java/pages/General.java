package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class General {

    WebDriver driver;
    private WebDriver getWebdriver(){

        WebDriverManager.chromedriver().setup();
        driver = WebDriverManager.chromedriver()
                .capabilities(getChromeOptions())
                .remoteAddress("http://localhost:4444/wd/hub").create(); //using local selenium server
        return driver;
    }

    public void goToPage(String url) throws InterruptedException {
        WebDriver driver = getWebdriver();
        driver.get(url);
        TimeUnit.SECONDS.sleep(10);
        driver.quit();
    }

    ChromeOptions getChromeOptions(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        return chromeOptions;
    }
}
