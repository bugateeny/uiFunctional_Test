Feature: Newtours - Create the four top menu links on the Newtours Landing page

  @TestRun
# As a User I want to be able to click on the four menu links on the landing landing page so that i can navigate to the respective pages

  Scenario: create the sign-on link to navigate to the sign-on page from the Landing page
    Given I am on the Newtours Landing page
    When I click on Sign-On link
    Then "Sign-on: Mercury Tours" page is displayed

  Scenario: create the REGISTER link to navigate to the REGISTER page from the Landing page

    Given I am on the Newtours Landing page
    When I Click on REGISTER link
    Then "Register: Mercury Tours" is displayed

  Scenario: create the SUPPORT link to navigate to the SUPPORT page from the Landing page
    Given I am on the Newtours Landing page
    When i Click on “SUPPORT” link
    Then "Under Construction: Mercury Tours" page is displayed


  Scenario: create the CONTACT link to navigate to the CONTACT page from the Landing page
    Given I am on the Newtours Landing page
    When i Click on “CONTACT” link
    Then “Under Construction: Mercury Tours” page is displayed