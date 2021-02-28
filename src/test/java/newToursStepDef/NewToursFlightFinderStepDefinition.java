package newToursStepDef;


import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import newTourPages.NewToursBookAFlightPage;
import newTourPages.NewToursConfirmationPage;
import newTourPages.NewToursFlightFinderPage;
import newTourPages.NewToursSelectFlightPage;
import org.openqa.selenium.By;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NewToursFlightFinderStepDefinition extends BaseUtil {
    private BaseUtil base;
    private String departureCityName;

    public NewToursFlightFinderStepDefinition(BaseUtil base) {

        this.base = base;


    }




    @And("I select one way option")
    public void iSelectOneWayOption() {
        NewToursFlightFinderPage newToursFlightFinderPage = new NewToursFlightFinderPage(base.driver);
        newToursFlightFinderPage.clickRoundOrOneWayTrip();
    }

    @And("I select {int} Passengers, Departing from {string} on {string} and {string}")
    public void iSelectPassengersDepartingFromOnAnd(int passengerNo, String deptPlace, String goMonth, String goDay) {

        NewToursFlightFinderPage newToursFlightFinderPage = new NewToursFlightFinderPage(base.driver);
        newToursFlightFinderPage.selectPassengerNumber(passengerNo);
        newToursFlightFinderPage.selectDepartFrom(deptPlace);
        newToursFlightFinderPage.selectDepartMonth(goMonth);
        this.departureCityName= deptPlace;
    }

    @And("I select Arriving in {string} and Returning on {string} {string}")
    public void iSelectArrivingInAndReturningOn(String arrPlace, String returnMonth, String returnDay) {
        NewToursFlightFinderPage newToursFlightFinderPage = new NewToursFlightFinderPage(base.driver);
        newToursFlightFinderPage.selectArrivalPlace(arrPlace);
        newToursFlightFinderPage.selectArrivalMonth(returnMonth);
        newToursFlightFinderPage.selectArrivalDay(returnDay);
    }

    @And("I select {string}")
    public void iSelect(String serviceClass) {
        NewToursFlightFinderPage newToursFlightFinderPage = new NewToursFlightFinderPage(base.driver);
        newToursFlightFinderPage.selectEconomyPreference();
    }

    @And("I click on continue")
    public void iClickOnContinue() {
        NewToursFlightFinderPage newToursFlightFinderPage = new NewToursFlightFinderPage(base.driver);
        newToursFlightFinderPage.clickOnContinue();
    }

    @Then("I  {string} is confirmed as title page")
    public void iConfirmIsConfirmedAsTitlePage(String titlePage) {
        assertThat(base.driver.findElement(By.xpath("//img[@src='/images/masts/mast_selectflight.gif']")).isDisplayed(), is(equalTo(true)));
    }


    @And("I click Depart {string} and confirm time is {string}")
    public void iClickDepartAndConfirmTimeIs(String flightName, String departTime) {
        NewToursSelectFlightPage newToursSelectFlightPage = new NewToursSelectFlightPage(base.driver);
        newToursSelectFlightPage.clickOnDepartureRadioButton();
        assertThat(base.driver.findElement(By.xpath("//font[contains(text(),'7:10')]")).isDisplayed(), is(equalTo(true)));


    }

    @And("I click Return {string} and confirm time is {string}")
    public void iClickReturnAndConfirmTimeIs(String flightName, String returnTime) {
        NewToursSelectFlightPage newToursSelectFlightPage = new NewToursSelectFlightPage(base.driver);
        newToursSelectFlightPage.clickOnReturnRadioButton();
        assertThat(base.driver.findElement(By.xpath("//font[contains(text(),'18:44')]")).isDisplayed(), is(equalTo(true)));


    }


    @And("I click on continue to Reserve Flight")
    public void iClickOnContinueToReserveFlight() {
        NewToursSelectFlightPage newToursSelectFlightPage = new NewToursSelectFlightPage(base.driver);
        newToursSelectFlightPage.clickOnReserveFlight();


    }

    @And("I enter {string} , {string} and enter {string}")
    public void iEnterAndEnter(String pFirstName, String pLastName, String CCNo) {

        NewToursBookAFlightPage newToursBookAFlightPage = new NewToursBookAFlightPage(base.driver);
        newToursBookAFlightPage.enterPassengerDetails(pFirstName, pLastName, CCNo);
        assertThat(newToursBookAFlightPage.getItenaryName().contains(departureCityName),is(equalTo(true)));
//
//        assertThat(DataStorage.getFlightName(), is(equalTo(newToursBookAFlightPage.getFlightName())));

    }

    @Then("I click on secure purchase")
    public void iClickOnSecurePurchase() {

        NewToursBookAFlightPage newToursBookAFlightPage = new NewToursBookAFlightPage(base.driver);
        newToursBookAFlightPage.clickSecurePurchase();
        assertThat(base.driver.getTitle(), is(equalTo("Flight Confirmation: Mercury Tours")));



    }

    @Then("I click on Sign-Off")
    public void iClickOnSignOff() {
        NewToursConfirmationPage  newToursConfirmationPage = new NewToursConfirmationPage(base.driver);
        newToursConfirmationPage.clickOnSignOff();



            }


}