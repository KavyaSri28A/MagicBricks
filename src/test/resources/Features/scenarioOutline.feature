 Feature: Agent details
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
    
    
    
 