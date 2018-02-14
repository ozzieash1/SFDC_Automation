@current
Feature: Campaign function
Scenario: Varify creating a new Campaign into the Sales Force
Given user opens a browser 
And User navigates to "https://login.salesforce.com/"
When user enters user name as "USER_ULFAT" and password as "PASSWORD_ULFAT" 
##parameters in double quote above 
And user click on LogIn
And user click on Campaign tab
And user clicks on new button
And user enters "Conference" as Campaign name
And user clicks on Save button
#And user validates newly created Campaign
Then user logs out of the current application 