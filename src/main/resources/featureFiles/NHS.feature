Feature: As a person from Wales

  Scenario Outline: I am single and live alone.I have not help condition and I earn morethan 16k. I need to know what help I can get with my NHS costs So that I can get the treatment I need


    Given I am a person from "<Country>"
    When I enter my   DOB "<Day>" "<Month>"  "<Year>"   into the Checker tool
    And Do you live with a partner? "No"
    And Do you claim any benefits or tax credits? "No"
    And I confirm Are you pregnant or have you given birth in the last 12 months? "No"
    And I confirm, Do you have an injury or illness caused by serving in the armed forces? "No"
    And I confirm, Do you have diabetes? "No"
    And I confirm, Do you have glaucoma? "No"
    And I confirm, Do you live permanently in a care home? "No"
    And I confirm, Do you have more than £16,000 in savings, investments or property? "Yes"

    Then I should get a result this result "You get help with NHS costs"
    Examples:
      | Country | Day |Month | Year|
      | Wales   |   31   |01 |1981 |

