Feature: Hepsiburada Homepage


  Scenario Outline: Check if the categories are correct.
    Given that open "https://hepsiburada.com" link with "<language>" language
    Given I focus header
    When Hover over categories
    Then Categories appear to be opened
    Examples:
      | language | categories                        |
      | TR       | Elektronik                        |
      | EN       | Moda                              |
      |          | Ev, Yaşam, Kırtasiye, Ofis        |
      |          | Anne, Bebek, Oyuncak              |
      |          | Spor, Outdoor                     |
      |          | Kozmetik, Kişisel Bakım           |
      |          | Süpermarket, Pet Shop             |
      |          | Kitap, Müzik, Film, Hobi          |
      |          | Oto, Bahçe, Yapı Market           |

