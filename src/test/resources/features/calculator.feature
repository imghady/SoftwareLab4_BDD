@tag
Feature: Calculator

  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>, One operation +
    When I do the operation for the two values
    Then I expect the result <result>

    Examples:
      | first | second | result |
      | 1     | 12     | 13     |
      | -1    | 6      | 5      |
      | 2     | 2      | 4      |

  Scenario Outline: operation for two numbers
    Given Two input values, <first> and <second>, One operation <opt>
    When I do the operation for the two values
    Then I expect the result <result>

    Examples:
      | first | second | opt | result |
      | 6     | 2      | *   | 12     |
      | 6     | 2      | /   | 3      |
      | 6     | 2      | ^   | 36     |
