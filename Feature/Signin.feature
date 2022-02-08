Feature: Hepsiburada Signin

  Scenario Outline: Login And See
    Given I open "https://hepsiburada.com" link
    Given I click main login button
    When I login with "<email>" email and "<password>" password
    Then I see my name
    Examples:
      | email       | password |
      | a@gmail.com | 1234     |