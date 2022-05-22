package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleMain extends General{

    WebElement agreeButton = webDriver.getWebdriver().findElement(By.id("L2AGLb"));
    WebElement searchButton = webDriver.getWebdriver().findElement(By.name("btnK"));
    WebElement searchBox = webDriver.getWebdriver().findElement(By.name("q"));

    public void searchForSomething(String text){
        enterSearchTerm(text);
        pressSearchButton();
    }
    private void enterSearchTerm(String text){
        searchBox.sendKeys(text);
    }

    private void pressSearchButton(){
        searchButton.click();
    }

    public void agreeToTerms(){
        agreeButton.click();
    }


}
