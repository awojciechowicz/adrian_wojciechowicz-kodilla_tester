Feature: Cash Withdrawal
  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited $<cash> in my wallet
    When I request $<amount>
    Then $<amount> should be dispensed
    Examples:
      | cash | amount |
      | 200 | 30 |
      | 30 | 30 |
      | 10 | 30 |
