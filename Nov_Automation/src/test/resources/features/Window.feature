Feature: Window function
@current01
Scenario: Identifying and handling a pop-up window by its title in the Salesforce
Given user opens a browser 
And User navigates to "https://login.salesforce.com/"
When user enters user name as "USER_ULFAT" and password as "PASSWORD_ULFAT" 
And user click on LogIn
And user takes Screenshot of page navigated 
And user tests Help pop-up window by title 
And user validates Home Page JavaScript Code 
Then user logs out of the current application

@current1111
Scenario: Identifying and handling a pop-up window by its title in the Salesforce
Given user opens a browser 
And User navigates to "https://login.salesforce.com/"
When user enters user name as "USER_ULFAT" and password as "PASSWORD_ULFAT" 
And user click on LogIn
And user clicks on Search button 
#//INPUT[@id='phSearchInput']
Then user logs out of the current application