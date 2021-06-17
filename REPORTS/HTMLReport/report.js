$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/login.feature");
formatter.feature({
  "name": "To validate the login functionality of the given application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To verify the login functionality of the facebook application with given credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User will enter the UserId and Password in the respective field",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.userWillEnterTheUserIdAndPasswordInTheRespectiveField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_will_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is verifying the fb functionality",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_verifying_the_fb_functionality()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is verifying the fb functionality  sysout",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.userIsVerifyingTheFbFunctionalitySysout()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the login functionality of the instagram application with given credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User will enter the UserId and Password in the respective Fields",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.userWillEnterTheUserIdAndPasswordInTheRespectiveFields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click the login btn",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.userWillClickTheLoginBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is verifying the ins functionality",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.userIsVerifyingTheInsFunctionality()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is verifying the ins functionality  sysout",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.userIsVerifyingTheInsFunctionalitySysout()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});