@smokeTest
Feature: To test facebook registration with data table
Verify that the new user registration is unsuccessful after passing incorrect input
Scenario: facebook registration scenario
	Given I am on the user registration page
	When I enter invalid data on the page
	| Fields                 | Values              |
	| First Name             | Yoyo                |
	| Last Name              | Honey Singh         |
	| Email Address          | someone@someone.com |
	| Re-enter Email Address | someone@someone.com |
	| Password               | Password1           |
	| Birthdate              | 01                  |
	Then User Registration should be unsuccessful
