package mortgageCal;

import base.BaseUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mortgCalculator.MortgageCalculatorPage;
import utilities.PropertiesReader;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.internal.matchers.StringContains.containsString;
import static org.junit.matchers.JUnitMatchers.hasItem;

public class mortgageStepDefination extends BaseUtil {

    private BaseUtil base;
    public PropertiesReader pReader;


    public mortgageStepDefination(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on the Mortgage Calculator Website")
    public void iAmOnTheMortgageCalculatorWebsite() throws Exception {
        base.driver.get(pReader.getMortgageCalcURL());


    }

    @When("I enter {string}, {string}, {string}, {string}, {string} and {string}")

    public void iEnterAnd(String homeValueAmount, String dPaymentAmount, String intRate, String loanTerm, String startMonth, String startYear) {
        MortgageCalculatorPage mortgageCalculatorPage = new MortgageCalculatorPage(base.driver);
        mortgageCalculatorPage.enterHomeValue(homeValueAmount);
        mortgageCalculatorPage.enterDownPayment(dPaymentAmount);
        mortgageCalculatorPage.enterInterestRate(intRate);
        mortgageCalculatorPage.enterLoanTermAmount(loanTerm);
        mortgageCalculatorPage.selectStartMonth(startMonth);
        mortgageCalculatorPage.selectStartYear(startYear);

    }

    @And("I accept default value for all the remaining value")
    public void iAcceptDefaultValueForAllTheRemainingValue() {

        //  no accepting default value on site


    }

    @Then("I click on Calculate")
    public void iClickOnCalculate() {
        MortgageCalculatorPage mortgageCalculatorPage = new MortgageCalculatorPage(base.driver);
        mortgageCalculatorPage.clickSubmitLocator();

    }

    @Then("I should get mortgage offer with  {string}, {string}, {string}, {string}, {string} and {string}")
    public void iShouldGetMortgageOfferWithAnd(String totalMonthlyPayment, String downPaymentAMount, String downPaymentPercentage, String loanPayoffDate, String totalInterestPaid, String monthlyTaxPaid) {

        MortgageCalculatorPage mortgageCalculatorPage = new MortgageCalculatorPage(base.driver);
        assertThat(mortgageCalculatorPage.getMonthlyPayment(), is(containsString(totalMonthlyPayment)));
        assertThat(mortgageCalculatorPage.getDownPayment(), is(containsString(downPaymentAMount)));
        assertThat(mortgageCalculatorPage.getDownPaymentPercentage(), is(containsString(downPaymentPercentage)));
        assertThat(mortgageCalculatorPage.getLoanPayOffDate(), is(containsString(loanPayoffDate))); //  block locator used to search for assert values  hence contain matcher value used was containsString
        assertThat(mortgageCalculatorPage.getMonthlyTaxPaid(), is(equalTo(monthlyTaxPaid))); //  Exact assert locator used
        assertThat(mortgageCalculatorPage.getTotalInterestPaid(), is(containsString(totalInterestPaid)));

        // selecting multiple names for assertion
        // Using ArrayList to check the  monthly  Tax Paid:
        List<String> arrayListOfMonthlyTax = Arrays.asList(monthlyTaxPaid, "$200.20", "$201.00");  //  as long as one of these matches getMonthlyTaxPaidLocator()
        assertThat(arrayListOfMonthlyTax, hasItem(mortgageCalculatorPage.getMonthlyTaxPaid()));

    }

    // USING DATA TABLES
    @When("I enter following details")
    public void iEnterFollowingDetails(DataTable table) {
        MortgageCalculatorPage mortgageCalculatorPage = new MortgageCalculatorPage(base.driver);

        List<List<String>> data = table.cells();

        mortgageCalculatorPage.enterHomeValue(data.get(1).get(1));
        mortgageCalculatorPage.enterDownPayment(data.get(2).get(1));
        mortgageCalculatorPage.enterInterestRate(data.get(3).get(1));
        mortgageCalculatorPage.enterLoanTermAmount(data.get(4).get(1));
        mortgageCalculatorPage.selectStartMonth(data.get(5).get(1));
        mortgageCalculatorPage.selectStartYear(data.get(6).get(1));

    }
}

