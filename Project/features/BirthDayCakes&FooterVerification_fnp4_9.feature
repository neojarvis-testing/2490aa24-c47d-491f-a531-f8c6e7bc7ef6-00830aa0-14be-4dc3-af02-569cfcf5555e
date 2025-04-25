Feature: Search Functionality for FNP website
Scenario: To perform actions on the CAKES present in menubar

Given I open the website in chrome
When I enter the "<location>" from the table below
Then I hover on the CAKES
Then I click on the BIRTHDAY CAKES then verify the cake relevant content
And I click on Same Day Delivery and 1st product
And I switch the tab then verify the relevant content
Then I add to the cart and capture the screeshot.

Examples:
| location |
| Chennai  |

Scenario: Verification of the footer links
Given I open FNP url
When I click on decoration link it should navigate to "https://www.fnp.com/decoration-services-lp" link
Then I navigate back and click on Corporate Services, it shoul navigate to "https://www.fnp.com/corporate/" link
And I navigate back and click on Affiliate Program, it should redirect to "https://www.fnp.com/info/affiliate-program" link
And I navigate back and click on Retail Stores, it should redirect to "https://www.fnp.com/info/retail-stores" link
And I navigate back and click on Franchise, it should redirect to "https://www.fnp.com/info/franchise-programme" link
And I navigate back & click on Quotes N Wishes, it should redirect "https://www.fnp.com/quotes/wishes-n-messages" link
Then I navigate back & click on Blog, it should redirect "https://www.fnp.com/blog/" link.