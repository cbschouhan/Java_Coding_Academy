@smokeTest
Feature: To test facebook login
Scenario: facebook login scenarios
	Given i am on the facebook login page
	When I entered username as "TOM"
	And I entered password as "JERRY"
	Then Login should fail
