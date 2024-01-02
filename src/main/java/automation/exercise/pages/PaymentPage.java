package automation.exercise.pages;

import automation.exercise.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class PaymentPage extends Utility {

    private static final Logger log = LogManager.getLogger(PaymentPage.class.getName());

    @CacheLookup
    @FindBy(name = "name_on_card")
    WebElement nameOnCard;

    @CacheLookup
    @FindBy(xpath = "//input[@name='card_number']")
    WebElement cardNumber;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='ex. 311']")
    WebElement cvcNumber;
    @CacheLookup
    @FindBy(name = "expiry_month")
    WebElement expiryMonth;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='YYYY']")
    WebElement expiryYear;

    @CacheLookup
    @FindBy(id = "submit")
    WebElement submitButton;

    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='Register / Login']")
    WebElement registerOrLogin;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Congratulations! Your order has been confirmed!']")
    WebElement textYourOrderHasBeenPlaced;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Download Invoice']")
    WebElement downloadInvoice;

    public void enterNameOnCard(String name) {
        log.info("Entering Name On Card into : " + nameOnCard.toString());
        sendTextToElement(nameOnCard, name);
    }

    public void enterCardNumber(String number) {
        log.info("Entering Card Number into : " + cardNumber.toString());
        sendTextToElement(cardNumber, number);
    }

    public void enterCVCNumber(String cvc) {
        log.info("Entering CVC number into : " + cvcNumber.toString());
        sendTextToElement(cvcNumber, cvc);
    }

    public void enterExpiryMonth(String month) {
        log.info("Entering Month into : " + expiryMonth.toString());
        sendTextToElement(expiryMonth, month);
    }

    public void enterExpiryYear(String year) {
        log.info("Entering Year into : " + expiryYear.toString());
        sendTextToElement(expiryYear, year);
    }

    public void clickOnPayAndConfirmOrder() {
        log.info("Clicking on Pay And Confirm order : " + submitButton.toString());
        clickOnElement(submitButton);
    }

    public void clickOnRegisterOrLogin() {
        log.info("Clicking on Register Link : " + registerOrLogin.toString());
        clickOnElement(registerOrLogin);
    }

    public String getTextYourOrderHasBeenPlaced() {
        log.info("Getting text from : " + textYourOrderHasBeenPlaced.toString());
        return getTextFromElement(textYourOrderHasBeenPlaced);
    }
    public void clickOnDownloadInvoice() {
        log.info("Clicking on Download Invoice : " + downloadInvoice.toString());
        clickOnElement(downloadInvoice);
    }

        public boolean filePresent (){
            String homePath = System.getProperty("user.home");
            File folder = new File(homePath + "/Downloads/invoice.txt");
            return folder.exists();


        }
}

