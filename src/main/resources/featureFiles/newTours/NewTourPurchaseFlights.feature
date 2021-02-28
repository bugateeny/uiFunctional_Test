Feature: Newtours- Purchase Flight
#  As a User I want to be able to sign in to Mercury Tours and find flights/itinerary so that i can purchase flights
  @TestRun
  Scenario Outline:1 Purchase a single trip (One way) flight
    Given I am on the Newtours Landing page

    When I click on Sign-On link
    And I enter valid details "Tester1" and "Tester1"
  #    using properties file
#    And I enter valid username and password
    And I click on SUBMIT button on the SIGN-ON page
    And I select one way option
    And I select 2 Passengers, Departing from "<Country>" on "July" and "<Go day of the month>"
    And I select Arriving in "Paris" and Returning on "August" "<Return day of the month>"
    And I select "<Service class>"
    And I click on continue

    Then I  "Select a Flight: Mercury Tours" is confirmed as title page

    And I click Depart "Flight Blue Skies Airlines 361" and confirm time is "7:10"
    And I click Return "Unified Airlines 633" and confirm time is "18:44"
    And I click on continue to Reserve Flight
    And I enter "<Passengers First Name>" , "<Passengers Last Name>" and enter "<Passengers CreditCardNo>"

    Then I click on secure purchase
    Then I click on Sign-Off

    Examples:
      | Go day of the month | Return day of the month | Country  | Service class | Passengers First Name | Passengers Last Name | Passengers CreditCardNo |
      | 24                  | 28                      | London   | Economy class | Buga                  | Show                 | 76767545655678967       |
      | 27                  | 30                      | New York | Economy class | Adey                  | goke                 | 76767545655678967       |
