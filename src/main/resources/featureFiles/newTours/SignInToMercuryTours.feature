Feature: Newtours- Sign In to Mercury Tours
#  As a User I want to be able to sign in to Mercury Tours so that i can access my account

  @TestRun
  Scenario: Sign in with valid details (Happy path)
    Given I am on the Newtours Landing page
    When I click on Sign-On link
    And I enter valid details "Tester1" and "Tester1"
    And I click on SUBMIT button on the SIGN-ON page
    Then "Login: Mercury Tours" confirm page title is displayed


#  @TestRun
  Scenario: Sign in with invalid details (Negative test)
    Given I am on the Newtours Landing page
    When I click on Sign-On link
    And I enter invalid details "9898dfTesting" and "hghhtyt656565"
    And I click on SUBMIT button on the SIGN-ON page
    Then "Sign-on: Mercury Tours" confirm page is displayed

