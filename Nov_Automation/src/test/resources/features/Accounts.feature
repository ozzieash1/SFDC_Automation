Feature: Account function
@current9
Scenario: Varify create new account into the Sales Force
Given user opens a browser 
And User navigates to "https://login.salesforce.com/"
When user enters user name as "USER_ULFAT" and password as "PASSWORD_ULFAT" 
And user click on LogIn
And user click on Accounts tab
And user tests ElementStyleCSS
And user gets links displayed in Page
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

@current
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
And user sees Reports Page text "Reports & Dashboards"
#And user click on link Go to Reports
#And user click on My Personal Custom Reports
And user clicks on RReport
Then user views Report status complete
And user views "Wells Fargo Account Name" in Report
And user views Grand Total "51" records
Then user logs out of the current application

@current
Scenario: Varify create new view
And user click on Accounts tab
And user clicks on Create New View
And user clicks on ViewName
And user enters "View99" for View Name
#And user checks radio button My accounts
And user clicks on Save
#And user selects newly created view from dropdown
#//SELECT[@id='00B410000096B9C_listSelect']
Then user logs out of the current application

@current
Scenario: verify delete account
And user click on Accounts tab
And user gets links displayed in Page
#How do I pick up an account from Recent Accounts


