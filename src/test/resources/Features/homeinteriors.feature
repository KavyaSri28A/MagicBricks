
Feature: Home Interior Dropdown Menu on Magicbricks

  Scenario: Verify Interior Design Services Page
    #Given the user is on the Magicbricks Homepage
    #When The user clicks on Home Interiors
    #And the user selects Interior Design Services under Home Interiors
    #And the user clicks on book your spot now button under Home Interior Mega Expo in Bangalore
    #Then a pop-up should display to fill the details
#
#
#Scenario: Requesting a Free Consultation for 1BHK Designs
    #Given the user is on the Homepage of Magicbricks
    #When the user clicks on 1BHK interior design under Full Home Interior Designs
    #And click on the Get an Estimate for your home button
    #Then click which city user want
    #And user clicks continue
    #
#Scenario: Interior design below five lakhs
    #Given the user is on the 1BHK Design Ideas page
    #When the user clicks on the city they needed
    #And the user selects the cost to be between 5-10 lakhs
    #Then the user should show all those interior design ideas
#
#
#Scenario: Requesting services from Bangalore for Bedroom design ideas
    #Given the user is on the Homepage of Magicbricks1
    #When The user clicks Bedroom Design Ideas
    #And User selects style as luxury
    #And click the price estimate button for the specified bedroom design
    #Then a popup will show to fill the details on interior design requirements
    
Scenario: Requesting services from Bangalore for Bathroom design ideas
    Given the user is on the Homepage of Magicbricks
    When The user clicks Bathroom Design Ideas
    And User selects style as simple
    And User clicks Price Estimate button for the specified bathroom design
    Then A popup will show to fill the details on bathroom design requirements
    
    
    
    

Scenario Outline: For calculating the InteriorCost
Given the user is on the Magicbricks Homepage
When the user selects Full Home Interior Cost Calculator
And User selects the BHK type and select squarefeet needed
And clicks the Next button
Then User should fill the user details to get verified

|  phoneNumber    |
|  "<phone>"      |

Examples: 
|   phone         |
| 8281672646      |
| 9446279690      |








#negative scenario
  #Scenario: For calculating the full Home Interior Cost- negative
    #Given the user is on the Homepage of Magicbricks
    #When the user  selects full Home Interior Cost Calculator1
    #And User click estimate cost button without filling the user details
    #Then Page will display an error asking the user to select the manadatory options
    
    
    
    
    
    

Scenario: User Giving the rate of interest less than 8
    Given the user is on the Homepage of Magicbricks
    When User clicks on the Home Loan EMI Calculator
    And User Provides the details and rate of interest as "5"
    Then It should show the warning "Min interest starts from 8%"
    
    
    
    
    
<<<<<<< HEAD
    
=======
>>>>>>> 9c986533d53d2e6aece7dfcfa9b51d695feccf0a
