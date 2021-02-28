package newToursStepDef;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import newTourPages.NewToursConfirmationPage;
import newTourPages.NewToursLandingPages;
import newTourPages.NewToursRegistrationPage;
import utilities.DataStorage;
import utilities.Utility;


public class NewTourStepDefinition extends BaseUtil {
    private BaseUtil base;


//  REMEMBER:   STEFDEF CONNECTS TO GHENKINS USER STORIES


    public NewTourStepDefinition(BaseUtil base) {
        this.base = base;
    }


    @When("I Click on REGISTER link")
    public void i_Click_on_REGISTER_link() {
        // BELOW CALLED FROM NEWTOURSLANDINGPAGE
        NewToursLandingPages newToursLandingPages = new NewToursLandingPages(base.driver);
        newToursLandingPages.clickOnRegisterPage();
    }

    @When("I enter {string},{string},{string}  and {string} for contact details")
    public void i_enter_and_for_contact_details(String firstName, String lastName, String phone, String email) {

        //        Random ran = new Random();  //  Using random number before email
//        int randomNumbers = ran.nextInt();

        // Use random numbers from Utilities
        //
        Utility utility = new Utility();  //  because it not static, object variable to be declared
        DataStorage.setFiveRandomNumbers(utility.generate5RandomNumbers());  //  becos its static it can be called, without creating an object variable
//        newToursRegistrationPage.inputContactDetails(DataStorage.getFiveRandomNumbers() +email);


        NewToursRegistrationPage newToursRegistrationPage = new NewToursRegistrationPage(base.driver);
        newToursRegistrationPage.inputContactDetails(firstName, lastName, phone, email);
//        newToursRegistrationPage.inputContactDetails(firstName, lastName, phone, DataStorage.getFiveRandomNumbers() + email);



    }


    @And("I enter valid {string},{string}{string},{string}  and {string} for mailing information")
    public void iEnterValidAndForMailingInformation(String address, String address2, String city, String state, String postCode) {
        NewToursRegistrationPage newToursRegistrationPage = new NewToursRegistrationPage(base.driver);
        newToursRegistrationPage.inputMailingInfo(address, address2, city, state, postCode);
    }
    @And("I select  {string} country of origin")
    public void iSelectCountryOfOrigin(String countryName) {

        NewToursRegistrationPage newToursRegistrationPage = new NewToursRegistrationPage(base.driver);
        newToursRegistrationPage.dropCountryName(countryName);


    }

    @And("I enter {string} , {string} and {string} for User Information")
    public void iEnterAndForUserInformation(String userName, String password, String confirmPassword) {

        NewToursRegistrationPage newToursRegistrationPage = new NewToursRegistrationPage(base.driver);
        newToursRegistrationPage.enterUserInformation(userName, password, confirmPassword);

//        enterUserInformation
    }

    @When("I click on SUBMIT button")
    public void i_click_on_SUBMIT_button() {
        // Write code here that turns the phrase above into concrete actions

        NewToursRegistrationPage newToursRegistrationPage = new NewToursRegistrationPage(base.driver);
        newToursRegistrationPage.submitReg();
    }

    @Then("I confirm {string},{string}  and {string} are displayed on the confirmation page")
    public void i_confirm_and_on_confirmation_page(String firstName, String lastName, String email) {
      String[]result= new String[] {firstName, lastName, email};
        NewToursConfirmationPage newToursConfirmationPage = new NewToursConfirmationPage(base.driver);
        assertThat(newToursConfirmationPage.getDearContent().contains(firstName));

        NewToursConfirmationPage newToursConfirmationPage2 = new NewToursConfirmationPage(base.driver);
        assertThat(newToursConfirmationPage2.getNoteContent().contains(email));
    }

    private void assertThat(boolean contains) {
    }


}


