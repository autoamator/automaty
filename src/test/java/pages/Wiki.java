package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wiki  extends General{
    @FindBy(xpath = "//a[@class='mw-wiki-logo']")
    private WebElement wikiLogo;
    @FindBy(xpath = "//p[contains(text(),'W wersji polskiej jest to jelito wieprzowe wypełnione')]")
    private WebElement kiszkaContent;

    public Wiki (){
        PageFactory.initElements(driver, this);
    }

    public boolean isWikiPageOpened(){
        return wikiLogo.isDisplayed();
    }

    public boolean isProperContentDisplayed(){
        return kiszkaContent.isDisplayed();
    }




}
