Feature: Amazon Shopping

  Background: Login page
    Given user is on the amazon login page

  @positive
  Scenario: Successful login to Amazon
    When user enters valid credentials
    Then user should be logged in successfully

  @negative
  Scenario: Invalid login to Amazon
    When user enters invalid credentials
    Then user should see an error message for invalid login










#  Scenario: Search for a valid product on Amazon
#    Given User is logged in to Amazon
#    When User searches for "Laptop"
#    Then User should see search results for "Laptop"