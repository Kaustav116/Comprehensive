Feature: Landing on Promotional page

  Scenario: Testing validation of desired Promotional results
    Given Initialize the browser with Chrome once again
    And Navigate to "https://urbanladder.com/" site once again
    When User clicks on Sale header
    And User clicks on desired promotional link
    Then Verify that User lands in correct page again
    And Close the browsers once again
