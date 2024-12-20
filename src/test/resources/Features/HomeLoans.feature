Feature: Home Loans and Details

  #1
  #Scenario: Getting Home Loans
  #Given User is on Home Page of Magic Bricks
  #When User clicks on Home Loans option
  #And User gives the following details along with some more details
  #| amount  | mobile     |
  #| 4000000 | 8056343899 |
  #Then User should be navigated to the verification page
  
  
  #2
  #Scenario Outline: User Closing the Old loan and Opening New loan in order to minimize the interest
    #Given User is on Home Page of Magic Bricks
    #When User clicks on the Balance Transfer
    #And User provides the following loan details
      #| Amount   |Rate|Tenure|paidEMI|NewRate|ProcessingFee|newtenure|
      #| <Amount> | <Rate> | <Term> | <EMI>   | <NewRate> | <ProcessingFee> | <PrepaymentFee> |
    #Then User should be able to see the Difference of old interest and new interest to pay
#
    #Examples: 
      #| Amount  | Rate | Term | EMI | NewRate | ProcessingFee | PrepaymentFee |
      #| 4000000 |   5 |    15 |  40 |      10 |             1 |            10 |
      
      

  #Scenario: User Closing the Old loan and Opening New loan inorder to minimize the interest
  #Given User is on Home Page of Magic Bricks
  #When User clicks on the Balance Transfer
  #And User provides the following details
  #| Data    |
  #| 4000000 |
  #|      15 |
  #|       5 |
  #|      40 |
  #|      10 |
  #|       1 |
  #|      10 |
  #Then User should be able to see the Difference of old interest and new interest to pay
  #
  #
  #
  #3
  #Scenario: User Selecting the bank partners for the loan
  #Given User is on Home Page of Magic Bricks
  #When User selects "Axis" Bank Partner
  #And User provides details for a loan
  #Then It should show the otp verification
  
  #4
  Scenario: User Calculating about the loan and EMI according to their details
  Given User is on Home Page of Magic Bricks
  When User clicks on the Home Loan EMI Calculator
  And User Provides the details
  Then It should show the details of the Loan in a table format
  
  
  #5
  #Scenario: User Getting the details about the interests on EMI
    #Given User is on Home Page of Magic Bricks
    #When User clicks on Home Loan Interest Rate
    #Then User should be navigated to a page with the tabular details of Home Loan Interest Rate
    #And User should get the calculation part along with the Table
    
    
  #Scenario: User Getting the Interest Rate detail for the particular Loan Partners
    #Given User is on Home Page of Magic Bricks
    #When User clicks on "SBI" home loan interest rate
    #Then The page should provide "SBI" bank Interest Details
