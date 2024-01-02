package automation.exercise.pages;

import automation.exercise.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
    WebElement textLoginToYourAccount;

    @CacheLookup
    @FindBy(name = "email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(id = "aswift_1")
    WebElement iframe;

    @CacheLookup
    @FindBy(linkText = "none")
    WebElement cancelButton;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    WebElement textIncorrectEmailOrPassword;

    public String getTextLoginToYourAccount() {
        log.info("Getting text from : " + textLoginToYourAccount.toString());
        return getTextFromElement(textLoginToYourAccount);
    }

    public void enterEmailId(String email) {
        log.info("Entering Email Id into : " + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterPasswordField(String password) {
        log.info("Entering password into : " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        log.info("Clicking on Login Button : " + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String getTextIncorrectEmailIdOrPassword() {
        log.info("Getting text from : " + textIncorrectEmailOrPassword.toString());
        return getTextFromElement(textIncorrectEmailOrPassword);
    }
}
