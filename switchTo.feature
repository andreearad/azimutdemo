Feature: Testing SwitchTo Menu


  Scenario: alert with ok
    Given open alert page
    Then click alert with "OKTab"
    Then select ok button


  Scenario: alert with cancel
    Given open alert page
    Then click alert withh "CancelTab"
    Then click button
    Then accept
    Then dismiss

  Scenario: alert with text
    Given open alert page
    Then click ok alert "Textbox"
    Then select demonstrate
    Then write "bine" and accept

  Scenario: switch to frames
    Given open frames page
    Then go to single frame
    Then write "andreea"
    And go to frames within an iframe
    Then write 2 "rad"


