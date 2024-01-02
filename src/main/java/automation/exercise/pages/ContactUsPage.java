package automation.exercise.pages;

import automation.exercise.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends Utility {

    private static final Logger log = LogManager.getLogger(ContactUsPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    WebElement textGetInTouch;

    @CacheLookup
    @FindBy(name = "name")
    WebElement nameField;

    @CacheLookup
    @FindBy(name = "email")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Subject']")
    WebElement subjectField;

    @CacheLookup
    @FindBy(id = "message")
    WebElement messageField;
    @CacheLookup
    @FindBy(xpath = "//input[@name='upload_file']")
    WebElement uploadFile;

    @CacheLookup
    @FindBy(name = "submit")
    WebElement submitButton;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Home']")
    WebElement homeButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='status alert alert-success']")
    WebElement textSuccess;

    public String getTextGetInTouch (){
        log.info("Getting text Get In Touch from : " + textGetInTouch.toString());
        return getTextFromElement(textGetInTouch);
    }

    public void enterName(String name){
        log.info("Entering name into : " + nameField.toString());
        sendTextToElement(nameField,name);
    }

    public void enterEmail(String email){
        log.info("Entering email Id into : " + emailField.toString());
        sendTextToElement(emailField,email);
    }

    public void enterSubject(String subject){
        log.info("Entering Subject into : " + subjectField.toString());
        sendTextToElement(subjectField,subject);
    }

    public void enterMessageHere(String yourMessage){
        log.info("Entering Message into : " + messageField.toString());
        sendTextToElement(messageField,yourMessage);
    }

    public void uploadFile(){
        log.info("Uploading file into : " + uploadFile.toString());
        uploadFile.sendKeys("C:\\Contact Details");
    }

    public void clickOnHomeButton(){
        log.info("Clicking on Home Button : " + homeButton.toString());
        clickOnElement(homeButton);
    }

    public void clickOnSubmitButton(){
        log.info("Clicking on Submit button : " + submitButton.toString());
        clickOnElement(submitButton);
    }
    public String getTextSuccess (){
        log.info("Getting text Success from : " + textSuccess.toString());
        return getTextFromElement(textSuccess);
    }

    public void acceptPopupMessage(){
        acceptAlert();
        log.info("Accepting the alert : ");
    }



}
