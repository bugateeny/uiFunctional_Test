package newTourPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class NewToursConfirmationPage extends NewTBasePage_WebElement {


    public NewToursConfirmationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css ="p>font>b")
    private WebElement dearLocator;

    @FindBy(css ="a>font>b")
    private WebElement noteLocator;


    @FindBy(xpath ="//a[@href='mercurysignoff.php']")
    private WebElement signOffLocator;



    public String getDearContent(){

        return dearLocator.getText();
    }
    public String getNoteContent(){
        return noteLocator.getText();
    }

    public void clickOnSignOff(){
        click(signOffLocator);
    }
}
