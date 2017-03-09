Feature: Google search with different browsers

Scenario: Search with google and chrome
    Given a set of Selenium drivers
       | driver     |
       | chrome     |
       | firefox    |
    When using different search strings
       | search                  |
       | Selenium documentation  |
       | Behave documentation    |
    Then there should be no exception
    And there should be more than 5 results
