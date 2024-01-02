Feature: Contact Us Form Test
  As a user, I want to check Contact Us Form

# 1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click on 'Contact Us' button
#5. Verify 'GET IN TOUCH' is visible
#6. Enter name, email, subject and message
#7. Upload file
#8. Click 'Submit' button
#9. Click OK button
#10. Verify success message 'Success! Your details have been submitted successfully.' is visible
#11. Click 'Home' button and verify that landed to home page successfully
@sanity
  Scenario: Check Contact Us Form
    When I click on 'Contact Us' link
    Then I should navigate to 'GET IN TOUCH' page
    When I enter "Khyati" in name field
    And I enter "ksavla04@gmail.com" in email field
    And I enter subject "Automation exercise"
    And I enter Message "Contact us for best exercise for automation testing"
    And I click on Choose File Button
    And I click on Submit button
    And I click on ok button popup
    Then I should see Message "Success! Your details have been submitted successfully."
    And I click on Home Button

