@outlineexample
Feature: Validating Login Functionality outline new

Scenario Outline: Test successfull login case outline new
Given User provides correct username outline new=<username>
When user provides correct password outline new=<password>
Then User must login outline new

Examples:
|username|password|
|"userA"|"passA"|
|"userB"|"passB"|