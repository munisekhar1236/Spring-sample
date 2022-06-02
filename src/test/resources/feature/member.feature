
@tag
Feature: Greeting feature
  I wnate to greet person

  @tag2
  Scenario: Greet all the greeting message
    Given url is "http://localhost:8080/rest-sample/greet/muni"
    When method is get
    Then the status code should be 200

