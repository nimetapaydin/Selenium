Feature: Hepsiburada Search

  Scenario: Hepsiburada sayfası açılır bir kelime aratılır
    Given Browser acılır
    When Secilen kelime ile arama işlemi yapılır
    Then  Browser kapatılır