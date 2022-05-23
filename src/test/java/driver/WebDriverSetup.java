package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverSetup {

    WebDriver driver;
    public org.openqa.selenium.WebDriver getWebdriver(){
        WebDriverManager.chromedriver().setup();
        driver = WebDriverManager.chromedriver()
                .capabilities(getChromeOptions())
//                .remoteAddress("http://localhost:4444/wd/hub") //using local selenium server
                .browserInDocker()
                .enableVnc().enableRecording()
                .create();
        return driver;
    }

    ChromeOptions getChromeOptions(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        return chromeOptions;
    }
}
