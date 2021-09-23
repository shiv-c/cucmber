Feature: Addition
			Scenario: Addition of two numbers
					Given I have two numbers as "89" &"112"
					When I do Addition
					Then Result should display in console
			
			
			Scenario: Addition of two number with List
					Given I have two numbers as below List
					     | 7 |
					     | 9 |
					When I do Addition 
					Then Result should display in console
					
			Scenario: Addition of two numbers with Map
					Given I have two numbers as below Map
					| num1 | 8 |
					| num2 | 9 | 
					When I do Addition 
					Then Result should display in console 
