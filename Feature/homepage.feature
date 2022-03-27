Feature: Hepsiburada Homepage


  Scenario Outline: Check if the categories are correct.
    Given that open "https://hepsiburada.com" link with "<language>" language
    When Hover over "<category>"
    Then "<first category>" appear to be opened
    Examples:
      | language | category                   | first category       |
      | TR       | Elektronik                 | Bilgisayar/Tablet    |
      | EN       | Moda                       | Moda Anasayfa        |
      |          | Ev, Yaşam, Kırtasiye, Ofis | Sofra & Mutfak       |
      |          | Oto, Bahçe, Yapı Market    | Oto Aksesuar         |
      |          | Anne, Bebek, Oyuncak       | Anne Bebek Ürünleri  |
      |          | Spor, Outdoor              | Tüm Spor Ürünleri    |
      |          | Kozmetik, Kişisel Bakım    | Kozmetik             |
      |          | Süpermarket, Pet Shop      | Süpermarket Anasayfa |
      |          | Kitap, Müzik, Film, Hobi   | Kitap & Dergi        |


