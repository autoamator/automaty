Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario: Sunday isn't Friday
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "Nope"

  Scenario: Some web test
    Given I open google page
    And I close the disclaimer
    When I search for the term "kiszka"
    Then I see the result "kiszka ziemniaczana" in result page