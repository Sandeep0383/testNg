@regression
Feature:
  As a end
  I want to search for a product
  So that I can see the respective result
  @search
  Scenario: Search
    Given  I am on Homepage
    When I search for a product "MENS SHIRTS"
    Then I can see the respective result
