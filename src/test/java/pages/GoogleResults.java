package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleResults extends General{

    @FindBy(xpath = "//a[h3[text()='Kiszka ziemniaczana – Wikipedia, wolna encyklopedia'] and ancestor::div[@data-sokoban-container]]")
    private WebElement searchResultKiszka;

    @FindBy(xpath = "//a[@title='Przejdź do strony głównej Google']")
    private WebElement logo;

    public GoogleResults (){
        PageFactory.initElements(driver, this);
    }

    public void openSearchResultKiszka(){
        searchResultKiszka.click();
    }

    public boolean isKiszkaZiemniaczanaVisibleInResults(){
        return searchResultKiszka.isDisplayed();
    }
}
