Feature: HomeLoans and Details

  Scenario: User getting the details of a Home Loan
    Given User is on Home Page of Magic Bricks
    When User clicks on Home Loans option
    And User gives the following details along with some more details
      | amount  | mobile     |
      | 4000000 | 9566935372 |
    Then User should be navigated to the verification page

  Scenario Outline: The user wants to close the old loan and getting new loan
    Given User is on Home Page of Magic Bricks
    When User clicks on the Balance Transfer
    And User provides the following loan details
      | Amount   | Tenure   | Rate     | paidEMI  | newtenure | NewRate  | ProcessingFee |
      | <field1> | <field2> | <field3> | <field4> | <field5>  | <field6> | <field7>      |
    Then User should be able to see the Difference of old interest and new interest to pay
      | expectedinterest |
      | <field8>         |

    Examples: 
      | field1  | field2 | field3 | field4 | field5 | field6 | field7 | field8    |
      | 4000000 |     15 |      5 |     40 |     10 |     10 |      1 |  9,17,661 |
      | 5000000 |     15 |      5 |     40 |     10 |     10 |      1 | 11,47,077 |
      | 6000000 |     15 |      5 |     40 |     10 |     10 |      1 | 13,76,492 |

  Scenario: User Getting loan details of bank partners
    Given User is on Home Page of Magic Bricks
    When User selects "Axis" Bank Partner
    And User provides details for a loan
    Then It should show the otp verification

  Scenario: User Calculating the EMI
    Given User is on Home Page of Magic Bricks
    When User clicks on the Home Loan EMI Calculator
    And User Provides the details
    Then It should go to  the otp verification page


  Scenario: User Getting Interest Rate of a particular Bank
    Given User is on Home Page of Magic Bricks
    When User clicks on "SBI" home loan interest rate
    Then The page should provide "SBI" bank Interest Details

      Scenario: User Giving wrong inputs in calculator
    Given User is on Home Page of Magic Bricks
    When User clicks on the Home Loan EMI CalculatorN
    And User Provides the details and rate of interest as "5"
    Then It should show the warning "Min interest starts from 8%"
    