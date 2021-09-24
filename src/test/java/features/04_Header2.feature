Feature: Landing on Store page

  Scenario: Testing validation of desired Store results
    Given Initialize the browser with Chrome one more time
    And Navigate to "https://urbanladder.com/" site one more time
    When User clicks on Sale header again
    And User clicks on desired store link
    Then Verify that User lands in correct page once again
    And Close the browsers one more time
