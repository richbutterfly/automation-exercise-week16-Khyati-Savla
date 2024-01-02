Feature: Verify Test Cases Page
  As a user, I want to navigate to Test Cases page successfully

# 1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click on 'Test Cases' button
#5. Verify user is navigated to test cases page successfully
@sanity
  Scenario: Verify Test Cases Page
    Given I am on HomePage
    When  I click on 'Test Cases' Link
    Then I should navigate to Test Cases Page successfully
