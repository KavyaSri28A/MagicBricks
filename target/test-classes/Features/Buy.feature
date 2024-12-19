Feature: Property Buying Process


#Scenario: The user is Looking for Ready to Move Property
#
   #Given the user is on the MagicBricks homepage1
    #When the user clicks on the Buy option
   #And the user selects the Ready-to-Move option
    #And the user selects Posted By as Owner
    #And the user selects Top localities as sarjapur roads
    #Then the user will be presented with properties based on the selected preferences
#
 #Scenario: User searches for Localities in Bangalore with Price/Sqft filter
    #Given the user is on the Magicbricks homepage2
    #
    #When the user selects on the Buy option
    #And the user selects the Localities in Bangalore
    #And the user selects filter price/sqft
    #Then the user should see the localities in Bangalore filtered by the selected price range
    #
 Scenario: User searches for Comparing  Localities & Projects
    Given the user is on the MagicBricks homepage3
    When the user selects on Buy option2
    And the user selects Tips and Guide
    And the user Selects Localities
    And the user Enter Locality1 and Locality2 and click compare
    Then the user should see localities and projects comaparison
    
 