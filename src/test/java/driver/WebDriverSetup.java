package driver;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class WebDriverSetup {

    WebDriver driver;
    public org.openqa.selenium.WebDriver getWebdriver(){
        WebDriverManager.chromedriver().setup();
        driver = WebDriverManager.chromedriver()
                .capabilities(getChromeOptions())
                .remoteAddress("http://localhost:4444/wd/hub").create(); //using local selenium server
        return driver;
    }

    ChromeOptions getChromeOptions(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        return chromeOptions;
    }
}
