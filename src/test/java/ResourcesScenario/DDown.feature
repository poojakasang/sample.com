Feature: to verify form dropdown functionality
Background:

@DropDown
Scenario: select by index
When user selects "chrome" browser
And launches "https://the-internet.herokuapp.com/"
Then verify "https://the-internet.herokuapp.com/" is present in url
Then click on "Dropdown" link
Then select value by "index" with "1"

@DropDown
Scenario: select by index
When user selects "chrome" browser
And launches "https://the-internet.herokuapp.com/"
Then verify "https://the-internet.herokuapp.com/" is present in url
Then click on "Dropdown" link
Then select value by "value" with "2"

@DropDown
Scenario: select by index
When user selects "chrome" browser
And launches "https://the-internet.herokuapp.com/"
Then verify "https://the-internet.herokuapp.com/" is present in url
Then click on "Dropdown" link
Then select value by "Text" with "Option 1"
