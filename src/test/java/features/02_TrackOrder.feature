Feature: Tracking an Item

  Scenario Outline: Testing validation of Inputs
    Given Initialize the browser with Chrome again
    And Navigate to "https://urbanladder.com/" site again
    When User clicks on Track Order option
    And User enters <OrderNo> and <PhoneNo> and clicks on Submit button
    Then Verify that User is displayed correct message
    And Close the browsers again

    Examples: 
      | OrderNo | PhoneNo      |
      | "122"   | "3434"       |
      | "122"   | "8231585710" |
