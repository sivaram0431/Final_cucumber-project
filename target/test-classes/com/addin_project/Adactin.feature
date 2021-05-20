Feature: Hotel Booking In Adactin Application

Scenario: Login Page
Given User Launch The Application
When User Enter The Username In Username Field
And User Enter The Password In Password Field
Then User click On the Login Button And It Navigates To Search Hotel Page


Scenario: Search hotel
When User Select The Location
And User Select The Hotel
And User Select The Room Type
And User Select The No Of Rooms
And User Enter The Checkin Date
And User Enter The Checkout Date
And User Select The Adults Per Room
And User Select The Children Per Room
Then User Click On The Search Button And It Navigates To Select Hotel Page


Scenario: Select Hotel
When Select Hotel With Radio Button
Then Click The continue Button It Navigates To Book a hotel Page

Scenario: Book a Hotel
When User Enter The First Name
And User Enter The Last Name
And User Enter The Billing Address
And User Enter The Credit Card No
And User Se;ect The credit card Type
And User Select The Credit Card expiry Month
And User Select The Credit Card expiry Year
And Use Enter The CVV NO
Then User Click On The BookNow Button And It Navigates To Booking Confirmation page

Scenario: Booking Congirmation Page
When User click The my Iternity  It Navigates to the My Iternity Page

Scenario: My Iternity Page
When User Click The MY logout button it Navigates to Login Page 