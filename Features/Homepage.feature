Feature: Swiggy Homepage feature

@h1
Scenario Outline: search Box
Given I Land on swiggy homepage
When I enter "<location>" value in Searchbox
Then I verify list of search result is populated below
Then i selected First option 
Then I verify i landed on Page with "<location>" on top left corner i was entered for search

Examples:
|location|
|Pune|