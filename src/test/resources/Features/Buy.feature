Feature: Property Buying Process


Scenario: The user is Looking for Ready to Move Property

   Given the user is on the MagicBricks homepage1
   When the user clicks on the Buy option
   And the user selects the Ready-to-Move option
   And the user selects Posted By as Owner
   And the user selects Top localities as "Sarjapur Road"
   Then the user will be presented with properties based on the selected preferences

Scenario: User searches for Localities in Bangalore with Price/Sqft filter
 
    Given the user is on the Magicbricks homepage2
    When the user selects on the Buy option
    And the user selects the Localities in Bangalore
    And the user selects filter price/sqft
    Then the user should see the localities in Bangalore filtered by the selected price range
    
Scenario: User searches for Comparing  Localities & Projects
    Given the user is on the MagicBricks homepage3
    When the user selects on Buy option2
    And the user selects Tips and Guide
    And the user Selects Localities
    And the user Enter Locality1 and Locality2 and click compare
    |Locality1|Locality2|
    |"<city1>"|"<city2>"| 
    Then the user should see localities and projects comaparison
   
    Examples:
    |  city1               |       city2                  |
    | Medavakkam, Chennai  |  Sarjapur Road, Bangalore    |
   
    
    
Scenario: User selects a city and locality to find an agent
    Given the user is on the MagicBricks homepage4
    When the user selects the Buy option3
    And the user selects on Find an Agent
    And the user selects the city and Localities filter
    Then the user should get Agents based on selected criteria
    
Scenario: User selects office space in bangalore
  Given the user is on the MagicBricks homepage5
  When the user selects the Buy option4
  And the user selects office space in bangalore
  And the user selects new projects and sort office space by price low to high
  Then the user should get office space based on filter
  
 @negative
 Scenario: User selects same location 
 Given the user is on the MagicBricks homepage6
 When the user selects the Buy option5
 And the user selects tips and guide
 And the user Enter locality1 and locality2 and click compare
 Then the user should get Please enter a different locality name
 
 
  
   
      
 
      
 
 
    
    

 
    
 