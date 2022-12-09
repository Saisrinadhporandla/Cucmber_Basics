Feature: App LogIn

Background:
Given url of the page
When Browser is Trigerred
Then Browser is opend

@SmokeTest
Scenario: Home Page Remo
Given user on amazon landing page
When user entered mobile number"9704219395" and password "Srin@dh2448"
And click on sign up
Then user able to see amazon home page

@SmokeTest @RegTest
Scenario: Home Page Demo
Given user on amazon landing page
When user entered below Details
| sai | srinadh | porandla | 9704219395 | saisrinadh@gmail.com |
Then user able to see amazon home page

@RegTest
Scenario Outline: Home Page Memo
Given user on amazon landing page
When user entered mobile number<username> and <password> in
And click on sign up
Then user able to see amazon home page

Examples:
| username | password |
| user1    | pass1    |
| user2    | pass2    |
| user3    | pass3    |

