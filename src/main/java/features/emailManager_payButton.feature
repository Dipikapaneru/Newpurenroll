@configuration

Feature: Testing Email Manager feature
Background:
Given a user with valid admin role sign in into Corenroll Admin

Scenario Outline: Email manager adding pay button on Email Template
#Given a user with valid admin role sign in into Corenroll Admin
When a user is on Email Template page
And a user clicks on edit icon under action
And a user clicks on <button> under keywords
Then an email body with <paytext> is added
And a user clicks on Edit option

    
 Examples:
|button    |paytext  |
|Pay Button|paybutton|
