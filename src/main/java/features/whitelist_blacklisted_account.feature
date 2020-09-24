@admin
Feature: Testing purenroll webpage
Background:
Given a user with valid admin role sign in into Corenroll Admin
@manual
Scenario: Display of Blacklisted bank accounts
#Given a user with valid admin role sign in into Corenroll Admin
When a user is on Blacklist account page
Then a user is displayed with all blacklisted accounts
 