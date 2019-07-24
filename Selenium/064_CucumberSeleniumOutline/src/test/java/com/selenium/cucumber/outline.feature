@smokeTest
Feature: scenario Outline To test facebook login
Scenario: facebook login scenarios
	Given i am on the facebook login page
	When I entered Username as "<username>"
	And I entered Password as "<password>"
	Then Login should fail
	|	username	|	password	|
	|	username1	|	password1	|
	|	username2	|	password2	|