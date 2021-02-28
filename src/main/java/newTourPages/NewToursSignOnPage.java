package newTourPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewToursSignOnPage  extends NewTBasePage_WebElement {
    public NewToursSignOnPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//input[@name='userName']")
    private  WebElement userNameLocator;

//    @FindBy(xpath = "input[@name='userName']")
//    private WebElement userNameLocator;

    @FindBy( = "//input[@name='password']")
    private WebElement passwordLocator;

//    @FindBy ( css = "input[name='userName']")
//    private WebElement confirmPasswordLocator;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement submitButtonLocator;

    @FindBy (xpath = "//img[@src='/images/masts/mast_flightfinder.gif']")
    private WebElement loginConfirmationLocator;


   public void enterUserName(String uName){
       sendKeys(userNameLocator,uName);
    }

   public void enterPassword(String pWord){
       sendKeys(passwordLocator, pWord);
}
    public  void clickOnSubmitButton(){

       click(submitButtonLocator);
    }


}
