Feature: Add Product to cart
  As a user, I want to add products in cart

  Background: I am on HomePage

#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click 'Products' button
#5. Hover over first product and click 'Add to cart'
#6. Click 'Continue Shopping' button
#7. Hover over second product and click 'Add to cart'
#8. Click 'View Cart' button
#9. Verify both products are added to Cart
#10. Verify their prices, quantity and total price
@sanity
  Scenario: User should add products in cart successfully
    When  I click on Products link
    And   I mouse hoover on first product and click on add to cart
    And   I click on continue shopping button
    And   I mouse hoover on second product and click on add to cart
    And   I click on view cart link
    Then  I should see first product "Blue Top" added in cart
    And   I should see second product "Men Tshirt" added in cart
    And   I should verify price "Rs. 500" for first product
    And   I should verify price "Rs. 400" for second product
    And   I should verify their quantity "1"
    And   I should verify their total price "Rs. 500" for first product
    And   I should verify their total price "Rs. 400" for second product

#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click 'View Product' for any product on home page
#5. Verify product detail is opened
#6. Increase quantity to 4
#7. Click 'Add to cart' button
#8. Click 'View Cart' button
#9. Verify that product is displayed in cart page with exact quantity

  @smoke
  Scenario: User should change quantity in cart successfully
    When I click on view product on first product
    And  I should see product name "Blue Top"
    And  I should increase quantity to 4
    And  I click on add to cart button
    And  I click on view cart button
    Then I should see the exact quantity is displayed in cart

#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Add products to cart
#5. Click 'Cart' button
#6. Verify that cart page is displayed
#7. Click 'X' button corresponding to particular product
#8. Verify that product is removed from the cart

  @regression
  Scenario: User should remove Products from cart successfully
    When  I click on Products link
    And   I mouse hoover on first product and click on add to cart
    And   I click on view cart link
    Then  I should see first product "Blue Top" added in cart
    When  I click on cross button corresponding to the product
    Then  I should see the cart is empty with text "Cart is empty!"


#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Click on 'Products' button
#4. Verify user is navigated to ALL PRODUCTS page successfully
#5. Click on 'View Product' button
#6. Verify 'Write Your Review' is visible
#7. Enter name, email and review
#8. Click 'Submit' button
#9. Verify success message 'Thank you for your review.'

  @regression
  Scenario: User should review Product successfully
    When  I click on Products link on Homepage
    Then  I should navigate on 'ALL PRODUCTS' page successfully
    When  I click on view product on first product
    Then  I can see 'WRITE YOUR REVIEW' is visible
    And   I enter name  "Khyati" in name field
    And   I enter email  "ksavla04@gmail.com" in email field
    And   I enter review  "Good Product " in review field
    And   I click on submit button
    Then  I can see success message "Thank you for your review."

#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Scroll to bottom of page
#4. Verify 'RECOMMENDED ITEMS' are visible
#5. Click on 'Add To Cart' on Recommended product
#6. Click on 'View Cart' button
#7. Verify that product is displayed in cart page

  @regression
  Scenario: User should add Product from recommended items successfully
    When  I scroll down to footer on Homepage
    Then  I can see "RECOMMENDED ITEMS"
    When  I click on Add to cart on Recommended products
    And   I click on view cart button
    Then  I should see that product "Winter Top" is displayed in cart