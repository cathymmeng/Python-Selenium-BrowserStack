Feature: Progress button should add to the progress bar

Scenario: Pushing the button should progress the progress bar
    Given Selenium has been installed
    When loading http://localhost:8181/movers/scratch.html
    And button is pressed 3 times
    Then there should be no exception
    And progress bar should be 20%
