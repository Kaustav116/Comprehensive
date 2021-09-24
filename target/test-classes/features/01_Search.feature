Feature: Searching for an Item

  Scenario Outline: Testing validation of Search results
    Given Initialize the browser with Chrome
    And Navigate to "https://urbanladder.com/" site
    When User enters <Testdata> and clicks on Submit button in Search bar
    Then Verify that User lands in correct page
    And Close the browsers

    Examples: 
      | Testdata |
      | "ch"     |
