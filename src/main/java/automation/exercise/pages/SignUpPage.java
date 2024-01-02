package automation.exercise.pages;

import automation.exercise.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends Utility {

    private static final Logger log = LogManager.getLogger(SignUpPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
    WebElement textNewUserSignUp;

    @CacheLookup
    @FindBy(name = "name")
    WebElement nameField;

    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement signUpLink;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Signup']")
    WebElement signUpButton;
    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    WebElement textEmailAddressAlreadyExist;

    public String getTextNewUserSignUp(){
        log.info("Getting text from : " + textNewUserSignUp.toString());
        return getTextFromElement(textNewUserSignUp);
    }
    public void enterName(String name) {
        log.info("Entering email Id into : " + nameField.toString());
        sendTextToElement(nameField, name);
    }
    public void enterEmail(String email) {
        log.info("Entering email Id into : " + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void clickOnSignUpButton(){
        log.info("Clicking on Log out Button : " + signUpButton.toString());
        clickOnElement(signUpButton);
    }
    public void clickOnSignUpLink(){
        log.info("Clicking on Log out Button : " + signUpLink.toString());
        clickOnElement(signUpLink);
    }

    public String getTextEmailAddressAlreadyExist() {
        log.info("Getting text from : " + textEmailAddressAlreadyExist.toString());
        return getTextFromElement(textEmailAddressAlreadyExist);

    }

}
