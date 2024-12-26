Feature: Home Interior Dropdown Menu on Magicbricks

  Scenario: Verify Interior Design Services Page
    Given the user is on the Magicbricks Homepage
    When The user clicks on Home Interiors
    And the user selects Interior Design Services under Home Interiors
    And the user clicks on book your spot now button under Home Interior Mega Expo in Bangalore
    Then a pop-up should display to fill the details
    #And the pop-up offers to "Call RM" with a provided phone number

  

  Scenario: Interior design below five lakhs
    Given the user is on the 1BHK Design Ideas page
    When the user clicks on the city they needed
    And the user selects the cost to be between 5-10 lakhs
    Then the user should show all those interior design ideas

  Scenario: Requesting services from Bangalore for Bedroom design ideas
    Given the user is on the Homepage of Magicbricks1
    When The user clicks Bedroom Design Ideas
    And User selects style as luxury
    And click the price estimate button for the specified bedroom design
    Then a popup will show to fill the details on interior design requirements
    #its not moving to bedroom design page

  Scenario: Requesting services from Bangalore for Bathroom design ideas
    Given the user is on the Homepage of Magicbricks
    When The user clicks Bathroom Design Ideas
    And User selects style as simple
    And User clicks Price Estimate button for the specified bathroom design
    Then A popup will show to fill the details on bathroom design requirements

  Scenario: For calculating the full Home Interior Cost-Positive
    Given the user is on the Homepage of Magicbricks
    When the user selects Full Home Interior Cost Calculator
    And User selects the BHK type and select squarefeet needed and clicks the Next button
    Then User should fill the user details to get verified

  #negative scenario2
  Scenario: For calculating the full Home Interior Cost- negative
    Given the user is on the Homepage of Magicbricks
    When the user  selects full Home Interior Cost Calculator1
    And User click estimate cost button without filling the user details
    Then Page will display an error asking the user to select the manadatory options
