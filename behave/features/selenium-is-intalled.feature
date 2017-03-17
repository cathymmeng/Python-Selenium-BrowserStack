Feature: Lets try Selenium

Scenario: Is selenium installed
    Given Selenium has been installed
    When we try to create a driver
    Then there should be no exception

Scenario: Is Chrome driver installed
    Given Selenium Chrome driver has been installed
    When we try to create a driver
    Then there should be no exception
