package newToursStepDef;


import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import newTourPages.NewToursLandingPages;
import newTourPages.NewToursSignOnPage;
import org.openqa.selenium.By;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SignInToMercuryToursStepDefinition extends BaseUtil {
    private BaseUtil base;

    public SignInToMercuryToursStepDefinition(BaseUtil base) {
        this.base = base;
    }


    @When("I click on Sign-On link")
    public void iClickOnSignOnLink() {

        NewToursLandingPages newToursLandingPages = new NewToursLandingPages(base.driver);
        newToursLandingPages.clickOnSignOnLink();

    }

    @And("I enter valid details {string} and {string}")
    public void iEnterValidDetailsAnd(String uName, String pWord) {
        NewToursSignOnPage newToursSignOnPage = new NewToursSignOnPage(base.driver);
        newToursSignOnPage.enterUserName(uName);
        newToursSignOnPage.enterPassword(pWord);
    }




//    @And("I enter valid username and password")
//    public void iEnterValidUsernameAndPassword() {
//
//        PropertiesReader getUserDetails = new PropertiesReader();
//        getUserDetails.
//    }
//

    @And("I click on SUBMIT button on the SIGN-ON page")
    public void iClickOnSUBMITButtonOnTheSIGNONPage() {
        NewToursSignOnPage newToursSignOnPage = new NewToursSignOnPage(base.driver);
        newToursSignOnPage.clickOnSubmitButton();

    }

    @Then("{string} confirm page title is displayed")
    public void confirmPageTitleIsDisplayed(String pageTitle) {
        assertThat(base.driver.getTitle(), is(equalTo(pageTitle)));
        assertThat(base.driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed(), is(equalTo(true)));
    }

    //  Negative page
    @And("I enter invalid details {string} and {string}")
    public void iEnterInvalidDetailsAnd(String uName2, String pWord2) {
        NewToursSignOnPage newToursSignOnPage = new NewToursSignOnPage(base.driver);
        newToursSignOnPage.enterUserName(uName2);
        newToursSignOnPage.enterPassword(pWord2);
    }

    @Then("{string} confirm page is displayed")
    public void confirmPageIsDisplayed(String pageTitle2) {
        assertThat(base.driver.getTitle(), is(equalTo(pageTitle2)));
    }


}



