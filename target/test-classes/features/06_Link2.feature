Feature: Working of YouTube channel link present after Navigation through Homepage

  Scenario: Testing validation of Website displayed
    Given Initialize the browser with Chrome another time again
    And Navigate to "https://urbanladder.com/" site another time again
    When User  clicks on desired link again
    And User clicks on another link present
    Then Verify that User lands in correct page another time
    And Close the browsers another time again
