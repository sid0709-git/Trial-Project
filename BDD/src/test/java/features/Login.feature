Feature: Application Login

Scenario: Home Page default Login
Given User is on Net banking landing page
When User login with "jin" and password "34235"
Then  Home page is populated
And cards are displayed "true"

Scenario: Home Page default Login
Given User is on Net banking landing page
When User login with "jinny" and password "37575"
Then  Home page is populated
And cards are displayed "false"

