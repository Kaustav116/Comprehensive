Feature: Working of Contact Us link

  Scenario: Testing validation of Page displayed
    Given Initialize the browser with Chrome another time
    And Navigate to "https://urbanladder.com/" site another time
    When User  clicks on desired link
    Then Verify that User lands in correct page one more time
    And Close the browsers another time
