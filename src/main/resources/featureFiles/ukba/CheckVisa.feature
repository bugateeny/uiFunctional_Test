Feature: Confirm whether a visa is required to visit the UK

  @TestRun
  Scenario Outline: Check that Japan nationalities coming to UK to study for morethan 6months requires a Visa
    Given I am on the UKBA site
    When I provide a nationality of "<CountryName>"
    And I click on next step button
    And I select the reason "<Reason>"
    And I click on next step button
    And I state I am intending to stay for more than six months
    When I submit the form
    Then I would be informed "<Decision>"

    Examples:
      | CountryName | Reason | Decision                              |
      | Japan       | Study  | You’ll need a visa to study in the UK |
      | Nigeria     | Study  | You’ll need a visa to study in the UK |
      | Morocco     | Study  | You’ll need a visa to study in the UK |
      | USA         | Study  | You’ll need a visa to study in the UK |

#  @TestRun
  Scenario: Check for Japan nationalities coming to the UK for Tourism do not require a visa
    Given I am on the UKBA site
    When I provide a nationality of "Japan"
      |
    And I click on next step button
    And I select the reason "Tourism"
    When I submit the form
    Then I would be informed "You won’t need a visa to come to the UK"


#  @TestRun
  Scenario Outline: Check for Russia nationalities coming to the UK for Tourism would require visa
    Given I am on the UKBA site
    When I provide a nationality of "<CountryName>"
    And I click on next step button
    And I select the reason "<Reason>"
    And I click on next step button
    And I state I am intending to stay for more than six months
    And I click on next step button
    Then I would be informed "<Decision>"

    Examples:
      | CountryName | Reason | Decision                              |
      | Russia      | Study  | You’ll need a visa to study in the UK |
      | Albania     | Study  | You’ll need a visa to study in the UK |
      | Belarus     | Study  | You’ll need a visa to study in the UK |
      | Cuba        | Study  | You’ll need a visa to study in the UK |
