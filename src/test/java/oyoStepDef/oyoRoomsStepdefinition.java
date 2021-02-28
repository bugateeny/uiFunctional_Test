package oyoStepDef;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import oyoSignOn.OyoSignOnPage;
import utilities.PropertiesReader;

public class oyoRoomsStepdefinition extends BaseUtil {


    private BaseUtil base;

    public oyoRoomsStepdefinition(BaseUtil base) {

        this.base = base;
    }


    @Given("I am on the OYO site url")
    public void iAmOnTheOYOSiteUrl() throws Exception {
        PropertiesReader propertiesReader = new PropertiesReader();
        base.driver.get(propertiesReader.getOyoURL());

    }

    @When("I provide a user name  {string}")
    public void i_provide_a_user_name(String userN) {
        base.driver.findElement(By.xpath("//input[@class='input-class input-class-focused  js-loginEmail']")).clear();
        OyoSignOnPage oyoSignOnPage = new OyoSignOnPage(base.driver);
        oyoSignOnPage.enterUserName(userN);
    }

    @When("I provide a user password {string}")
    public void i_provide_a_user_password(String passW) {

        OyoSignOnPage oyoSignOnPage = new OyoSignOnPage(base.driver);
        oyoSignOnPage.enterPassword(passW);
    }

    @When("I click on next Login button")
    public void i_click_on_next_Login_button() {
        OyoSignOnPage oyoSignOnPage = new OyoSignOnPage(base.driver);
        oyoSignOnPage.clickNewBooking();
    }

    @When("I select begin shift")
    public void i_select_begin_shift() {
        OyoSignOnPage oyoSignOnPage = new OyoSignOnPage(base.driver);

    }

    @When("I click on new booking")
    public void i_click_on_new_booking() {
        OyoSignOnPage oyoSignOnPage = new OyoSignOnPage(base.driver);
        oyoSignOnPage.clickNewBooking();
    }

    @When("I enter booking details {string} , {string}, {string},  and booking {string}")
    public void i_enter_booking_details_and_booking(String pNo, String guestN, String guestEmail, String bookingNotes) throws InterruptedException {
        OyoSignOnPage oyoSignOnPage = new OyoSignOnPage(base.driver);

        oyoSignOnPage.enterPhoneNumber(pNo);
        oyoSignOnPage.enterGuestName(guestN);
        oyoSignOnPage.enterGuestEmail(guestEmail);
        oyoSignOnPage.enterBookingNotes(bookingNotes);
    }

    @When("I click creating booking")
    public void i_click_creating_booking() {
        OyoSignOnPage oyoSignOnPage = new OyoSignOnPage(base.driver);
        oyoSignOnPage.clickCreateBooking();
    }


}
