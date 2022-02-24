Feature: Hepsiburada Product

#  Scenario Outline: After Search And See product List
#    Given that open "https://hepsiburada.com" link with "<language>" language
#    Given I focus search bar
#    Given I type "<product>"
#    When I press Enter
#    Then I should see "<product>" products in list
#    Examples:
#      | language | product    |
#      | TR       | buzdolabı |
#      | EN       | freezer    |

  Scenario Outline: After searching, the product is selected from the list.
    Given that open "https://hepsiburada.com" link with "<language>" language
    Given I focus search bar
    Given I type "<product>"
    Given I press Enter
    When  Product is selected from the list.
    Then I should see product and open product
    Examples:
      | language | product    |
      | TR       | buzdolabı |
      | EN       | freezer    |