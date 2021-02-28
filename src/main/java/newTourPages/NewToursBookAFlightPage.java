package newTourPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewToursBookAFlightPage extends NewTBasePage_WebElement {


    public NewToursBookAFlightPage(WebDriver driver) {

        super(driver);
    }


   @FindBy(xpath = "//input[@name='passFirst0']")
   private WebElement passFirstNameLocator;

    @FindBy(xpath = "//input[@name='passLast0']")
    private WebElement passLastNameLocator;

    @FindBy(xpath = "//input[@name='creditnumber']")
    private WebElement passCreditCardNoLocator;

    @FindBy(xpath = "//input[@name='buyFlights']")
    private WebElement clickOnSecurePurchaseLocator;


    //    book a flight page
    @FindBy(css = ".frame_header_info>b>font")
    private WebElement  confirmItenaryLocator;

    @FindBy(css = ".data_left>font>b")
    private WebElement confirmFlightNameLocator;

    public void enterPassengerDetails(String pFirstName, String pLastName, String CCNo)
    {
        sendKeys(passFirstNameLocator, pFirstName );
        sendKeys(passLastNameLocator, pLastName );
        sendKeys(passCreditCardNoLocator, CCNo );
    }
    public  void  clickSecurePurchase(){
        click(clickOnSecurePurchaseLocator);

    }

    public String getItenaryName(){
        return confirmItenaryLocator.getText();

    }
    public String getFlightName(){
        return confirmFlightNameLocator.getText();

    }
}
