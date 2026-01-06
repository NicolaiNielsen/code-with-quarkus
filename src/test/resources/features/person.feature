Feature: Person
  Scenario: When a person is created that person exists
    When I create a person
    Then I get a person named "Nicolai" from "Denmark"

  Scenario: Person endpoint returns a person
    When I call the person endpoint
    Then I get a person named "Nicolai" from "Denmark"