Feature: Application Login 


Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with username "Jilly" and password "1234"
Then Home page is populated
And Cards are displayed


Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with username "Jhonjjj" and password "1234fgf"
Then Home page is populated
And Cards are displayed

Scenario: Home page default login
Given User is on Netbanking landing page
When User sign up with following details
| Jhone | jksfjfs | jhon@gmail.com | Bangalore | 345878 |
Then Home page is populated
And Cards are displayed

Scenario Outline: Home page default login
Given User is on Netbanking landing page
When User login in to application with <username> and <password>
Then Home page is populated
And Cards are displayed

Examples:
|username|password|
|user1   |pass1   |
|user2   |pass2   |
|user3   |pass3   |

