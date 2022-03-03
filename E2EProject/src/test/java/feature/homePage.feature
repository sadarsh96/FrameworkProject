Feature: Verifying Homepage

@smoke
Scenario: verify an element present on homepage
Given User successfully logged in
Then home page should be displayed with search box