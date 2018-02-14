@current
Feature: Opportunities function
Scenario: Varify creating a new Opportunities into the Sales Force
Given user opens a browser 
And User navigates to "https://login.salesforce.com/"
When user enters user name as "USER_ULFAT" and password as "PASSWORD_ULFAT" 
##parameters in double quote above 
And user click on LogIn
And user click on Opportunities tab
And user clicks on new Opportunitiesbutton
And user enters "Texas Auto" as Opportunity Name
And user clicks on Opportunities Save button
Then user logs out of the current application
 