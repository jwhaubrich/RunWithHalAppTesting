Feature: Basic functionality works with the Run with Hal Application
  Background: Andres has the RunWithHal application open
    Given Andres is logged in to RunWithHal

    Scenario: Andres can click on each of the main tabs
      Then Andres is able to click on each of the main tabs