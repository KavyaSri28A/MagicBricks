Feature: Home Loans and Details

  Scenario: Getting Home Loans
    Given User is on Home Page of Magic Bricks
    When User clicks on Home Loans option
    And User gives the following details along with some more details
      | amount  | mobile     |
      | 4000000 | 8056343899 |
    Then User should be navigated to the verification page

  Scenario Outline: User Closing the Old loan and Opening New loan in order to minimize the interest
    Given User is on Home Page of Magic Bricks
    When User clicks on the Balance Transfer
    And User provides the following loan details
      | Amount   | Rate   | Tenure | paidEMI | NewRate   | ProcessingFee   | newtenure       |
      | <Amount> | <Rate> | <Term> | <EMI>   | <NewRate> | <ProcessingFee> | <PrepaymentFee> |
    Then User should be able to see the Difference of old interest and new interest to pay
      | expectedinterest |
      | <amount>         |

    Examples: 
      | Amount  | Rate | Term | EMI | NewRate | ProcessingFee | PrepaymentFee | amount    |
      | 4000000 |    5 |   15 |  40 |      10 |             1 |            10 |  9,17,661 |
      | 5000000 |    5 |   15 |  40 |      10 |             1 |            10 | 11,47,077 |
      | 6000000 |    5 |   15 |  40 |      10 |             1 |            10 | 13,76,492 |

  Scenario: User Selecting the bank partners for the loan
    Given User is on Home Page of Magic Bricks
    When User selects "Axis" Bank Partner
    And User provides details for a loan
    Then It should show the otp verification

  Scenario: User Calculating about the loan and EMI according to their details
    Given User is on Home Page of Magic Bricks
    When User clicks on the Home Loan EMI Calculator
    And User Provides the details
    Then It should go to  the otp verification page

  Scenario: User Giving the rate of interest less than 8
    Given User is on Home Page of Magic Bricks
    When User clicks on the Home Loan EMI CalculatorN
    And User Provides the details and rate of interest as "5"
    Then It should show the warning "Min interest starts from 8%"

  Scenario: User Getting the Interest Rate detail for the particular Loan Partners
    Given User is on Home Page of Magic Bricks
    When User clicks on "SBI" home loan interest rate
    Then The page should provide "SBI" bank Interest Details
