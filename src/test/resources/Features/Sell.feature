Feature: Sell and Details
#
#Scenario: User is checking valuation of their property 
  #Given the user is on the Magicbricks home page 
  #When User clicks on SELL option 
  #And the user click on property valuation option     #This Scenario is Completed 
  #And the user click on the Buy Now button
  #Then the user is navigated to Place Order button

 
  #
#Scenario: Selections of AD package for property
  #Given the user is logged into the Magicbricks app
  #When User clicks on AD Package option 
  #And select property for as Rent                               #This Scenario is completed RECommended Pack will be printed
  #And select property type as PG/Flatmate
  #Then the user is looking for the recommeded AD package 
  #
  #
#Scenario: Accessing PropWorth and validating the estimate page
  #Given the user is on the Magicbricks homepage
  #When the user hovers over SELL and selects PropWorth
  #And the user enters the property details and clicks on Get Estimate     #This Scenario is completed 
  #Then the user should be redirected to the PropWorth estimate page
  #And the page should contain the text "Estimated Worth"
#	 
#
#
 #
 #Scenario: Contacting an agent through the Find an Agent feature
  #Given the user is on the Magicbricks homepage
  #When the user clicks on Find an Agent under the SELL section              #This scenario is completed
  #And the user clicks on the Deatils of Agent button for a specific agent
  #Then the user should be redirected to a contact form page
  #And the user finds the detilas of the agent
 #
 #
 #
  #Scenario: Agent Details page 
  #Given the user is on the Magicbricks homepage                           #This scenario is completed
  #When the user clicks on Find an Agent under the SELL section
  #Then the user clicks on the Contact Agent option for a specific agent
  #And the user fill the details and submit
 #
  #
  #Scenario: selecting a city by its starting letter in Sales Enquiry
  #Given the user is on the Magicbricks homepage
  #When the user clicks on Sales Enquiry under the SELL section                 #  This scenario is completed
  #And the user selects a letter from the alphabet to filter cities starting with that letter
  #Then the user should see a list of cities starting with the selected letter on the screen
  #
  
  Scenario: Requesting Call Back without filling mandatory fiels
  Given the user is on the Magicbricks homepage                                  #  This scenario is completed
  When the user clicks on Sell/Rent Ad package
  Then the user fills the data
  And the user clicks on Request Call Back option
  
  
  
  #
#Scenario: Posting a property for rent on Magicbricks
  #Given the user is logged into the Magicbricks platform
  #When User selects the Post Property option
  #And the user fills in the following property details and many more:
    #| Property Type        | Flat |
    #| Total No. of Flats   | 100 |
    #| Property Location     | Bangalore |
    #| Name of Project/Society | Spring Seas Cross Wind |
    #| Locality              | Whitefield |
    #| Area in Whitefield    | 3G Homes Crimson Layout |
    #| RERA Id               | RERA12345 |
  #Then the property should be successfully posted for rent on Magicbricks
  #And the user should be able to view the listed property in their dashboard  
   #
##
#Scenario: Raising a free property valuation query
  #Given the user is on the Magicbricks home page
  #When User clicks on Property Valuation option
  #And In the filed of  "Get Free Advice on your Property Valuation requirement" section enters the following details:
    #| Field         | Value                |
    #| First Name    | Alapati Kavya        |
    #| City          | Bangalure            |
    #| Mobile Number | 9618871371           |
  #And the user clicks on the Ask a Free Question button
  #
  
  
  
 #//*[@id="queryErr"]
#
  