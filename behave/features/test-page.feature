Feature: Two-way data binding between data and UI

Scenario: When changing heading input field, the corresponding input field should change, and the heading should also change.
    Given Selenium has been installed
    When loading the test page.
    And when the first heading input field is updated to "New Heading"
    Then the second heading input field should also changed to "New Heading"
    And the page main heading should change to "New Heading"
