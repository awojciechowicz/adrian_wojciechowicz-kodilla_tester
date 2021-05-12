Feature: Is the number divisible?
  Everybody likes Summer

  Scenario Outline: The number is divisible by 3 or 5
    Given The number is <number>
    When I ask whether is the number divisible by 3 or 5 or both
    Then The answer is <answer>
    Examples:
      | number | answer |
      | 15 | "FizzBuzz" |
      | 30 | "FizzBuzz" |
      | 45 | "FizzBuzz" |
      | 3 | "Fizz" |
      | 6 | "Fizz" |
      | 9 | "Fizz" |
      | 5 | "Buzz" |
      | 10 | "Buzz" |
      | 20 | "Buzz" |
      | 2 | "None" |
      | 7 | "None" |
      | 131 | "None" |