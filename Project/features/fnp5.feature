Feature: Search functionality for the fnp website
Scenario: Search for Personalised Mugs
Given I am on fnp website
When I click on the close pop up
And click on "Where to deliver?"
And I enter the location "<location>" from the table below
And I click "Continue Shopping"
And I verify the pincode "<pincode>" 
And click on Personalised on the navigation bar
And click on Mugs under gifts
And click on first product under Magical Mugs
And switch to a new tab
And click on "Add to Cart" button
Then I capture the screenshot

Examples:
    | location | pincode |
    | Bangalore    | 110085  |


Scenario: Search for Lifestyle Rings
Given I am on fnp homepage
When I click on the close pop up
And click on "Where to deliver?"
And I enter the location "<location>" from the table below
And I click "Continue Shopping"
And I verify the pincode "<pincode>" 
And click on Lifestyle on the navigation bar
And click on Rings under jewellery
And click on first product under Rings
And switch to a new tab
And click on "Add to Cart" button
Then I capture the screenshot

Examples:
    | location | pincode |
    | Kolkata    | 700073  |