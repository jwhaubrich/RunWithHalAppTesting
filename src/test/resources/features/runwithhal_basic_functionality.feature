Feature: Basic functionality works with the Run with Hal Application
#  Background: Andres is inside of the Run With Hal application
#    Given the Run With Hal application is open

#  Scenario: Joe can open Run With Hal and use basic features
#    When he is on the screen with Run With Hal
#    Then he clicks on the application to open it

  Scenario: Andres logs in to RunWithHal and clicks on the More option
    Given he logs in to RunWithHal
    Then he clicks on the More option
