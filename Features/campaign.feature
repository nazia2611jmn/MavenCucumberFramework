Feature: create Campaign Scenario
Scenario: create Campaign
Given Launch the Browser
Then Browser should display
When enter URL
Then Login page should display
When Enter Username and password
And Click on login button
Then Home Page should display
When Navigate to more link
And Click on Campaign
When Click on create Campaign plus button
Then Enter Campaign Name
And Click on save
Then new campaign name should display in campaign list of campaign page
