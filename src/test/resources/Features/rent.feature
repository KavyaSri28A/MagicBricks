Feature: Rent Property Search on MagicBricks 

#Scenario1

Scenario: User searches for rental properties in Bangalore
Given The user is on the MagicBricks Home Page
When User provides the following details1
And User clicks the "Search" button
Then the system should display a list of 1BHK flats in Bangalore with rents less than or equal to ₹15,000

#Scenario2

Scenario: User searches for agricultural land for rent in New Delhi
Given The user is on the MagicBricks Home Page
When user provides the Following details2
And the user clicks on the "Search" button
Then the system should display a list of Agricultural Lands for rent in New Delhi

#Scenario3

Scenario: User searches for Buy vs Rent
Given The user is on the MagicBricks Home Page
When User provides following details3
Then the system should display Buy vs Rent and Tax

#Scenario4

Scenario: User searches for rental properties in Bangalore
Given The user is on the MagicBricks Home Page
When the user enters a valid location Bangalore in the location search field
And the user clicks "Search" button
Then the system should display a list of rental properties in Bangalore


#Scenario5 
Scenario: User searches for Rental properties in Hyderabad that are immediately available
Given The user is on the MagicBricks Home Page
When User provides the Following Details5
Then the system should display a list of rental properties in Hyderabad that are immediately available


#Scenario6
Scenario: User searches for Rental properties in Mumbai
Given The user is on the MagicBricks Home Page
When User provides following details6
And The User clicking the "Search" button
Then the system displays a list of Residentail Flats for rent in Mumbai


#Scenario
Scenario Outline: User searches for rental properties with different locations
Given The user is on the MagicBricks Home Page
When the user enters different locations "<locations>" for rental properties
Then the user gets valid results for the entered location
| locations   |
| Coimbatore  |
| Ooty        |
| Goa         |