Feature: Login into application

@smoke
Scenario Outline: Test validating login
Given Initialize the browser with chrome
And Navigate to "https://rahulshettyacademy.com" site
And Click on login link in homepage to land on sign in page
When user enters <username> and <password> and logs in
Then Verify that user is successfully logged in

Examples:
|username			|password|
|test99@gmail.com	|123456|
|test123@gmail.com	|1234567|