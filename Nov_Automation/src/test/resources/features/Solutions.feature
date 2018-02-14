@current
Feature: Solutions function 
Scenario: Varify creating a new Solutions into the Sales Force 
	Given user opens a browser 
	And User navigates to "https://login.salesforce.com/" 
	When user enters user name as "USER_ULFAT" and password as "PASSWORD_ULFAT" 
	##parameters in double quote above 
	And user click on LogIn 
	And user click on Solutions tab 
	And user clicks on new Solutionsbutton 
	And user enters "Solu001" as Solutions Title 
	And user clicks on Solutions Save button 
	Then user logs out of the current application 
 