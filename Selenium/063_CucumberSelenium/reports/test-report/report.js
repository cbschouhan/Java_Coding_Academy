$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('com\selenium\cucumber\loginFeature.feature');
formatter.feature({
  "line": 2,
  "name": "To test facebook login",
  "description": "",
  "id": "to-test-facebook-login",
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
  "name": "facebook login scenarios",
  "description": "",
  "id": "to-test-facebook-login;facebook-login-scenarios",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "i am on the facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I entered username as \"TOM\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I entered password as \"JERRY\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Login should fail",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.i_am_on_the_facebook_login_page()"
});
formatter.result({
  "duration": 1248888587,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TOM",
      "offset": 23
    }
  ],
  "location": "LoginStepDefinition.I_entered_username_as(String)"
});
formatter.result({
  "duration": 98368237,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JERRY",
      "offset": 23
    }
  ],
  "location": "LoginStepDefinition.I_entered_password_as(String)"
});
formatter.result({
  "duration": 21485063279,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.Login_should_fail()"
});
formatter.result({
  "duration": 2116488337,
  "status": "passed"
});
});