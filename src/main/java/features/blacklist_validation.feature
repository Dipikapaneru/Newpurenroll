@blist
Feature: Testing blacklist account validation
Background:
Given a user with valid admin role sign in into Corenroll Admin

Scenario Outline: Validation of blacklisted account 
When a user landed on manageClient page
Then a user search an agent with valid <id>
Then a user click on view invoice image
Examples:
|id|
|9943434|