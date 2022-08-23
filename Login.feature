Feature: Login to the leaptaps Application

Background: 
Given Launch the Chrome Browser
And Load the URL and Maximize

Scenario: Postive scenario to login
Given Enter the username as 'DemoSalesmanager'
And Enter the password as 'crmsfsa'
When click on the login button
Then Verify the home page is displayed

Scenario: negative scenario to login
Given Enter the username as 'DemoSales'
And Enter the password as 'crms'
When click on the login button
But Verify the error message page is displayed

