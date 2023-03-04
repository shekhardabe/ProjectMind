Feature: Gmail Functionality

Background: Application Open successfuly

Given user open browser with "webdriver.chrome.driver" and "C:\\Automation support\\chromedriver.exe"
Given user enter url as "https://mail.google.com/"

Scenario: Check all functions working properly
When user enter username 
Then user click on next button
Then user Enter password
Then user click on next button after password
Then user click on compose button
Then user enter id of sender
Then user enter subject as Test mail
Then user write mail as Test mail body
Then user click on more option 
Then user select Lable option
Then user select Social option
Then user click on send button
Then user verify the mail by clicking on Social option
Then user mark Mail as star
Then user open the mail successfully
Then Application shows mail send successfully



