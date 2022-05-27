package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleMain extends General{

    WebElement agreeButton = driver.findElement(By.xpath("//button[@id='L2AGLb']"));
    WebElement searchButton = driver.findElement(By.name("btnK"));
    WebElement searchBox = driver.findElement(By.name("q"));

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
