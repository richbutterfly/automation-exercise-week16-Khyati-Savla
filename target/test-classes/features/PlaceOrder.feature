Feature:  Verify payment page
  As a user, I want to place an order and check payment options

  Background: I am on HomPage


#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Add products to cart
#5. Click 'Cart' button
#6. Verify that cart page is displayed
#7. Click Proceed To Checkout
#8. Click 'Register / Login' button
#9. Fill all details in Signup and create account
#10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
#11. Verify ' Logged in as username' at top
#12.Click 'Cart' button
#13. Click 'Proceed To Checkout' button
#14. Verify Address Details and Review Your Order
#15. Enter description in comment text area and click 'Place Order'
#16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
#17. Click 'Pay and Confirm Order' button
#18. Verify success message 'Your order has been placed successfully!'
#19. Click 'Delete Account' button
#20. Verify 'ACCOUNT DELETED!' and click 'Continue' button

@sanity
  Scenario: User should place order and register while check out
    When  I mouse hoover on first product and click on add to cart
    And   I click on view cart button
    Then  I should see product name "Blue Top" in shopping cart
    And   I click on proceed to check out
    And   I click on Register or Login link
    And   I enter name "Khyati" in nameField
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
    When  I click on Cart link on homePage
    And   I click on proceed to check out
    Then  I should see delivery address is same as I filled in registration "41 Satellite Road"
    When  I enter "Handle it carefully" in description box
    And   I click on place order button
    And   I enter name on card "Khyati"
    And   I enter card number "411111111111"
    And   I enter CVC number "345"
    And   I enter Expiry Month "12"
    And   I enter Expiry Year "2030"
    And   I click on Pay and Confirm order
    Then  I can see message "Congratulations! Your order has been confirmed!"
    When  I click on Delete account
    Then  I can delete account successfully
    And   I click on continue button

# 4. Click 'Signup / Login' button
#5. Fill all details in Signup and create account
#6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
#7. Verify ' Logged in as username' at top
#8. Add products to cart
#9. Click 'Cart' button
#10. Verify that cart page is displayed
#11. Click Proceed To Checkout
#12. Verify Address Details and Review Your Order
#13. Enter description in comment text area and click 'Place Order'
#14. Enter payment details: Name on Card, Card Number, CVC, Expiration date
#15. Click 'Pay and Confirm Order' button
#16. Verify success message 'Your order has been placed successfully!'
#17. Click 'Delete Account' button
#18. Verify 'ACCOUNT DELETED!' and click 'Continue' button

@smoke
  Scenario: User should place order and register before check out
    When  I click on Sign up Link
    And   I enter name "Khyati" in nameField
    And   I enter Email address "ksavla04@gmail.com" in email field
    And   I click on Sign up button
    Then  I should see the message "ENTER ACCOUNT INFORMATION"
    And   I select title for gender
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
    Then  I should see product name "Blue Top" in shopping cart
    And   I click on proceed to check out
    Then  I should see delivery address is same as I filled in registration "41 Satellite Road"
    When  I enter "Handle it carefully" in description box
    And   I click on place order button
    And   I enter name on card "Khyati"
    And   I enter card number "411111111111"
    And   I enter CVC number "345"
    And   I enter Expiry Month "12"
    And   I enter Expiry Year "2030"
    And   I click on Pay and Confirm order
    Then I can see message "Congratulations! Your order has been confirmed!"
    When  I click on Delete account
    Then  I can delete account successfully
    And   I click on continue button

#4. Click 'Signup / Login' button
#5. Fill email, password and click 'Login' button
#6. Verify 'Logged in as username' at top
#7. Add products to cart
#8. Click 'Cart' button
#9. Verify that cart page is displayed
#10. Click Proceed To Checkout
#11. Verify Address Details and Review Your Order
#12. Enter description in comment text area and click 'Place Order'
#13. Enter payment details: Name on Card, Card Number, CVC, Expiration date
#14. Click 'Pay and Confirm Order' button
#15. Verify success message 'Your order has been placed successfully!'
#16. Click 'Delete Account' button
#17. Verify 'ACCOUNT DELETED!' and click 'Continue' button

  @regression
  Scenario:  User should place order and login before check out
    When I click on Sign up Link
    And  I enter email address "ksavla07@gmail.com"
    And  I enter password "ksavla04"
    And  I click on Login button
    Then I should log in successfully on the page and see message "Logged in as Khyati"
    When  I mouse hoover on first product and click on add to cart
    And   I click on Cart link on homePage
    Then  I should see product name "Blue Top" in shopping cart
    And   I click on proceed to check out
    Then  I should see delivery address is same as I filled in registration "41 Satellite Road"
    When  I enter "Handle it carefully" in description box
    And   I click on place order button
    And   I enter name on card "Khyati"
    And   I enter card number "411111111111"
    And   I enter CVC number "345"
    And   I enter Expiry Month "12"
    And   I enter Expiry Year "2030"
    And   I click on Pay and Confirm order
    Then I can see message "Congratulations! Your order has been confirmed!"
    When  I click on Delete account
    Then  I can delete account successfully
    And   I click on continue button

#4. Add products to cart
#5. Click 'Cart' button
#6. Verify that cart page is displayed
#7. Click Proceed To Checkout
#8. Click 'Register / Login' button
#9. Fill all details in Signup and create account
#10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
#11. Verify ' Logged in as username' at top
#12.Click 'Cart' button
#13. Click 'Proceed To Checkout' button
#14. Verify Address Details and Review Your Order
#15. Enter description in comment text area and click 'Place Order'
#16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
#17. Click 'Pay and Confirm Order' button
#18. Verify success message 'Your order has been placed successfully!'
#19. Click 'Download Invoice' button and verify invoice is downloaded successfully.
#20. Click 'Continue' button
#21. Click 'Delete Account' button
#22. Verify 'ACCOUNT DELETED!' and click 'Continue' button

  @regression
  Scenario:  User should Download Invoice after purchase order
    When  I mouse hoover on first product and click on add to cart
    And   I click on view cart button
    Then  I should see product name "Blue Top" in shopping cart
    And   I click on proceed to check out
    And   I click on Register or Login link
    And   I enter name "Khyati" in nameField
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
    When  I click on Cart link on homePage
    And   I click on proceed to check out
    Then  I should see delivery address is same as I filled in registration "41 Satellite Road"
    When  I enter "Handle it carefully" in description box
    And   I click on place order button
    And   I enter name on card "Khyati"
    And   I enter card number "411111111111"
    And   I enter CVC number "345"
    And   I enter Expiry Month "12"
    And   I enter Expiry Year "2030"
    And   I click on Pay and Confirm order
    Then  I can see message "Congratulations! Your order has been confirmed!"
    When  I click on Download Invoice Button
    Then  I can see Invoice downloaded successfully in download folder
    When  I click on Delete account
    Then  I can delete account successfully
    And   I click on continue button


