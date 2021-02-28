Feature: Calculate Mortgage
# As a a first time buyer I want to be able to use mixture of some default  values and my chosen values to calculate mortgage rates
#  @TestRun
  Scenario Outline: Calculate Mortgage rate with given values and default values
    Given I am on the Mortgage Calculator Website
    When I enter "<homeValue>", "<downPayment>", "<interestRate>", "<loanTerm>", "<startMonth>" and "<startYear>"
    And I accept default value for all the remaining value
    Then I click on Calculate
    Then I should get mortgage offer with  "<totalMonthlyPayment>", "<downPaymentAMount>", "<downPaymentPercentage>", "<loanPayoffDate>", "<totalInterestPaid>" and "<monthlyTaxPaid>"

    Examples:
      | homeValue | downPayment | interestRate | loanTerm | startMonth | startYear | totalMonthlyPayment | downPaymentAMount | downPaymentPercentage | loanPayoffDate | totalInterestPaid | monthlyTaxPaid |
      | 50000     | 20000       | 5            | 25       | Sep        | 2020      | $458.71             | $20,000.00        | 40.00%                | Aug, 2045      | $22,613.10        | $200.00        |

   @TestRun
#    USING DATA TABLES EXAMPLE
  Scenario Outline: Calculate Mortgage rate with given values and default values using DATA TABLES
    Given I am on the Mortgage Calculator Website
    When I enter following details
    #  array list starts from  Row 0 = Field , Column 1  = Value, Row 1 = Home Value , Column 1  = 50000,  and so on
      | Field        | Value |
      | homeValue    | 50000 |
      | downPayment  | 20000 |
      | interestRate | 5     |
      | loanTerm     | 25    |
      | startMonth   | Sep   |
      | startYear    | 2020  |
    And I accept default value for all the remaining value
    Then I click on Calculate
    Then I should get mortgage offer with  "<totalMonthlyPayment>", "<downPaymentAMount>", "<downPaymentPercentage>", "<loanPayoffDate>", "<totalInterestPaid>" and "<monthlyTaxPaid>"

    Examples:
      | totalMonthlyPayment | downPaymentAMount | downPaymentPercentage | loanPayoffDate | totalInterestPaid | monthlyTaxPaid |
      | $458.71             | $20,000.00        | 40.00%                | Aug, 2045      | $22,613.10        | $200.00        |