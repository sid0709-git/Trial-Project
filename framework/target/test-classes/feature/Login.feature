Feature: Login into Application

Scenario Outline: Positive Test Validation
Given Initialize browser with chrome
And Navigate to "http://qaclickacademy.com" Site
And click on login link on homepage to land on signin page
When User enter <username> and <passsword> and logs in 
Then Verify user is successfuly login
And close browser

Examples:
|username						    |passsword|
|siddhu123@gmail.com 		|	123456  |
|mahi234@gmail.com    	|	234561  |

