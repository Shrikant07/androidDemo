Feature: Verify find doctor functionality.

@smoke 
Scenario: Go to options screen
	Given Application is installed
	When I choose an orgnisation
	And I click on SKIP option
	Then I should navigate to city hospital options screen
	
@smoke 
Scenario: Verify find doctor

	When I select find doctor option
	Then I should navigate to find doctor screen
	Then I enter doctor name
	Then I select a doctor name
	Then I should see searched doctor info
	
@smoke 
Scenario: Verify sign out

	And I sign out