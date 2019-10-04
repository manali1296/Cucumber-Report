Feature: Swiggy signup Feature

@1
Scenario: verify Swiggy signup Form
Given I Land on swiggy homepage
When I click on signup button
Then signup form is opened
Then I enter all the data and completed the registration form

@2
Scenario: Verify Cancel Button on Signup form
Given  I Land on swiggy homepage
When I click on signup button
Then signup form is opened
Then I click on cancel button 
And SignUp form dispappers