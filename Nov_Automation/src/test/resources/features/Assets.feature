@current99
Feature: Assets function
Scenario: Varify creating a new Asset into the Sales Force
Given user opens a browser 
And User navigates to "https://login.salesforce.com/"
When user enters user name as "USER_ULFAT" and password as "PASSWORD_ULFAT" 
##parameters in double quote above 
And user click on LogIn
And user click on Assets tab
And user clicks on new Assetbutton
#//INPUT[@value=' New ']
And user enters "MoneyMarket001" as Asset Name
#xPathAssetName = //INPUT[@id='Name']
And user clicks on Assets Save button
#And user validates newly created Lead
Then user logs out of the current application 