Feature: Testing purenroll webpage
Background:
Given a user with valid admin role sign in into Corenroll Admin

Scenario Outline: landing on the purenroll home page
Given a user is on purenroll login page
When a user enter valid <username> and <password>
And a user selects <code_option> for OTP option
Then a user verify <title> of the web page
Then a user enters verification code for <username>
And a user select <codeoption> for SB option
Examples:
|username 							| password| code_option | title									 |codeoption|
|hellofromcts@gmail.com | Cts@2019| email				| ENTER VERIFICATION CODE|no|


Scenario: Display of Blacklisted bank accounts
#Given a user with valid admin role sign in into Corenroll Admin
When a user navigates to Blacklist account page
Then a user is displayed with all blacklisted accounts
 