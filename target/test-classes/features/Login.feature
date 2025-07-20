Feature: Login Functionality.
Scenario Outline: To Verify that user can able to login using valid credantials.
Given The user lanched the URL
When The user entered valid "<user name>"
And the user entered valid "<password>"
And the user taped login button
Then the user should be logged successfull and navigate to home page

Examples:
| user name | password |
|standard_user | secret_sauce |
|problem_user |secret_sauce|

Scenario: To Verify that the user can not be able to sign in using invalid credantials
Given The user lanched the URL
When The user entered invalid user name
And the user entered invalid password
And the user taped login button
Then the user should see the inline error message