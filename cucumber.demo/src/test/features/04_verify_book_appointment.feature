Feature: Verify book appointment functionality.

@smoke 
Scenario: Go to options screen
	Given Application is installed
	When I choose an orgnisation
	And I click on SKIP option
	Then I should navigate to city hospital options screen
	
@smoke 
Scenario: Verify book appointment

	When I select call emergency option
	Then I should see emergency contact number
	And I should see switchboard number
	And I should see call center contact number
	
@smoke 
Scenario: Verify sign out

	And I sign out