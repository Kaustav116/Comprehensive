Feature: Working of Subscribe button

  Scenario Outline: Testing validation of Inputs again
    Given Initialize the browser with Chrome another time once again
    And Navigate to "https://urbanladder.com/" site another time once again
    When User enters <Email> in corresponding space provided
    And User clicks on Subscribe button
    Then Verify that User is displayed correct message again
    And Close the browsers another time once again

    Examples: 
      | Email           |
      | "abc@gmail.com" |
      | "xyz"           |
