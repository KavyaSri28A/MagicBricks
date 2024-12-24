Feature: Sell and Details

Scenario: User is checking valuation of their property 
  Given the user is on the Magicbricks home page 
  When User clicks on SELL option 
  And the user click on property valuation option   
  And the user click on the Buy Now button
  Then the user is navigated to Place Order button

 
  
Scenario: Selections of AD package for property
  Given the user is logged into the Magicbricks app
  When User clicks on AD Package option 
  And select property for as Rent                               
  And select property type as PG/Flatmate
  Then the user is looking for the recommeded AD package 
  
  
Scenario: Accessing PropWorth and validating the estimate page
  Given the user is on the Magicbricks homepage
  When the user hovers over SELL and selects PropWorth
  And the user enters the property details and clicks on Get Estimate     
  Then the user should be redirected to the PropWorth estimate page
  And the page should contain the text "Estimated Worth"
	 
 
 Scenario: Contacting an agent through the Find an Agent feature
  Given the user is on the Magicbricks homepage
  When the user clicks on Find an Agent under the SELL section             
  And the user clicks on the Deatils of Agent button for a specific agent
  Then the user should be redirected to a contact form page
  And the user finds the detilas of the agent
 
 
 
 Scenario Outline: Agent Details page 
  Given the user is on the Magicbricks homepage                         
  When the user clicks on Find an Agent under the SELL section
  And the user clicks on the Contact Agent option for a specific agent and fill details
  |  name  | e-mail |  number |
  | <name> | <mail> |  <num>  |
  Then the user clicks on submit
  
  Examples: 
  
    |  name   |      mail       |    num      |
    |  Jhon   |Jhon@gmail.com   | 9618871372  |
    |  vicky  |vicky@gmail1.com | 8918871272  |
    
  
  
  Scenario: selecting a city by its starting letter in Sales Enquiry
  Given the user is on the Magicbricks homepage
  When the user clicks on Sales Enquiry under the SELL section                 
  And the user selects a letter from the alphabet to filter cities starting with that letter
  Then the user should see a list of cities starting with the selected letter on the screen
  
  
  Scenario: Requesting Call Back without filling mandatory fiels
  Given the user is on the Magicbricks homepage                                 
  When the user clicks on Sell/Rent Ad package
  Then the user fills the data
  And the user clicks on Request Call Back option
  
  ###############################################################################
  #Scenario Outline: Agent Details page 
  #Given the user is on the Magicbricks homepage                         
  #When the user clicks on Find an Agent under the SELL section
  #Then the user clicks on the Contact Agent option for a specific agent
  #And the user fill the details and submit
  #
  #
 
  