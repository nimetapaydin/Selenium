Feature: Hepsiburada Homepage


  Scenario Outline: Check if the categories are correct.
    Given that open "https://hepsiburada.com" link with "<language>" language
    When Hover over "<category>"
    Then "<first category>" appear to be opened
    Examples:
      | language | category                   | first category    |
      | TR       | Elektronik                 | Bilgisayar/Tablet |
      | EN       | Moda                       | Moda Anasayfa     |
      |          | Ev, Yaşam, Kırtasiye, Ofis | Sofra & Mutfak    |
      |          | Anne, Bebek, Oyuncak       | veri              |
      |          | Spor, Outdoor              | veri              |
      |          | Kozmetik, Kişisel Bakım    | veri              |
      |          | Süpermarket, Pet Shop      | veri              |
      |          | Kitap, Müzik, Film, Hobi   | veri              |
      |          | Oto, Bahçe, Yapı Market    | veri              |

