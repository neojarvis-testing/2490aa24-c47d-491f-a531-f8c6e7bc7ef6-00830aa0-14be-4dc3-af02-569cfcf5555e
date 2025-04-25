Feature: FNP Website Dynamic Location Validation

  Scenario: Search and add a product to the cart based on location
    Given open the browser
    When click on the where to deliver
    And enter the location "<location>" from the table below
    And click Continue Shopping
    And verify the pincode "<pincode>"
    And click the search icon
    And enter the keyword "<product>" in the search bar
    And click on the first product first product
    And click cart Add to cart
    And verify the button labeled Buy Now is present
    Then capture the screenshot

  Examples:
    | location | pincode            | product |
    | Delhi    | Delhi, India, 110085 | pen    |


  Scenario: Verify location, navigate through plants, and validate cart
    Given I open the browser
    When I click Where to deliver
    And I click on the area selection field
    And I enter the location "Bangalore"
    And I click Continue Shopping
    When I click on Plants present on the navigation bar
    And I click on Lucky Bamboo under Plants and navigate back to homepage
    When I click on Jade Plants under Plants and navigate back to homepage
    When I click on Money Plants under Plants and navigate back to homepage
    Then I click on cart
