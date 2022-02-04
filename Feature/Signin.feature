Feature: Hepsiburada Signin

  Scenario Outline: Access to Hepsiburada page
    Given that open "https://hepsiburada.com" link
    Given Click "Giriş yap veya Üye ol"
    Given Click "Giriş yap"
    Given set "<email>"
    When Click "Giriş yap"
    Given set "<password>"
    When I press Girişyap
    Then I should see HomePage
    Examples:
      | email       | password |
      | a@gmail.com | 1234     |