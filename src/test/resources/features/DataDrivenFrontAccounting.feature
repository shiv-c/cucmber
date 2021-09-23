Feature: login Functionality

Scenario Outline: To do Data driven testing on Login Functionality
  Given User is on Login Page 
  When User enters username and password as "<userName>" &"<passWord>" & clicks on login
  Then login "<loginType>" be happen
  
  
 Examples:
 |userName|passWord|loginType|
 |demouser|password|should   |
 |  admin |admin123|shouldNot|
 |hr      |hr123   |shouldNot|
 |demo    |demo123 |shouldNot|