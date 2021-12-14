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
@Case2
  Scenario: Bank manager should open account successfully
    When I repeat all Steps for open account
    And I am on home page again
    And I click on bank manager login tab
    And I click on open Account Tab
    And I Search customer that I created early
    And I select currency
    And I click on process button
    Then I see popup window for account open and click ok
  @Case3
  Scenario: Customer should login and log out successful
        When I repeat all Steps for customer login log out
        And I am on home page again
        And I click on customer login tab
        And I Search created customer
        And I click on login button
        Then I verify logout tab display and click on logout
@Case4
  Scenario: Customer should deposit money successfully
        When I repeat all the steps for money deposit
        And  I am on home page again
        And I click on customer login tab
        And I Search created customer
        And I click on login button
        And I click on deposit tab
        And I enter amount 100
        And I click on deposit button
        And I verify message "Deposit Successful"
@Case5
  Scenario: Customer should withdraw money successfully
        When I repeal all steps for withdraw money
        And  I am on home page again
        And I click on customer login tab
        And I Search created customer
        And I click on login button
        And I click on withdraw tab
        And I enter amount 50 for withdraw
        And I click on withdraw button
       # And I verify message "Transaction Successful"







