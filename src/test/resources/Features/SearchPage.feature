Feature: User should be able to see the Homepage and enter criteria.

  Scenario: Verify that User is able to enter search product and hit search button
    Given User loads homepage
    And Enters the sear criteria
    When User click the search button
    Then User navigates to searched page
    And User verifies the boxe is unchecked
    When user checks the Carbon Fiber box
    And User navigate to Carbon Fiber product
    Then User gets products and prices