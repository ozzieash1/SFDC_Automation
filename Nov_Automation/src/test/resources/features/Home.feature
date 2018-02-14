@current111 @regression @automation
Feature: Home Tabs
Scenario: Varify Home page tabs configured are being displayed in the Salesforce
Given user opens a browser 
And User navigates to "https://login.salesforce.com/"
When user enters user name as "USER_ULFAT" and password as "PASSWORD_ULFAT" 
##parameters in double quote above 
And user click on LogIn
And user sees the below objects
|Home|
|SFDCTesting|
|Reports|
|Dashboards|
|Accounts|
|Cases|
|Campaigns|
|Contacts|
|Assets|
|Opportunities|
|Products|
|Groups|
|Solutions|
|Leads|
|Chatter|
#|Forecasts|
#|Orders|
Then user logs out of the current application
