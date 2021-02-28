package ukbaStepDef;

import base.BaseUtil;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import ukba.CheckVisaPage;


import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class UkbaStepDefinition extends BaseUtil {
    private BaseUtil base;


    public UkbaStepDefinition(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on the UKBA site")
    public void i_am_on_the_UKBA_site() {
//            base.driver.get("https://www.gov.uk/check-uk-visa/y");
            base.driver.navigate().to("https://www.gov.uk/check-uk-visa/y");
//        base.driver.findElement(By.xpath("//button[contains(text(), 'Accept all cookies')]")).click();

        //using objects
        CheckVisaPage checkVisaPage = new CheckVisaPage(base.driver);
        checkVisaPage.selectCookies();
    }

    @When("I provide a nationality of {string}")
    public void i_provide_a_nationality_of(String countryName) {

//        Select select = new Select(base.driver.findElement(By.id("response")));
//        select.selectByVisibleText(countryName);
        // Using page object
        CheckVisaPage checkVisaPage = new CheckVisaPage(base.driver);  //  CheckVisaPage class called because some methods would be used
        checkVisaPage.selectCountry(countryName);

    }

    @When("I click on next step button")
    public void i_click_on_next_step_button() {

//        base.driver.findElement(By.xpath("//button[contains(text(), 'Next step')]")).click();
//

        // Using page object  --  CAN BE RE-USED IN EVERY METHOD
        CheckVisaPage checkVisaPage = new CheckVisaPage(base.driver);
        checkVisaPage.clickOnNextButton();

    }

    @When("I select the reason {string}")
    public void i_select_the_reason(String reasonForComing) {

        base.driver.findElement(By.xpath("//label[contains(text(),'"+ reasonForComing + "')]")).click(); // LEAVE FOR NOW


    }
    @When("I state I am intending to stay for more than six months")
    public void i_State_I_Am_Intending_To_Stay_ForMoreThanSixMonths() {
//        base.driver.findElement(By.id("response-1")).click();

        // Using page object
        CheckVisaPage checkVisaPage = new CheckVisaPage(base.driver);
        checkVisaPage.clickOnMoreThan6Months();
    }

    @When("I submit the form")
    public void i_submit_the_form() {
        // Write code here that turns the phrase above into concrete actions
        i_click_on_next_step_button();
    }

    @Then("I would be informed {string}")
    public void i_would_be_informed(String validateVisa) {
        // Write code here that turns the phrase above into concrete actions

//        String needVisaConfirmation = base.driver.findElement(By.xpath("//*[contains(@class,'gem-c-heading')]")).getText();
//       assertTrue(needVisaConfirmation.equalsIgnoreCase(validateVisa));

      //assertThat(base.driver.findElement(By.xpath("//*[contains(@class,'gem-c-heading')]")).getText(),is(equalTo(validateVisa)));

//        using page object
        CheckVisaPage checkVisaPage = new CheckVisaPage(base.driver);
        assertThat(checkVisaPage.getDecision(),is(equalTo(validateVisa)));
    }

    @And("I state I am not travelling or visiting a partner or family")
    public void iStateIAmNotTravellingOrVisitingAPartnerOrFamily() {

        CheckVisaPage checkVisaPage = new CheckVisaPage(base.driver);
     checkVisaPage.clickOnNoTravellingPartner();

    }
}
