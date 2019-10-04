Feature: Verify hotels Functionality

@ho1
Scenario Outline: verify Ratings
Given I Land on swiggy homepage
When I enter Location value in Searchbox
Then I verify list of search result is populated below
Then i selected First option 
Then I verify i landed on Page with "<location>" on top left corner i was entered for search
Then I verify Hotels which Has Rating more than "4.5"

Examples:
|location|
|Pune|

@ho2
Scenario Outline: verify Exclusive band
Given I Land on swiggy homepage
When I enter Location value in Searchbox
Then I verify list of search result is populated below
Then i selected First option 
Then I verify i landed on Page with "<location>" on top left corner i was entered for search
Then I verify Hotels which has "Exclusive" band on top left corner

Examples:
|location|
|Pune|

@ho3 @test
Scenario Outline: Verify Promoted hotels
Given I Land on swiggy homepage
When I enter Location value in Searchbox
Then I verify list of search result is populated below
Then i selected First option 
Then I verify i landed on Page with "<location>" on top left corner i was entered for search
Then I verify Hotels Has "Promoted" band in left corner
Examples:
|location|
|Pune|

@ho4 @test
Scenario Outline: verify Search feature
Given I Land on swiggy homepage
When I enter Location value in Searchbox
Then I verify list of search result is populated below
Then i selected First option 
When I click on "Search" option
And I entered "<search_option>"
Then I found the search result contains item with search option
Then I verify hotels which has more than "<rating>" 

Examples:
|location|search_option|rating|
|Pune|icecream|4.1|

@ho6 
Scenario Outline: verify hotels  badges color
Given I Land on swiggy homepage
When I enter Location value in Searchbox
Then I verify list of search result is populated below
Then i selected First option 
Then I verify i landed on Page with "<location>" on top left corner i was entered for search
Then I verify hotels rating colors

Examples:
|location|
|Pune|

@ho7
Scenario Outline: verify Quick view functionality
Given I Land on swiggy homepage
When I enter Location value in Searchbox
Then I verify list of search result is populated below
Then i selected First option 
Then I verify i landed on Page with "<location>" on top left corner i was entered for search
Then I hover the mouse on "<hotel>" 
And I click on "<quick__View>" Link
Then I verify second box opened with number of hotel menus
Then I verify hotel has "149" , "199" Of Rupees menus


Examples:
|location|hotel|quick_View|
|Pune|pizzahut|Quick View|


