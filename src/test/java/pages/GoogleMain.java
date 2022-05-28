package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleMain extends General{

    @FindBy(xpath = "//button[@id='L2AGLb']")
    private WebElement agreeButton;
    @FindBy(name ="btnK")
    private WebElement searchButton;
    @FindBy(name = "q")
    private WebElement searchBox;

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
        driver.getPageSource();
        agreeButton.click();
    }


}
