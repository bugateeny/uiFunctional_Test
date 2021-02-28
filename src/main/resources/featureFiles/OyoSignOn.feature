Feature: Confirm you have sucessfully logged on OYO Rooms

  @TestRun
  Scenario Outline: Create OYO booking reservation
    Given I am on the OYO site url
    When I provide a user name  "<Username>"
    When I provide a user password "<Password>"
    And I click on next Login button
    And I select begin shift
    And I click on new booking
    And I enter booking details "<Mobile Phone>" , "<Name>", "<Email>",  and booking "<Notes>"
    When I click creating booking

    Examples:
      | Username                    | Password  | Mobile Phone | Name      | Email          | Notes               |
      | EN_LDN098@oyoproperties.com | Pass@4321 | 07876568653   | Mannysexy | yhhjioyh@gmail.com | I love you Manpreet |