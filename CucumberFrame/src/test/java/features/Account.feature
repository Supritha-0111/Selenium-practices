Feature: Application Login 

@SanityTest
Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with username "Jilly" and password "1234"
Then Home page is populated
And Cards are displayed


