package newTourPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class NewToursRegistrationPage extends NewTBasePage_WebElement {

    public NewToursRegistrationPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstNameLocator;

    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastNameLocator;

    @FindBy(xpath = "//input[@name='phone']")
    private WebElement phoneLocator;

    @FindBy(xpath = "//input[@id='userName']")  //DEVELOPER WROTE WRONG ID NAME
    private WebElement emailLocator;

    //  Valid Mailing info
    @FindBy(xpath = "//input[@name='address1']")
    private WebElement address1Locator;

    @FindBy(xpath = "//input[@name='address2']")
    private WebElement address2Locator;

    @FindBy(xpath = "//input[@name='city']")
    private WebElement cityLocator;

    @FindBy(xpath = "//input[@name='state']")
    private WebElement stateLocator;

    @FindBy(xpath = "//input[@name='postalCode']")
    private WebElement postalCodeLocator;

    @FindBy(xpath = "//select[@name='country']")
    private WebElement countryLocator;

    @FindBy(xpath ="//input[@id='email']")
    private WebElement userNameLocator;

    @FindBy(xpath ="//input[@name='password']")
    private WebElement passwordLocator;

    @FindBy(xpath ="//input[@name='confirmPassword']")
    private WebElement confirmPasswordLocator;

    @FindBy(xpath ="//input[@name='register']")
    private WebElement submit;


//    //Validate Registration
//  @FindAll({@FindBy(xpath ="//b[contains(text(),'Dear  ,')]"), @FindBy(xpath = "//b[contains(text(),'Note:')]")})
//    private WebElement validateRegistration;


    public void inputContactDetails(String firstName, String lastName, String phone, String email) {
        sendKeys(firstNameLocator, firstName);
        sendKeys(lastNameLocator, lastName);
        sendKeys(phoneLocator, phone);
        sendKeys(emailLocator, email);
    }
    public void  inputMailingInfo( String address, String address2, String city, String state, String postCode){
        sendKeys(address1Locator, address);
        sendKeys(address2Locator, address2);
        sendKeys(cityLocator, city);
        sendKeys(stateLocator, state);
        sendKeys(postalCodeLocator, postCode);
    }
    public void  dropCountryName(String countryName ){
//        WebElement  element = base.driver.findElement(By.xpath("//select[@name='country']"));

        selectByVisibleText(countryLocator, countryName);
    }
    public void enterUserInformation(String userName,  String password , String confirmPassword ){

        sendKeys(userNameLocator, userName);
        sendKeys(passwordLocator, password);
        sendKeys(confirmPasswordLocator, confirmPassword);
    }
    public  void submitReg(){

        click(submit);
    }



}
