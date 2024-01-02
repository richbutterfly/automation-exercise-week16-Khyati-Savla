package automation.exercise.pages;

import automation.exercise.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(CreateAccountPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    WebElement textEnterAccountInformation;
    @CacheLookup
    @FindBy(id = "id_gender2")
    WebElement titleMrs;

    @CacheLookup
    @FindBy(id = "name")
    WebElement nameField;

    @CacheLookup
    @FindBy(id = "email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "days")
    WebElement dayOfBirth;

    @CacheLookup
    @FindBy(id = "months")
    WebElement monthOfBirth;

    @CacheLookup
    @FindBy(id = "years")
    WebElement yearOfBirth;

    @CacheLookup
    @FindBy(id = "newsletter")
    WebElement checkBoxForNewsLetter;

    @CacheLookup
    @FindBy(id = "optin")
    WebElement checkBoxForReceiveSpecialOffer;

    @CacheLookup
    @FindBy(id = "first_name")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(name = "last_name")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(name = "company")
    WebElement companyField;

    @CacheLookup
    @FindBy(id = "address1")
    WebElement address1Field;

    @CacheLookup
    @FindBy(id = "address2")
    WebElement address2Field;

    @CacheLookup
    @FindBy(id = "country")
    WebElement countryField;

    @CacheLookup
    @FindBy(id = "state")
    WebElement stateField;

    @CacheLookup
    @FindBy(id = "city")
    WebElement cityField;

    @CacheLookup
    @FindBy(name = "zipcode")
    WebElement zipcodeField;

    @CacheLookup
    @FindBy(id = "mobile_number")
    WebElement mobileNumberField;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    WebElement createAccountButton;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
    WebElement textAccountCreated;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueButton;

    public String gettextEnterAccountInformation() {
        log.info("Getting text Enter Account information from : " + textEnterAccountInformation.toString());
        return getTextFromElement(textEnterAccountInformation);
    }

    public void clickOnTitleMrs() {
        log.info("Clicking on Title : " + titleMrs.toString());
        mouseHoverToElementAndClick(titleMrs);
    }

    public void enterEmailId(String email) {
        log.info("Entering email Id into : " + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterName(String name) {
        log.info("Entering Name into : " + nameField.toString());
        sendTextToElement(nameField, name);
    }

    public void enterPassword(String password) {
        log.info("Entering Password into : " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void enterDayOfBirth(String day) {
        log.info("Entering Day into : " + dayOfBirth.toString());
        sendTextToElement(dayOfBirth, day);
    }

    public void enterMonthOfBirth(String month) {
        log.info("Entering Month into : " + monthOfBirth.toString());
        sendTextToElement(monthOfBirth, month);
    }

    public void enterYearOfBirth(String year) {
        log.info("Entering Year into : " + yearOfBirth.toString());
        sendTextToElement(yearOfBirth, year);
    }

    public void clickOnCheckBoxForNewsLetter() {
        log.info("Clicking on check box for newsletter : " + checkBoxForNewsLetter.toString());
        clickOnElement(checkBoxForNewsLetter);
    }


    public void clickOnCheckBoxForReceiveSpecialOffer() {
        log.info("Clicking on check box : " + checkBoxForReceiveSpecialOffer.toString());
        clickOnElement(checkBoxForReceiveSpecialOffer);
    }

    public void enterFirstName(String firstName) {
        log.info("Entering First name into : " + firstNameField.toString());
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        log.info("Entering Last name into : " + lastNameField.toString());
        sendTextToElement(lastNameField, lastName);
    }

    public void enterCompanyName(String company) {
        log.info("Entering company name into : " + companyField.toString());
        sendTextToElement(companyField, company);
    }

    public void enterAddress(String address) {
        log.info("Entering address into : " + address1Field.toString());
        sendTextToElement(address1Field, address);
    }

    public void enterAddress2(String address2) {
        log.info("Entering address2 into : " + address2Field.toString());
        sendTextToElement(address2Field, address2);
    }

    public void selectCountryFromDropDown(String country) {
        log.info("Selecting Country into : " + countryField.toString());
        selectByVisibleTextFromDropDown(countryField, country);
    }

    public void enterState(String state) {
        log.info("Entering State into : " + stateField.toString());
        sendTextToElement(stateField, state);
    }

    public void enterCity(String city) {
        log.info("Entering city into : " + cityField.toString());
        sendTextToElement(cityField, city);
    }

    public void enterZipcode(String zipcode) {
        log.info("Entering Zipcode into : " + zipcodeField.toString());
        sendTextToElement(zipcodeField, zipcode);
    }

    public void enterMobileNumber(String mobileNumber) {
        log.info("Entering mobile number into : " + mobileNumberField.toString());
        sendTextToElement(mobileNumberField, mobileNumber);
    }

    public void clickOnCreateAccountButton() {
        log.info("Clicking on Create Account button : " + createAccountButton.toString());
        clickOnElement(createAccountButton);
    }

    public String getTextAccountCreated() {
        log.info("Getting text from : " + textAccountCreated.toString());
        return getTextFromElement(textAccountCreated);
    }

    public void clickOnContinueButton() {
        log.info("Clicking on Continue button : " + continueButton.toString());
        clickOnElement(continueButton);
    }


}
