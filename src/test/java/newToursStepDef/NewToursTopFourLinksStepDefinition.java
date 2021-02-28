package newToursStepDef;


import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import newTourPages.NewToursLandingPages;
import utilities.PropertiesReader;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NewToursTopFourLinksStepDefinition extends BaseUtil {
    private BaseUtil base;

    public NewToursTopFourLinksStepDefinition(BaseUtil base) {

        this.base = base;
    }

    @Given("I am on the Newtours Landing page")
    public void i_am_on_the_Newtours_Landing_page() throws Exception {
        // Write code here that turns the phrase above into concrete actions

//        base.driver.navigate().to("http://www.newtours.demoaut.com/");
        base.driver.get(PropertiesReader.getNewToursURL());
    }


    @Then("{string} page is displayed")
    public void pageIsDisplayed(String pageTitle) {
        assertThat(base.driver.getTitle(), is(equalTo(pageTitle)));

    }


    @Then("{string} is displayed")
    public void isDisplayed(String pageTitle) {

     assertThat(base.driver.getTitle(), is(equalTo(pageTitle)));
    }

    @When("i Click on “SUPPORT” link")
    public void iClickOnSUPPORTLink() {
        NewToursLandingPages  newToursLandingPages = new NewToursLandingPages(base.driver);
        newToursLandingPages.clickOnSupportLink();
    }
    @Then("“Under Construction: Mercury Tours” page is displayed")
    public void underCONSTRUCTIONPageIsDisplayed() {

        assertThat(base.driver.getTitle(), is(equalTo("Under Construction: Mercury Tours")));
    }

    @When("i Click on “CONTACT” link")
    public void iClickOnCONTACTLink() {
        NewToursLandingPages  newToursLandingPages = new NewToursLandingPages(base.driver);
        newToursLandingPages.clickOnSupportLink();

    }

}
