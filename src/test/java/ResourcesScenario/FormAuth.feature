Feature: to verify form authentication verification
Background:
When user selects "chrome" browser
And launches "https://the-internet.herokuapp.com/"
Then verify "https://the-internet.herokuapp.com/" is present in url
@FA
Scenario: Verify with correct credentials
Then click on "Form Authentication" link
Then verify "login" is present in url
Then enter username as "tomsmith"
Then enter password as "SuperSecretPassword!"
And click on Login button
Then verify "secure" is present in url
Then click on logout button
Then verify "login" is present in url

@FAfail
Scenario:
Then click on "Form Authentication" link
Then verify "login" is present in url
Then enter username as "tomsmith122"
Then enter password as "SuperSecretPassword!"
Then verify "login" is present in url
Then verify "Your username is Invalid" is present in url

@Windows
Scenario:
Then click on "Multiple Windows" link
Then verify "windows" is present in url
And Click on "Click Here" link
Then switch to another window
Then verify"windows/new" is present in url
Then switch to another window
Then verify "windows" is present in url