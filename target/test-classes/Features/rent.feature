Feature: Rent Property Search on MagicBricks

 # Scenario1

  Scenario: User searches for 1BHK flats for rent in Bangalore under ₹15,000
    Given The user is on the MagicBricks Home Page
    When User provides the following details1
    | Location  | Property Type | Property Configuration | Configuration | Maximum |
    | Bangalore | Residential   | Flat                   | 1BHK          | ₹15,000 |
    And User clicks the "Search" button
    Then the system should display a list of 1BHK flats in Bangalore with rents less than or equal to ₹15,000
        
  # scenario2

  Scenario: User searches for Agricultural Land for rent in New Delhi
    Given The user is on the MagicBricks Home Page
    When user provides the Following details2
    | Location  | Property Type     |
    | New Delhi | Agricultural Land |
    And the user clicks on the "Search" button
    Then the system should display a list of Agricultural Lands for rent in New Delhi
  	
  # scenario4
  
  Scenario: User searches for rental properties in Bangalore by entering a valid location
    Given The user is on the MagicBricks Home Page
    When the user enters a valid location "Bangalore" in the location search field
    And the user clicks "Search" button
    Then the system should display a list of rental properties in Bangalore
    
   # scenario5
    
   Scenario: User searches for rental properties in Hyderabad that are immediately available
    Given The user is on the MagicBricks Home Page
    When User provides the Following Details5
    | Location  | Availability Status   |
    | Hyderabad | Immediately Available |
    Then the system should display a list of rental properties in Hyderabad that are immediately available
    
    #Scenario6
    
    Scenario:User Searches for 5BHK for Rent in Mumbai within ₹5,000 to ₹10,000
    Given The user is on the MagicBricks Home Page
    When User provides following details6
    | Location | Property Type | Property Configuration | Minimum | Maximum |
    | Mumbai   | Residential   | Flat                   | ₹5,000  | ₹10,000 |
    And The User clicking the "Search" button
    Then the system displays a list of Residentail Flats for rent in Mumbai
    
   #scenario3
  
		Scenario: User navigates from Magic Bricks homepage to Rent and then explores Buy vs Rent and Tax
    Given The user is on the MagicBricks Home Page
		When User provides following details3
		| Location | Rent        |
		| Noida    | Buy vs Rent |
		Then the system should display Buy vs Rent and Tax
    
  
  