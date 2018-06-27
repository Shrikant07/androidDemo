Feature: Verify find us functionality.

@smoke 
Scenario: Go to options screen
	Given Application is installed
	When I choose an orgnisation
	And I click on SKIP option
	Then I should navigate to city hospital options screen


@smoke 
Scenario: Verify find us details

	When I select find us option
	Then I should see contact number
	And I should see address
	And I should see call button
	
@smoke 
Scenario: Verify sign out

	And I sign out