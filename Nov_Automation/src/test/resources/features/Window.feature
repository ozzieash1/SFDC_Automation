Feature: Window function
@regression
Scenario: Identifying and handling a pop-up window by its title in the Salesforce
Given user opens a browser 
And User navigates to "https://login.salesforce.com/"
When user enters user name as "USER_ULFAT" and password as "PASSWORD_ULFAT" 
And user click on LogIn
And user takes Screenshot of page navigated 
And user tests Help pop-up window by title 
And user validates Home Page JavaScript Code 
Then user logs out of the current application

@current111
Scenario: Identifying and handling a pop-up window by its title in the Salesforce
Given user opens a browser 
And User navigates to "https://login.salesforce.com/"
When user enters user name as "USER_ULFAT" and password as "PASSWORD_ULFAT" 
And user click on LogIn
And user tests pop-up window by title 
Then user logs out of the current application