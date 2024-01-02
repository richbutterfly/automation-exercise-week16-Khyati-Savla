Feature: Login Test
  As a user, I want to login in Automation exercise website

  Background: User is on Homepage
    Given I am on HomePage
    When I click on Sign up Link

# 1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click on 'Signup / Login' button
#5. Verify 'Login to your account' is visible
#6. Enter correct email address and password
#7. Click 'login' button
#8. Verify that 'Logged in as username' is visible
#9. Click 'Delete Account' button
#10. Verify that 'ACCOUNT DELETED!' is visible

@sanity
  Scenario: User should login with valid credentials
    When I see the text 'Login to your account'
    And  I enter email address "ksavla011@gmail.com"
    And  I enter password "ksavla04"
    And  I click on Login button
    Then I should log in successfully on the page and see message "Logged in as Khyati"
    When I click on Delete account
    Then I can delete account successfully
    And  I click on continue button

# 1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click on 'Signup / Login' button
#5. Verify 'Login to your account' is visible
#6. Enter incorrect email address and password
#7. Click 'login' button
#8. Verify error 'Your email or password is incorrect!' is visible

@smoke
  Scenario: User should login with Invalid credentials
    When I see the text 'Login to your account'
    And I enter email address "khyatisavla@gmail.com"
    And I enter password "ksavla01"
    And I click on Login button
    Then I should see message "Your email or password is incorrect!"

#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click on 'Signup / Login' button
#5. Verify 'Login to your account' is visible
#6. Enter correct email address and password
#7. Click 'login' button
#8. Verify that 'Logged in as username' is visible
#9. Click 'Logout' button
#10. Verify that user is navigated to login page

  @regression
  Scenario: I should Log out successfully
    When I see the text 'Login to your account'
    And I enter email address "ksavla07@gmail.com"
    And I enter password "ksavla04"
    And I click on Login button
    Then I should log in successfully on the page and see message "Logged in as Khyati"
    When I click on Log out button
    Then I see the text 'Login to your account'
