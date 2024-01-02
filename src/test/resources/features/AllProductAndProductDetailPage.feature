Feature: All Products and Product detail page
  As a user, I want to verify All Products and Product detail page

#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click on 'Products' button
#5. Verify user is navigated to ALL PRODUCTS page successfully
#6. The products list is visible
#7. Click on 'View Product' of first product
#8. User is landed to product detail page
#9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
@sanity
  Scenario: User should verify All Products and Product detail page
    Given I am on HomePage
    When  I click on Products link on Homepage
    Then  I should navigate on 'ALL PRODUCTS' page successfully
    And   I click on View Product of first product "Blue Top"
    And   I should navigate on product detail page and verify URL
    And   I should see product name "Blue Top"
    And   I should see category "Category: Women > Tops"
    And   I should see price "Rs. 500"
    And   I should see availability "Availability: In Stock"
    And   I should see condition "Condition: New"
    And   I should see brand "Brand: Polo"

#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click on 'Products' button
#5. Verify user is navigated to ALL PRODUCTS page successfully
#6. Enter product name in search input and click search button
#7. Verify 'SEARCHED PRODUCTS' is visible
#8. Verify all the products related to search are visible

  @smoke
    Scenario: User should search Product successfully
      Given I am on HomePage
      When  I click on Products link on Homepage
      Then  I should navigate on 'ALL PRODUCTS' page successfully
      When  I enter product name "Blue Top" in search input
      And   I click on search button
      Then  I should see text "SEARCHED PRODUCTS"
      And   I can see that Product "Blue Top" after search


# 1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Click on 'Products' button
#4. Verify user is navigated to ALL PRODUCTS page successfully
#5. Enter product name in search input and click search button
#6. Verify 'SEARCHED PRODUCTS' is visible
#7. Verify all the products related to search are visible
#8. Add those products to cart
#9. Click 'Cart' button and verify that products are visible in cart
#10. Click 'Signup / Login' button and submit login details
#11. Again, go to Cart page
#12. Verify that those products are visible in cart after login as well

  @regression
  Scenario: User should search Product and verify cart after login successfully
    Given I am on HomePage
    When  I click on Products link on Homepage
    Then  I should navigate on 'ALL PRODUCTS' page successfully
    When  I enter product name "Blue Top" in search input
    And   I click on search button
    Then  I should see text "SEARCHED PRODUCTS"
    And   I can see that Product "Blue Top" after search
    When  I click on add to cart button after searching product
    And   I click on view cart button
    Then  I should see product name "Blue Top" in shopping cart
    When  I click on Sign up button
    And   I enter email address "ksavla04@gmail.com"
    And   I enter password "ksavla04"
    And   I click on Login button
    And   I click on Cart link on homePage
    Then  I should see the product "Blue Top" visible in cart after Login






