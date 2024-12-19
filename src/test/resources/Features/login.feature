Feature: Magic Bricks Login
 
Scenario: User login on the MagicBricks
Given The User is on the HomePage of Magic Bricks
When The User clicks on the LOGIN button
And The User Provides the details to login as follows
|MobileNumber|
|9618871371  |
Then the user should be logged in so that they could see some functionality