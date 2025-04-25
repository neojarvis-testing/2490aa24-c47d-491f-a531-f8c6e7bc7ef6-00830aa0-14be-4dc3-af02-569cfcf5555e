Feature: FNP Website Navigation and Purchase Flow
Scenario: Navigate and purchase a product from the FNP website
 
Given I click on Where to deliver
When I enter the city as "Delhi"
And I click on continue shopping
And I clicked on searchbar
And I enter "cake"
And I clicked on flavour
And I clicked on Chocolate
And I clicked the firstProduct
Then I clicked on Buynow

Scenario: Navigate and purchase a product from the FNP website belongs to healthy hampers
Given I click on Where to deliver
When I enter the city as "Bangalore"
And I click on continue shopping
And I hovered on combos
And I clicked on hampers
And I clicked on availability
And I clicked on true
And I clicked on product
Then I added to cart