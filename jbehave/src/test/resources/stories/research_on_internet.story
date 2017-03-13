Sample story

Narrative:
In order to research stuff on the internet
As a development team
I want to be able to use google to search for stuff
					 
Scenario: Should be able to load the Google website
Given that Selenium is installed
When loading the http://google.com/ url
Then status should be 200

Scenario: Should be able enter a search string
Given that Selenium is installed
When loading the http://google.com/ url
Then I am able to enter search string into a field