package ukba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagesForWebElementMethods.BasePage;

//  Checkvisa is child whilst Base page parent
public class CheckVisaPage extends BasePage {


    public CheckVisaPage(WebDriver driver) {
        super(driver);  //Inheritance

    }

//    @FindBy(xpath ="" )
    @FindBy(xpath = "//button[contains(text(), 'Accept all cookies')]")
    private  WebElement clickAcceptAllCoookies;

    @FindBy(id = "response")
    private WebElement countryNameLocator;                  //1  LOCATOR DEFINED

    @FindBy(xpath = "//button[contains(text(), 'Next step')]")   //2 LOCATOR DEFINED
    private WebElement nextStepButtonLocator;

    @FindBy(xpath = "//input[@id='response-1']")
    private WebElement longerThanSixMonthsLocator;           //LEAVE

    @FindBy(xpath = "//*[contains(@class,'gem-c-heading')]")      //3  ASSERT LOCATOR DEFINED
    private WebElement decisionLocator;

    @FindBy(xpath = "//input[@value='no']")
    private  WebElement noRadioButton;



    public void selectCountry(String countryName) {              //1  LOCATOR ADDED AS METHOD (COUNTRY NAME)
        selectByVisibleText(countryNameLocator, countryName);

    }

    public void clickOnNextButton() {                           //2  LOCATOR FOR CLICKING NEXT (BECAUSE THEY ARE THE SAME LOCATOR )
        click(nextStepButtonLocator);
    }


    public void clickOnMoreThan6Months() {

        longerThanSixMonthsLocator.click();                   // This has to have a click   // LEAVE
    }

    public String getDecision() {                               //3  ASSERT LOCATOR DEFINED .GETTEXT() ADDED

         return decisionLocator.getText();

    }

    public void clickOnNoTravellingPartner()
    {
        noRadioButton.click();
    }

    public void  selectCookies()
    {
        if (clickAcceptAllCoookies.isDisplayed())
        {
            clickAcceptAllCoookies.click();
    }

    }
}



