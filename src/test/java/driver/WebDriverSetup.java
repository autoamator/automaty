package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebDriverSetup {
    private static final Logger logger = LoggerFactory.getLogger(WebDriverSetup.class);
    WebDriver driver;

    public WebDriver getWebdriver(){
        WebDriverManager wdm = WebDriverManager.chromedriver()
                .capabilities(getChromeOptions())
                .browserInDocker()
                .enableVnc();
        driver = wdm.create();
        logger.info("Docker VNC url: " + wdm.getDockerNoVncUrl());
        return driver;
    }

    ChromeOptions getChromeOptions(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        return chromeOptions;
    }
}
