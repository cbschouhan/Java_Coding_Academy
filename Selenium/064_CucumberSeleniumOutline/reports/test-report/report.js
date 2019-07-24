$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('com\selenium\cucumber\outline.feature');
formatter.feature({
  "line": 2,
  "name": "scenario Outline To test facebook login",
  "description": "",
  "id": "scenario-outline-to-test-facebook-login",
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
  "id": "scenario-outline-to-test-facebook-login;facebook-login-scenarios",
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
  "name": "I entered Username as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I entered Password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Login should fail",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "username1",
        "password1"
      ],
      "line": 9
    },
    {
      "cells": [
        "username2",
        "password2"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ScenarioOutlineSteps.i_am_on_the_facebook_login_page()"
});
formatter.result({
  "duration": 2753135155,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cusername\u003e",
      "offset": 23
    }
  ],
  "location": "ScenarioOutlineSteps.I_entered_Username_as(String)"
});
formatter.result({
  "duration": 106237105,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cpassword\u003e",
      "offset": 23
    }
  ],
  "location": "ScenarioOutlineSteps.I_entered_Password_as(String)"
});
formatter.result({
  "duration": 1063723728,
  "status": "passed"
});
formatter.match({
  "location": "ScenarioOutlineSteps.Login_should_fail(DataTable)"
});
formatter.result({
  "duration": 2098377595,
  "status": "passed"
});
});