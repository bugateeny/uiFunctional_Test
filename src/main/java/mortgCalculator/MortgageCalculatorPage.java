package mortgCalculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagesForWebElementMethods.BasePage;

//  Checkvisa is child whilst Base page parent
public class MortgageCalculatorPage extends BasePage implements MortgageCalc_Interface {


    public MortgageCalculatorPage(WebDriver driver) {
        super(driver);  //Inheritance

    }

    @FindBy(id = "homeval")
    private WebElement homeValueLocator;

    @FindBy(id = "downpayment")
    private WebElement downPaymentLocator;

//    @FindBy(id = "loanamt")
//    private WebElement loanAmtLocator;

    @FindBy(id = "intrstsrate")
    private WebElement interestRateLocator;

    @FindBy(id = "loanterm")
    private WebElement loanTermLocator;

    @FindBy(xpath = "//select[@name='param[start_month]']")
    private WebElement startMonth;

    @FindBy(id = "start_year")
    private WebElement startYearLocator;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitLocator;


    @FindBy(xpath = "//div[@class='repayment-block'] //div[1]/div[1]")
    private WebElement totalMonthlyLocator;

    @FindBy(xpath = "//div[@class='repayment-block'] //div[2]/div[1]")
    private WebElement downPaymentAmountLocator;

    @FindBy(xpath = "//div[@class='repayment-block'] //div[2]/div[2]")
    private WebElement downPaymentPercentageLocator;

    @FindBy(xpath = "//div[@class='repayment-block'] //div[4]/div[1]") //  block locator used to search for assert values
    private WebElement loanPayOffDateLocator;


    @FindBy(xpath = "//div[@class='repayment-block'] //div[5]/div[1]//h3")  //  Exact assert locator used
    private WebElement monthlyTaxPaidLocator;

    @FindBy(xpath = "//div[@class='repayment-block'] /div[4]/div[2]")
    private WebElement totalIntPaidLocator;


    public void enterHomeValue(String homeValueAmount) {

        sendKeys(homeValueLocator, homeValueAmount);
    }

    public void enterDownPayment(String dPaymentAmount) {
        sendKeys(downPaymentLocator, dPaymentAmount);

    }

    public void enterInterestRate(String intRate) {

        sendKeys(interestRateLocator, intRate);
    }

    public void enterLoanTermAmount(String lTermAmt) {
        sendKeys(loanTermLocator, lTermAmt);
    }

    public void selectStartMonth(String sMonth) {

        selectByVisibleText(startMonth, sMonth);
    }

    public void selectStartYear(String sYear) {

        sendKeys(startYearLocator, sYear);
    }

    public void clickSubmitLocator() {
        click(submitLocator);
    }

    public String getMonthlyPayment() {
        return totalMonthlyLocator.getText();

    }

    public String getDownPayment() {
        return downPaymentAmountLocator.getText();

    }

    public String getDownPaymentPercentage() {
        return downPaymentPercentageLocator.getText();

    }

    public String getLoanPayOffDate() {
        return loanPayOffDateLocator.getText();

    }

    public String getMonthlyTaxPaid() {
        return monthlyTaxPaidLocator.getText();
    }

    public String getTotalInterestPaid() {
        return totalIntPaidLocator.getText();
    }

    }
