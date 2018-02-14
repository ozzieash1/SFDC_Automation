@current11 @regression @automation
Feature: Search function
Scenario: Varify Search function in the Salesforce
Given user opens a browser 
And User navigates to "https://login.salesforce.com/"
When user enters user name as "USER_ULFAT" and password as "PASSWORD_ULFAT" 
##parameters in double quote above 
And user click on LogIn
And user views input box Search
#id="phSearchButton"

And user sees the below objects
|Search|
And user clicks on search input box
#//INPUT[@id='phSearchInput']
And user enters "Capital One"
And user clicks on Search button
 #//INPUT[@id='phSearchButton']
 And user views popup in a new window

Then user logs out of the current application
