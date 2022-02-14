Feature: Hepsiburada Product

  Scenario Outline: After Search And See product List
    Given that open "https://hepsiburada.com" link with "<language>" language
    Given I focus search bar
    Given I type "<product>"
    When I press Enter
    Then I should see "<product>" products in list
    Examples:
      | language | product    |
      | TR       | buzdolabı |
      | EN       | freezer    |