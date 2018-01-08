@currentt @runme4 
Feature: Products function
Scenario: Varify creating a new Products into the Sales Force
Given user opens a browser 
And User navigates to "https://login.salesforce.com/"
When user enters user name as "USER_ULFAT" and password as "PASSWORD_ULFAT" 
##parameters in double quote above 
And user click on LogIn
And user click on Products tab
And user clicks on new Productbutton
And user enters "Prod0001" as Product Name
And user clicks on Products Save button
Then user logs out of the current application
 