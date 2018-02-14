@current
Feature: Groups function
Scenario: Varify creating a new group into the Sales Force
Given user opens a browser 
And User navigates to "https://login.salesforce.com/"
When user enters user name as "USER_ULFAT" and password as "PASSWORD_ULFAT" 
##parameters in double quote above 
And user click on LogIn
And user click on Groups tab
And user clicks on group button
And user enters "QA03" as Group name
And user clicks on Save button
#And user validates newly created Lead
Then user logs out of the current application 