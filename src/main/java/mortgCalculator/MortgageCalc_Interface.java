package mortgCalculator;

public interface MortgageCalc_Interface {

    void enterHomeValue(String homeValueAmount);

    void enterDownPayment(String dPaymentAmount);

    void enterInterestRate(String intRate);

    void enterLoanTermAmount(String lTermAmt);

    void selectStartMonth(String sMonth);

    void selectStartYear(String sYear);

    void clickSubmitLocator();

    String getMonthlyPayment();

    String getDownPayment();

    String getDownPaymentPercentage();

    String getLoanPayOffDate();

    String getMonthlyTaxPaid();

    String getTotalInterestPaid();

  }


