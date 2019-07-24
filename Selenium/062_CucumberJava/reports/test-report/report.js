$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('com\selenium\cucumber\sample.feature');
formatter.feature({
  "line": 2,
  "name": "To test my cucumber java application is running",
  "description": "",
  "id": "to-test-my-cucumber-java-application-is-running",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smokeTest"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "cucumber scenario",
  "description": "",
  "id": "to-test-my-cucumber-java-application-is-running;cucumber-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "sample feature file is ready",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I run the feature file",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "run should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.givenStatment()"
});
formatter.result({
  "duration": 99102689,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.whenStatement()"
});
formatter.result({
  "duration": 58865,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.thenStatment()"
});
formatter.result({
  "duration": 56147,
  "status": "passed"
});
});