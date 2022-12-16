Feature: amazon searching fun



Scenario: Home Page Demo
Given user on amazon landing page
When user entered mobile number and password
| 9704219395 | Srin@dh2448 |
And user searched the following item in search bar
| one plus 10 pro|
Then user able to see products retated to one plus 10 pro
