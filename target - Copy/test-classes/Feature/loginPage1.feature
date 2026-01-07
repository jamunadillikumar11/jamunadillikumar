@Regression
Feature: This feature file is to test all loginpage functionalities
# This is comment


 @sanity
Scenario: This scenario is to test login functionalities with valid credentials

   Given Launch the browser and load url
   When Provide valid username and password and hit login
   Then Validate if the user logged in then close browser
   
   @smoke
  Scenario Outline: Login test with multiple credentials

    Given Launch the browser and load url
    When Provide valid "<Username>" and "<Password>" and hit login
    Then Validate if the user logged in then close browser

    Examples:
      | Username   | Password |
      | Jamuna1611 | YTQ7GC   |
      | james123   | pass@1   |
      | Hash17     | Pass@2   |
