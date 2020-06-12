Feature: Testing purenroll webpage
Scenario Outline: landing on the purenroll home page
Given a user is on purenroll login page
When a user enter valid <username> and <password>
And a user selects <code_option> for OTP option
Examples:
|username | password| code_option |
|hellofromcts@gmail.com | Cts@2020| email|


