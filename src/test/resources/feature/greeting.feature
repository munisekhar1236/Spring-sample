
@tag
Feature: Greeting feature
  I wnate to greet person

  @tag2
  Scenario: Greet person
    Given I want to greet person.
    When I send name "<name>".
    Then verify greeting "<name>".

    Examples: 
      | name  | value | status  |
      | abc |     5 | success |
      | edf |     7 | Fail    |

