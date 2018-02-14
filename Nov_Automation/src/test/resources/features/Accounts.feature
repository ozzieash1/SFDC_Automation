@current1
Feature: Account function
Scenario: Varify create new account into the Sales Force
Given user opens a browser 
And User navigates to "https://login.salesforce.com/"
When user enters user name as "USER_ULFAT" and password as "PASSWORD_ULFAT" 
And user click on LogIn
And user click on Accounts tab
And user test JavaScript Calls
And user test Account Page text "Home"
And user clicks on new button
And user enters "Capital ONE" as Account name
And user selects option "Technology Partner" from type dropdown
And user selects option "Electronics" from industry dropdown
And user selects option "Warm" from rating dropdown
And user selects option "Public" from ownership dropdown
And user selects option "High" from customer priority dropdown
And user clicks on Save button
#And user validates newly created contact "Capital One"
Then user logs out of the current application

@current11
Scenario: Varify create new account into the Sales Force and Report generation inclusive Newly created Account
Given user opens a browser 
And User navigates to "https://login.salesforce.com/"
When user enters user name as "USER_ULFAT" and password as "PASSWORD_ULFAT" 
And user click on LogIn
And user click on Accounts tab
And user test JavaScript Calls
#And user test Account Page text "Home"
And user clicks on new button
And user enters "Wells Fargo" as Account name
And user selects option "Technology Partner" from type dropdown
And user clicks on Save button
And user click on Reports tab
And user sees Reports Page text "Reports & Dashboard"
#And user click on link Go to Reports
#And user click on My Personal Custom Reports
And user clicks on RReport
Then user views Report status complete
And user views Wells Fargo Account Name in Report
And user views Grand Total "30" records
Then user logs out of the current application

@current1
Scenario: Varify create new view
And user enters "View00001" for View Name
And user checks radio button My accounts
And user clicks on Save
And user views error message 
#Validation Errors While Saving Record(s)

@current1
Scenario: Varify create new view
And user enters "View001" for View Name
And user checks radio button My accounts
And user clicks on Save
And user views error message 
#Validation Errors While Saving Record(s)

