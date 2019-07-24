$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('com\jpm\cucumber\dataTable\dataTable.feature');
formatter.feature({
  "line": 2,
  "name": "To test facebook registration with data table",
  "description": "Verify that the new user registration is unsuccessful after passing incorrect input",
  "id": "to-test-facebook-registration-with-data-table",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smokeTest"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "facebook registration scenario",
  "description": "",
  "id": "to-test-facebook-registration-with-data-table;facebook-registration-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on the user registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter invalid data on the page",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values"
      ],
      "line": 7
    },
    {
      "cells": [
        "First Name",
        "Yoyo"
      ],
      "line": 8
    },
    {
      "cells": [
        "Last Name",
        "Honey Singh"
      ],
      "line": 9
    },
    {
      "cells": [
        "Email Address",
        "someone@someone.com"
      ],
      "line": 10
    },
    {
      "cells": [
        "Re-enter Email Address",
        "someone@someone.com"
      ],
      "line": 11
    },
    {
      "cells": [
        "Password",
        "Password1"
      ],
      "line": 12
    },
    {
      "cells": [
        "Birthdate",
        "01"
      ],
      "line": 13
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User Registration should be unsuccessful",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTableStepDefinition.I_am_on_the_user_registration_page()"
});
formatter.result({
  "duration": 8509066211,
  "status": "passed"
});
formatter.match({
  "location": "DataTableStepDefinition.I_enter_invalid_data_on_the_page(DataTable)"
});
formatter.result({
  "duration": 6502476692,
  "status": "passed"
});
formatter.match({
  "location": "DataTableStepDefinition.User_Registration_should_be_unsuccessful()"
});
formatter.result({
  "duration": 2376536555,
  "status": "passed"
});
});