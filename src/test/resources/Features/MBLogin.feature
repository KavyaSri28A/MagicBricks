Feature: Magic Bricks Login

  Scenario: User login on the MagicBricks
    Given The User is on the HomePage of Magic Bricks
    When The User clicks on the LOGIN button
    And The User Provides the Mobile Number to login as "8056343899"
    Then The user should be taken to the otp verification page
