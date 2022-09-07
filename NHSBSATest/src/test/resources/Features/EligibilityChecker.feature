Feature: Automated Eligibility Checker Tests
Description: To check whether the Eligibility Checker is working fine

Scenario: Verify a person from Wales is able to check the NHS facility using Eligibility checker.  
	Given I am a person from Wales
	When I put my circumstances into the Checker tool
	Then I should get a result of whether I will get help or not