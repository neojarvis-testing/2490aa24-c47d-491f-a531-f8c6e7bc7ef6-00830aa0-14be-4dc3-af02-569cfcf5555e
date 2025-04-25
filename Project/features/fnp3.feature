Feature: FNP Website Navigation and Purchase Flow
Scenario: Navigate and purchase a product from the FNP website

Given I opened the browser
When I clicked on Where to deliver
And I entered the city as "Chennai"
And I clicked on continue shopping
And I hover on Anniversary
And I click on roses which is under Flowers category
And I select the first product
And I click on Buy Now
#Then I verify the page contains "Home/" and capture the screenshot

Scenario: Navigate through footer links on the FNP website
Given I'm in the browser
When I navigate to Terms & Conditions to verify "https://www.fnp.com/info/terms-and-conditions"
And I navigate to Privacy Policy to verify "https://www.fnp.com/info/privacy-policy"
And I navigate to Terms of use to verify "https://www.fnp.com/info/terms-of-use"
And I navigate to Disclimer to verify "https://www.fnp.com/info/disclaimer"
And I navigate to About us to verify "https://www.fnp.com/info/about-us"
And I navigate to FNP team to verify "https://www.fnp.com/info/fnp-team"
And I navigate to Careers to verify "https://www.fnp.com/info/careers"
And I navigate to Testimonial to verify "https://www.fnp.com/info/testimonials"
Then I verify the key word "Policy Info" and capture the screenshot