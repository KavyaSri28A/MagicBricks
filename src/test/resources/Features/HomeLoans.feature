Feature: Home Loans and Details

  Scenario: Getting Home Loans
    Given User is on Home Page of Magic Bricks
    When User clicks on Home Loans option
    And User gives the following details along with some more details
      | amount  | mobile     |
      | 4000000 | 8056343899 |
    And User gives more details
    Then User should be navigated to the verification page
    And User should be able to get the loan availabilities of given details
    
    
    
    
#
  #Scenario: User Closing the Old loan and Opening New loan inorder to minimize the interest
    #Given User is on Home Page of Magic Bricks
    #When User clicks on the Balance Transfer
    #And User provides the following details
      #| OldLoanAmount | OldTenure | OldRateOfInterest | OldInstallmentPaid | NewProcessingFees | NewTenure | NewRateOfInterest |
      #|       4000000 |         5 |                15 |                  5 |                 1 |        10 |                10 |
    #Then User should be able to see the Difference of old interest and new interest to pay
#
  #Scenario: User Selecting the bank partners for the loan
    #Given User is on Home Page of Magic Bricks
    #When User selects "Axis" Bank Partner
    #And User provides details for a loan
    #Then It should show the available schemes of the loans in "Axis" bank
#
  #Scenario: User Calculating about the loan and EMI according to their details
    #Given User is on Home Page of Magic Bricks
    #When User clicks on the Home Loan EMI Calculator
    #And User Provides the following details
      #| Amount  | Tenure | RateOFInterest |
      #| 4000000 |     30 |              5 |
    #Then It should show the details of the Loan in a table format
#
  #Scenario: User Getting the details about the interests on EMI
    #Given User is on Home Page of Magic Bricks
    #When User clicks on Home Loan Interest Rate
    #Then User should be navigated to a page with the tabular details of Home Loan Interest Rate
    #And User should get the calculation part along with the Table
#
  #Scenario: User Getting the Calculator for the particular Loan Partners
    #Given User is on Home Page of Magic Bricks
    #When User clicks on "SBI" home loan EMI calculator
    #Then The page should provide "SBI" bank EMI Details
#
  #Scenario: User Getting the Interest Rate detail for the particular Loan Partners
    #Given User is on Home Page of Magic Bricks
    #When User clicks on "SBI" home loan interest rate
    #Then The page should provide "SBI" bank Interest Details
