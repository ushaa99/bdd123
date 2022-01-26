Feature:Test the Automation Demo application
Scenario Outline:Test the login page with valid details
Given Open chrome browser and url of the application
When Enter "<Username>" , "<password>" and click on login button
Then Success in login
When search the product and click on the search button
And scroll the products and select one among them
Then add the product to cart.
Then take screenshot

Examples:
|Username      |password   |
|ushapinnoju9@gmail.com         |USHA123    |

