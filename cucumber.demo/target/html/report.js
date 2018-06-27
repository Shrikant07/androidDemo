$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("01_verify_emergency_details.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the emergency contact number details.",
  "description": "",
  "id": "verify-the-emergency-contact-number-details.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Go to options screen",
  "description": "",
  "id": "verify-the-emergency-contact-number-details.;go-to-options-screen",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Application is installed",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I choose an orgnisation",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on SKIP option",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should navigate to city hospital options screen",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.app_is_installed()"
});
formatter.result({
  "duration": 17947569868,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.i_choose_an_orgnisation()"
});
