@regression
Feature:
  As a end
  I want to search for a product
  So that I can see the respective result in a sorted order
@sortby
  Scenario: SortBy
    Given  I am on Homepage
    When I search for a product "MENS SHIRTS"
    And I set sort by filter a "Price: Low - High "
    Then I should see all the product in sorted order price