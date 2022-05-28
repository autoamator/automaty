package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.Keys;

public class GoogleMain extends General{

    @FindBy(xpath = "//button[@id='L2AGLb']")
    private WebElement agreeButton;
    @FindBy(name ="btnK")
    private WebElement searchButton;
    @FindBy(name = "q")
    private WebElement searchBox;
    @FindBy(xpath = "//span[b[text()=' ziemniaczana']]")
    private WebElement someSuggestion;

    public GoogleMain (){
        PageFactory.initElements(driver, this);
    }
    public void searchForSomething(String text) {
        enterSearchTerm(text);
//        clickSearchSuggestion();
    }
    private void enterSearchTerm(String text) {
        searchBox.sendKeys(text);
        searchBox.sendKeys(Keys.RETURN);
    }

    public void agreeToTerms(){
        agreeButton.click();
    }

    public void clickSearchSuggestion(){
        webDriverWait.until(ExpectedConditions.visibilityOf(someSuggestion));
        someSuggestion.click();
    }


}
