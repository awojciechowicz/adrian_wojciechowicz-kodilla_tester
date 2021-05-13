Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170

  Scenario: Withdraw all money from your wallet
    Given I have deposited $30 in my wallet
    When I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $0

  Scenario: Withdrawal of money above the contents of the wallet
    Given I have deposited $30 in my wallet
    When I request $50
    Then nothing should be dispensed
    And the balance of my wallet should be $30