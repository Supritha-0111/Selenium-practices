Feature: Search and place order

@SeleniumTest
Scenario: Search for an items and validate the results
Given USer is on GreenKart landing page
When User searched for "Cucumber" vegetable
Then "Cucumber" results are displayed

@SeleniumTest
Scenario: Search for an items and validate the results
Given USer is on GreenKart landing page
When User searched for "Brinjal" vegetable
And Added items to cart
And user proceeded to checkout page for purchase
Then verify selected "Brinjal" are displayed in checkout page.