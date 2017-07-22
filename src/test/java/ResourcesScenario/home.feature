#Author: your.email@your.domain.com


#Sample Feature Definition Template

Feature: To verify home page links are working
@tag2
Scenario Outline: Title of your scenario outline
Then click on <linkname> link
Then verify <url> is present in url
Examples:
    | linkname  |url|
    | "A/B Testing"   |"abtest" |
    | "Broken Images" | "broken_images"   |
    | "Context Menu"| "context_menu"  |
		| "Drag and Drop" | "drag_and_drop"   |
		| "File Download"   | "download" |		

@alllinks
Scenario: get all links present on home page and verify link text
When user selects "chrome" browser
And launches "https://the-internet.herokuapp.com/"
Then verify "https://the-internet.herokuapp.com/" is present in url
Then get all links present on home page 
