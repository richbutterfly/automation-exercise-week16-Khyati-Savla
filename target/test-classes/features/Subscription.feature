Feature: Subscription option and scroll up and down functionality on HomePage
  As a user, I want to subscribe on automation exercise website

#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Scroll down to footer
#5. Verify text 'SUBSCRIPTION'
#6. Enter email address in input and click arrow button
#7. Verify success message 'You have been successfully subscribed!' is visible

  @sanity
  Scenario: User should Subscribe in the HomePage
    Given I am on HomePage
    When   I scroll down to footer on Homepage
    Then  I can see text 'SUBSCRIPTION' in capital letters
    When  I enter Email Id "ksavla04@gmail.com" to subscribe
    And   I click on right arrow to subscribe
    Then  I should see success message 'You have been successfully subscribed!' is visible


#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click 'Cart' button
#5. Scroll down to footer
#6. Verify text 'SUBSCRIPTION'
#7. Enter email address in input and click arrow button
#8. Verify success message 'You have been successfully subscribed!' is visible

  @smoke
  Scenario: User should Subscribe in the Cart menu
    When  I click on Cart link on homePage
    And  I scroll down to footer on Homepage
    Then  I can see text 'SUBSCRIPTION' in capital letters
    When  I enter Email Id "ksavla04@gmail.com" to subscribe
    And   I click on right arrow to subscribe
    Then  I should see success message 'You have been successfully subscribed!' is visible

#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Scroll down page to bottom
#5. Verify 'SUBSCRIPTION' is visible
#6. Click on arrow at bottom right side to move upward
#7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

    @regression
    Scenario: User should scroll up using 'Arrow' button and Scroll down successfully
      When   I scroll down to footer on Homepage
      Then   I can see text 'SUBSCRIPTION' in capital letters
      When   I click on bottom right side button to move upward
      Then  I can see page is scrolled up and "Full-Fledged practice website for Automation Engineers" text is visible on screen

# 1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Scroll down page to bottom
#5. Verify 'SUBSCRIPTION' is visible
#6. Scroll up page to top
#7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

  @regression
    Scenario: User should scroll up without using 'Arrow' button and Scroll down successfully
      When   I scroll down to footer on Homepage
      Then   I can see text 'SUBSCRIPTION' in capital letters
      When   I scroll up to top of the page
      Then  I can see page is scrolled up and "Full-Fledged practice website for Automation Engineers" text is visible on screen