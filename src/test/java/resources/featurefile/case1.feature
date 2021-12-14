Feature: XYZ Bank Test
  As a user I am on home page of XYZ Bank and I can check all function perform by Bank manager and customer of bank
  @Case1
  Scenario: Bank manager should add customer successfully
    Given I am on home page
    When I click on bank manager login tab
    And I click on add customer tab
    And I enter firstname
    And I enter lastname
    And I enter postcode
    And I click on  add customer button
    Then I see popup window verify message and click on ok
