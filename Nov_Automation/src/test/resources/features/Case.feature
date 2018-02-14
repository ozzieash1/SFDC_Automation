@current
Feature: Case function
Scenario: Varify creating a new Case into the Sales Force
Given user opens a browser 
And User navigates to "https://login.salesforce.com/"
When user enters user name as "USER_ULFAT" and password as "PASSWORD_ULFAT" 
##parameters in double quote above 
And user click on LogIn
And user click on Cases tab
And user clicks on cases new button
And user clicks on Status 
And user clicks on Origin 
#And user selects "Working " from Status 
#And user selects "Phone" from Case Origin 
And user clicks on Save button
#And user clicks on Save button
#And user validates newly created Case
Then user logs out of the current application 