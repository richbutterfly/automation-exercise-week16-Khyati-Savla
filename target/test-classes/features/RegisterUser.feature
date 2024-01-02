Feature: Register Test
  As a user, I want to register on automation exercise page

  Background: User is on Homepage
    Given I am on HomePage
    When I click on Sign up Link
    Then I should see the message 'New User SignUp!" message



  @sanity
  Scenario: Verify that user Sign Up successfully
    When  I enter name "Khyati" in nameField
    And  I enter Email address "ksavla12@gmail.com" in email field
    And  I click on Sign up button
    Then I should see the message "ENTER ACCOUNT INFORMATION"


#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click on 'Signup / Login' button
#5. Verify 'New User Signup!' is visible
#6. Enter name and already registered email address
#7. Click 'Signup' button
#8. Verify error 'Email Address already exist!' is visible
  @smoke
  Scenario: Verify that email Id is already exist
    When  I enter name "Khyati" in nameField
    And I enter Email address "ksavla04@gmail.com" in email field
    And I click on Sign up button
    Then I should see the text "Email Address already exist!"


# 1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click on 'Signup / Login' button
#5. Verify 'New User Signup!' is visible
#6. Enter name and email address
#7. Click 'Signup' button
#8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
#9. Fill details: Title, Name, Email, Password, Date of birth
#10. Select checkbox 'Sign up for our newsletter!'
#11. Select checkbox 'Receive special offers from our partners!'
#12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
#13. Click 'Create Account button'
#14. Verify that 'ACCOUNT CREATED!' is visible
#15. Click 'Continue' button
#16. Verify that 'Logged in as username' is visible
#17. Click 'Delete Account' button
#18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

@regression
  Scenario: Verify that user can create account successfully
    When  I enter name "Khyati" in nameField
    And   I enter Email address "ksavla04@gmail.com" in email field
    And   I click on Sign up button
    Then  I should see the message "ENTER ACCOUNT INFORMATION"
    When  I select title for gender
    And   I enter password "ksavla04" in password field
    And   I enter day "1" of birth
    And   I enter Month "January" of birth
    And   I enter Year "1989"of birth
    And   I click on check box for newsletter
    And   I click on check box for receive special offers
    And   I enter first name "Khyati"
    And   I enter last name"Savla"
    And   I enter company name "ABC Software Solutions"
    And   I enter address "41 Satellite Road"
    And   I enter address2 "Near Keshavbag Party Plot"
    And   I select country "India" from dropDown
    And   I enter state "Gujarat" in state field
    And   I enter city "Ahmedabad" in city field
    And   I enter zipcode "400001" in zipcode field
    And   I enter Mobile number "07474745656"
    And   I click on create Account button
    Then  I can successfully create an account
    And   I click on continue button after creating an account
    Then  I can see text 'Logged in as Khyati'
    When  I click on Delete account
    Then  I can delete account successfully
    And   I click on continue button

# 1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click 'Signup / Login' button
#5. Fill all details in Signup and create account
#6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
#7. Verify ' Logged in as username' at top
#8. Add products to cart
#9. Click 'Cart' button
#10. Verify that cart page is displayed
#11. Click Proceed To Checkout
#12. Verify that the delivery address is same address filled at the time registration of account
#13. Verify that the billing address is same address filled at the time registration of account
#14. Click 'Delete Account' button
#15. Verify 'ACCOUNT DELETED!' and click 'Continue' button

  @regression
  Scenario: Verify that address details in check out page
    When  I enter name "Khyati" in nameField
    And   I enter Email address "ksavla04@gmail.com" in email field
    And   I click on Sign up button
    Then  I should see the message "ENTER ACCOUNT INFORMATION"
    When  I select title for gender
    And   I enter password "ksavla04" in password field
    And   I enter day "1" of birth
    And   I enter Month "January" of birth
    And   I enter Year "1989"of birth
    And   I click on check box for newsletter
    And   I click on check box for receive special offers
    And   I enter first name "Khyati"
    And   I enter last name"Savla"
    And   I enter company name "ABC Software Solutions"
    And   I enter address "41 Satellite Road"
    And   I enter address2 "Near Keshavbag Party Plot"
    And   I select country "India" from dropDown
    And   I enter state "Gujarat" in state field
    And   I enter city "Ahmedabad" in city field
    And   I enter zipcode "400001" in zipcode field
    And   I enter Mobile number "07474745656"
    And   I click on create Account button
    Then  I can successfully create an account
    And   I click on continue button after creating an account
    Then  I can see text 'Logged in as Khyati'
    When  I mouse hoover on first product and click on add to cart
    And   I click on Cart link on homePage
    Then  I should see first product "Blue Top" added in cart
    When  I click on proceed to check out
    Then  I should see delivery address is same as I filled in registration "41 Satellite Road"
    And   I should see billing address is same as I filled in registration "41 Satellite Road"
    And   I click on Delete account
    When  I can delete account successfully
    And   I click on continue button




