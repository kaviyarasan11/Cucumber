Feature: This is an Login Feature 
Scenario: Login with valid credentials
	Given Navigate to the website facebook.com
	When user enter user and password
	And user click on enter button
	Then user should see the home screen