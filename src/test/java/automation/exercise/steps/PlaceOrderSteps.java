package automation.exercise.steps;

import automation.exercise.pages.PaymentPage;
import automation.exercise.pages.ProductDetailPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class PlaceOrderSteps {

    @And("I click on Register or Login link")
    public void iClickOnRegisterOrLoginLink() {
        new PaymentPage().clickOnRegisterOrLogin();
    }

    @When("I enter {string} in description box")
    public void iEnterInDescriptionBox(String comment) {
        new ProductDetailPage().enterIntoCommentArea(comment);
    }

    @And("I click on place order button")
    public void iClickOnPlaceOrderButton() {
        new ProductDetailPage().clickOnPlaceOrder();
    }

    @Then("I can see message {string}")
    public void iCanSeeMessage(String expectedMessage) {
        Assert.assertEquals(new PaymentPage().getTextYourOrderHasBeenPlaced(),expectedMessage,"Error message is displayed");
    }

    @And("I enter name on card {string}")
    public void iEnterNameOnCard(String name) {
        new PaymentPage().enterNameOnCard(name);
    }

    @And("I enter card number {string}")
    public void iEnterCardNumber(String cardNumber) {
        new PaymentPage().enterCardNumber(cardNumber);
    }

    @And("I enter CVC number {string}")
    public void iEnterCVCNumber(String cvcNumber) {
        new PaymentPage().enterCVCNumber(cvcNumber);
    }

    @And("I enter Expiry Month {string}")
    public void iEnterExpiryMonth(String month) {
        new PaymentPage().enterExpiryMonth(month);
    }

    @And("I enter Expiry Year {string}")
    public void iEnterExpiryYear(String year) {
        new PaymentPage().enterExpiryYear(year);
    }

    @And("I click on Pay and Confirm order")
    public void iClickOnPayAndConfirmOrder() {
        new PaymentPage().clickOnPayAndConfirmOrder();
    }


    @When("I click on Download Invoice Button")
    public void iClickOnDownloadInvoiceButton() {
        new PaymentPage().clickOnDownloadInvoice();
    }

    @Then("I can see Invoice downloaded successfully in download folder")
    public void iCanSeeInvoiceDownloadedSuccessfullyInDownloadFolder() {
        new PaymentPage().filePresent();
    }


}
