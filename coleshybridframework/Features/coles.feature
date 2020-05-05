@colessearch
Feature: coles search

Scenario: Simple Search 

Given I am on company homepage
When I enter search term
And I click on Search button
Then I find relative search contents on company homepage
 