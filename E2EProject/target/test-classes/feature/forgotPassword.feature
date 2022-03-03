Feature: Forgot password

@smoke
Scenario: validating forgot password functionality on failed login
Given Login window is displayed
When  user click on forgot password link
Then Reset password is displayed