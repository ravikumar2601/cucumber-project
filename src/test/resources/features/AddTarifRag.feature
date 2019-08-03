 @regression  @smoke
Feature: Add Tariff plan
  I want to use this template for my feature file

  Background: 
    # Given user launch telecom page
    And user clicking on add tariff plan

  #normal
  @regression
  Scenario: Add Tariff Plan
    When user is filling all the fields
    And user clicking on submit
    Then user should get display of congratulation you add tariff plan
    And user should displayed of home button



  #one dimensional list
  @smoke
  Scenario: Add Tariff Plan
    When user is filling all the fields one dimension list
      | 250 | 1500 | 60 | 200 | 1 | 5 | 3 |
    And user clicking on submit
    Then user should get display of congratulation you add tariff plan
    And user should displayed of home button

  Scenario Outline: Add Tariff Plan
    When user is filling all fields "<rent>","<min>","<inter-min>","<sms>","<charge>","<inter-charge>","<sms-charge>"
    And user clicking on submit
    Then user should get display of congratulation you add tariff plan
    And user should displayed of home button

    Examples: 
      | rent | min  | inter-min | sms | charge | inter-charge | sms-charge |
      |  250 | 1500 |        60 | 200 |      1 |            5 |          3 |
      |  350 | 2000 |        90 | 175 |      3 |            6 |          2 |
      |  450 | 1750 |        45 | 236 |      2 |            7 |          1 |
