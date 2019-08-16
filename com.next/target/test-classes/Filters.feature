@regression
  @filter
  Feature: search for the filtered product
    As a next user
   I want to search for a product
   So that i can see the result
    Scenario:
      Given I am on Homepage
      When I select "shoes"
      And I move to "Trainers & Pumps"
      Then I take screen shot
