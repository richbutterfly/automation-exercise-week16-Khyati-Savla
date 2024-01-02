Feature: Category And Brands functionality
  As a user, I want to check Category and Brands options working properly

  Background: I am on HomePage


# 1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that categories are visible on left side bar
#4. Click on 'Women' category
#5. Click on any category link under 'Women' category, for example: Dress
#6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
#7. On left side bar, click on any sub-category link of 'Men' category
#8. Verify that user is navigated to that category page

    @sanity
    Scenario: User should verify category products
      When  I mouse hoover on category and click on "WOMEN"
      And   I click on sub category "DRESS"
      Then  I should navigate to that category page and see text "WOMEN - DRESS PRODUCTS"
      When  I mouse hoover on another category and click on "MEN"
      And   I click on another sub category "JEANS"
      Then  I should navigate to that category page and see "MEN - JEANS PRODUCTS"


#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Click on 'Products' button
#4. Verify that Brands are visible on left side bar
#5. Click on any brand name
#6. Verify that user is navigated to brand page and brand products are displayed
#7. On left side bar, click on any other brand link
#8. Verify that user is navigated to that brand page and can see products

@smoke
  Scenario: User should verify Cart Brand products
    When  I mouse hoover on Brand and click on "POLO"
    Then  I should navigate to that Brand page and see text "BRAND - POLO PRODUCTS"
    When  I mouse hoover on another Brand and  again click on "BIBA"
    Then  I should navigate to that Brand page and see text "BRAND - BIBA PRODUCTS"

