package automation.exercise.steps;

import automation.exercise.pages.ContactUsPage;
import automation.exercise.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ContactUsSteps {

    @When("I click on {string} link")
    public void iClickOnContactUsLink(String option) {
        new HomePage().selectLinkFromTopMenu(option);
    }

    @Then("I should navigate to {string} page")
    public void iShouldNavigateToGetInTouchPage(String expectedText) {
        Assert.assertEquals(new ContactUsPage().getTextGetInTouch(),expectedText,"Page is not displayed");
    }
    @When("I enter {string} in name field")
    public void iEnterInNameField(String name) {
        new ContactUsPage().enterName(name);
    }

    @And("I enter {string} in email field")
    public void iEnterInEmailField(String email) {
        new ContactUsPage().enterEmail(email);
    }

    @And("I enter subject {string}")
    public void iEnterSubject(String subject) {
        new ContactUsPage().enterSubject(subject);
    }

    @And("I enter Message {string}")
    public void iEnterMessage(String message) {
        new ContactUsPage().enterMessageHere(message);
    }

    @And("I click on Choose File Button")
    public void iClickOnChooseFileButton() {
        new ContactUsPage().uploadFile();
    }

    @And("I click on Submit button")
    public void iClickOnSubmitButton() {
        new ContactUsPage().clickOnSubmitButton();
    }
    @And("I click on ok button popup")
    public void iClickOnOkButtonPopup() {
        new ContactUsPage().acceptPopupMessage();
    }

    @Then("I should see Message {string}")
    public void iShouldSeeMessage(String successMessage) {
        Assert.assertEquals(new ContactUsPage().getTextSuccess(),successMessage,"Error message is displayed");
    }

    @And("I click on Home Button")
    public void iClickOnHomeButton() {
        new ContactUsPage().clickOnHomeButton();
    }



}
