Feature: Verify news section.

@smoke 
Scenario: Go to options screen
	Given Application is installed
	When I choose an orgnisation
	And I click on SKIP option
	Then I should navigate to city hospital options screen
	
@smoke 
Scenario: Verify news

	When I select news option
	Then I should navigate to news screen
	
@smoke 
Scenario: Verify sign out

	And I sign out