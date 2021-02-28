Feature: New Tour Registering New User
  As a User I want to be able to register on the New Tour site so that I can have an account

#  @TestRun
  Scenario Outline:  Register by entering all info requested

    Given I am on the Newtours Landing page
    When I Click on REGISTER link

    And I enter "<FirstName>","<LastName>","<Phone>"  and "<Email>" for contact details
    And I enter valid "<Address>","<Address2>""<City>","<State>"  and "<PostCode>" for mailing information
    And I select  "<Country>" country of origin
    And I enter "<UserName>" , "<Password>" and "<ConfirmPassword>" for User Information
    And I click on SUBMIT button
    Then I confirm "<FirstName>","<LastName>"  and "<UserName>" are displayed on the confirmation page


    Examples:

      | FirstName | LastName | Phone  | Email             | Address      | Address2 | City  | PostCode | State  | Country | UserName  | Password  | ConfirmPassword |
      | Dotun     | Pascal   | 078751 | testing@gmail.com | Stradford rd | Barking  | essex | 655775   | London | NIGERIA | dfTesting | tyt656565 | tyt656565       |
