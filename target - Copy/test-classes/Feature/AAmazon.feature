 @Regression
Feature: This feature is to test amazon order 

@smoke
Scenario: This scenario is to place iphone 17 purchase with valid Credit Card
   Given Launch browser and load amazon url
   And Login to account and search for iphone model
   When Select the phone and add to cart
   And Provide valid CC details and address then submit order
   Then validate if order is successful and order id is generated
   And Logout from amazon application
   
   
   Scenario: This scenario is to order router
   
   Given Login to the application 
   When Select the router and add to cart 
   Then Validate the order detail and shipping detail
   
   