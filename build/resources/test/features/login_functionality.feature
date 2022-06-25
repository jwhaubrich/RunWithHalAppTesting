Feature: Logging in to the RunWithHal application

  Scenario: Andres logs in to the RunWithHal application successfully
    Given Andres selects Continue with Google
    When he agrees to the terms of service
    Then he clicks on his Google account and signs in
