@regression1
Feature: Teleccom feature one list
  I want to use this template for my feature file

  Background: 
    # Given user launch telecom pages
    And user click on add customer

@smoke
  Scenario: add customer flow
    When user is filling all the fields..
      | fname   | Ravi                |
      | lname   | Kumar               |
      | email   | Kumarravi@gmail.com |
      | address | Salem               |
      | phone   |          1234567890 |
    And user click on submit
    Then user should be displayed customer id is generate

@sanity @smoke @regression @karthi
  Scenario: add customer flow
    When user is filling all the field
      | Ravi   | Kumar  | Kumarravi@gmail.com | Salem    | 1234567890 |
      | Chinna | Thambi | chinna001@gmail.com | Thirupur | 4567890123 |
      | Kavin  | Kumar  | KavinRaj@gmail.com  | Erode    | 5678901234 |
    And user click on submit
    Then user should be displayed customer id is generate

@smoke
  Scenario: add customer flow
    When user is filling all the field.
      | fname  | lname  | email               | address  | phone      |
      | Ravi   | Kumar  | Kumarravi@gmail.com | Salem    | 1234567890 |
      | Chinna | Thambi | chinna001@gmail.com | Thirupur | 4567890123 |
      | Kavin  | Kumar  | KavinRaj@gmail.com  | Erode    | 5678901234 |
    And user click on submit
    Then user should be displayed customer id is generate

@sanity @regression
  Scenario: add customer flow
    When user is filling all the fieldssss
      | Ravi | Kumar | Kumarravi@gmail.com | Salem | 1234567890 |
    And user click on submit
    Then user should be displayed customer id is generate
