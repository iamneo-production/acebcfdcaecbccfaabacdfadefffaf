Feature: Searching for articles on Wikipedia

  Scenario: Search for an article
    Given I am on the Wikipedia homepage
    When I search for "Selenium"
    Then I see search results for "Selenium"

  Scenario: Verify embedded link
    Given I am on the Wikipedia homepage
    When I search for "Selenium"
    And I click on the first link
    Then I should be redirected to the "Selenium" article