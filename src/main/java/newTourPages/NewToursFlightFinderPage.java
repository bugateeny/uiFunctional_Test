package newTourPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewToursFlightFinderPage extends NewTBasePage_WebElement {

    public NewToursFlightFinderPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//input[@value='roundtrip']")
    private WebElement roundTripRadio;

    @FindBy(xpath = "//input[@value='oneway']")
    private WebElement onewayTripRadio;

    @FindBy(xpath = "//select[@name='passCount']")
    private WebElement passengerNoDropDown;


    @FindBy(xpath = "//select[@name='fromPort']")
    private WebElement departFromDropDown;

    @FindBy(xpath = "//select[@name='fromMonth']")
    private WebElement departMonthDropDown;

    @FindBy(xpath = "//select[@name='fromDay']")
    private WebElement departDayDropDown;


    @FindBy(xpath = "//select[@name='toPort']")
    private WebElement arrivingPlaceDropDown;

    @FindBy(xpath = "//select[@name='toMonth']")
    private WebElement arrivingMonthDropDown;

    @FindBy(xpath = "//select[@name='toDay']")
    private WebElement arrivingDayDropDown;

    @FindBy(xpath = "//input[@value='Coach']")
    private WebElement economyClassRadio;

    @FindBy(xpath = "//input[@value='Business']")
    private WebElement businessClassRadio;

    @FindBy(xpath = "//input[@value='First']")
    private WebElement firstClassRadio;

    @FindBy(xpath = "//select[@name='airline']")
    private WebElement preferenceDropDown;

    @FindBy(xpath = "//input[@name='findFlights']")
    private WebElement continueButtonLocator;


    public void clickRoundOrOneWayTrip() {
//        click(roundTripRadio);
        click(onewayTripRadio);
    }

    public void selectPassengerNumber(Integer passengerNo) {
//  Change INT TO STRING
        String  passengerNumberString = passengerNo.toString();
        selectByVisibleText(passengerNoDropDown, passengerNumberString);
    }

    public void selectDepartFrom(String deptPlace) {
        selectByVisibleText(departFromDropDown, deptPlace);
    }

    public void selectDepartMonth(String goMonth) {
        selectByVisibleText(departMonthDropDown, goMonth);
    }

    public void selectGoDay(String goMonth) {
        selectByVisibleText(departDayDropDown, goMonth);
    }

    public void selectArrivalPlace(String arrPlace) {
        selectByVisibleText(arrivingPlaceDropDown, arrPlace);
    }

    public void selectArrivalMonth(String returnMonth) {
        selectByVisibleText(arrivingMonthDropDown, returnMonth);
    }

    public void selectArrivalDay(String returnDay) {
        selectByVisibleText(arrivingDayDropDown, returnDay);
    }

    public void selectEconomyPreference() {

        click(economyClassRadio);

    }

    public void selectBusinessPreference() {

        click(businessClassRadio);

    }

    public void selectFirstClassPreference() {

        click(firstClassRadio);
    }

    public void clickOnContinue() {
        click(continueButtonLocator);
    }


}
