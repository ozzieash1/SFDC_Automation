@current11 @regression @automation
Feature: Search function
Scenario: Varify Search function in the Salesforce
Given user opens a browser 
And User navigates to "https://login.salesforce.com/"
When user enters user name as "USER_ULFAT" and password as "PASSWORD_ULFAT" 
##parameters in double quote above 
And user click on LogIn
And user views Search
And user enters "Capital One"
And user clicks on Search button
 #//INPUT[@id='phSearchButton']
 And user views popup in a new window
Then user logs out of the current application

@current2
Scenario: Varify Searching function for an item not present in the Salesforce
Given user opens a browser 
And User navigates to "https://login.salesforce.com/"
When user enters user name as "USER_ULFAT" and password as "PASSWORD_ULFAT" 
And user click on LogIn
And user clicks on search "inputButton" and enters "capitalone"
And user clicks on search "btn"
 And user sees visible text "capitalone" in input box
 #xPath = //INPUT[@id='secondSearchText']
 And user views "Search Results"
 #user is in the window called  window.sfdcPage = new SfdcApp.Search.Page();
#//H1[@class='noSecondHeader pageType'][text()='Search Results']
#//*[@id="bodyTable"]/tbody/tr/td/div[1]/div[1]/div[1]/h1
And user views message_warning box text "No matches found"
#//DIV[@class='messageText'][text()='No matches found']
And user views message popup box text "Search Tips"
#//DIV[@class='searchResultsTipsHeader'][text()='Search Tips']
And user views javascript link text "Search Tips"
And user clicks on "Search All"
# xPath = //A[@id='searchAllSummaryView']
#it is a js <a href = "javascript:void(o);" class="btn" id="searchAllSummaryView" title="Search All"
#Now user sees Search all being populated in search button <input type ="submit" id = "secondSearchButton" class= "btn" value = "Search All"> == $0
And user clicks on js link "Options"
#XPath = //A[@id='searchMoreOptionsLink']
And user selects_clicks option "Limit to items I own"
#XPath = //INPUT[@id='moreOptionsLimitToItemsIOwn']
And user clicks on checkbox "Save & Search"
#xPath = //INPUT[@id='moreOptionsSearchBtn']
And user views text "Options: Limit to items I own" 
#xPath = //SPAN[@id='searchMoreOptionsText']
And user clicks on link "Help for this Page"
#xPath = //A[@id='guidedTourLink']/..//SPAN[@class='helpLink'][text()='Help for this Page']
And user views "Help" at new window and navigates back to parent window
#window.Sfdc = window.Sfdc || {}
#xPath (//SPAN[@class='tdx-truncate'][text()='Help'][text()='Help'])[2]
Then user logs out of the current application
