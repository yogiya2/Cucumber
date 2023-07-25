
Feature: Validating Login Functionality


@tag1 @tag2
Scenario: Comment section one is working
Given user is logged in
When user enters comment
Then comment must be posted

@tag1
Scenario: Comment seciton two is working
Given user is logged in two
When user enters comment two
Then comment must be posted two