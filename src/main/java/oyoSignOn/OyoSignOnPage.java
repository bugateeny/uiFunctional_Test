package oyoSignOn;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagesForWebElementMethods.BasePage;

public class OyoSignOnPage extends BasePage {

    public OyoSignOnPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = ("//input[@class='input-class input-class-focused  js-loginEmail']"))
    private WebElement userNameLocator;

    @FindBy(xpath = ("//input[@type='password']"))
    private WebElement passwordLocator;

    @FindBy(xpath = ("//div[@class='button-text-container']"))
    private WebElement newBookingLocator;

    @FindBy(xpath = ("//input[@class='add_transition input-input-section semantic-input-section-margin  js-guestPhoneNumber']"))
    private WebElement enterPhoneNo;

    @FindBy(xpath = ("//input[@class='input-class   js-guestName']"))
    private WebElement enterGuestName;

    @FindBy(xpath = ("//input[@class='input-class   js-guestEmailAddress']"))
    private WebElement enterEmail;

    @FindBy(xpath = ("//input[@class='input-class   js-bookingNotes']"))
    private WebElement enterBookingNotes;

    @FindBy(xpath = ("//div[@class='button button-primary js-CreateBooking']"))
    private WebElement clickCreateBooking;


    public void enterUserName(String userN) {
        // To clear text
        WebElement toClear = userNameLocator;
        toClear.sendKeys(Keys.CONTROL + "a");
        toClear.sendKeys(Keys.DELETE);

        sendKeys(userNameLocator, userN);

    }

    public void enterPassword(String passW) {

        sendKeys(passwordLocator, passW);
    }

    public void clickNewBooking() {
        click(newBookingLocator);

    }

    public void enterPhoneNumber(String pNo) {
        sendKeys(enterPhoneNo, pNo);
    }

    public void enterGuestName(String guestN) {
        sendKeys(enterGuestName, guestN);
    }

    public void enterGuestEmail(String guestEmail) {
        sendKeys(enterEmail, guestEmail);

    }

    public void enterBookingNotes(String bookingNotes) {
        sendKeys(enterBookingNotes, bookingNotes);

    }

    public void clickCreateBooking() {
        click(clickCreateBooking);
    }

}

