Feature: Hepsiburada Search

#  Scenario Outline: Hepsiburada sayfası açılır bir kelime aratılır ve o kelime sonuçlar arasında görünmelidir
#    Given Browser acılır
#    Given  Hepsiburada sayfası acılır
#    When  "selected word" ile arama işlemi yapılır
#    Then "selected word" sonuçlar arasında görünmelidir
#    And   Browser kapatılır
#    Examples:


  Scenario Outline: When open hepsiburada page and after search any product then i should see product in list
    Given that open "https://hepsiburada.com" link with "<language>" language
    Given I focus search bar
    Given I type "<product>"
    When I press Enter
    Then I should see "<product>" products in list
    Examples:
      | language | product    |
      | TR       | buzdolabı |
      | EN       | freezer    |
