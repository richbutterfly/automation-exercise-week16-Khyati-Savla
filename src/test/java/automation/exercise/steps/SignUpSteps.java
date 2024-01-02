package automation.exercise.steps;

import automation.exercise.pages.CreateAccountPage;
import automation.exercise.pages.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SignUpSteps {
    @When("I enter name {string} in nameField")
    public void iEnterNameInNameField(String name) {
        new SignUpPage().enterName(name);

    }

    @And("I enter Email address {string} in email field")
    public void iEnterEmailAddressInEmailField(String email) {
        new SignUpPage().enterEmail(email);
    }

    @And("I click on Sign up button")
    public void iClickOnSignUpButton() {
        new SignUpPage().clickOnSignUpButton();
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessageEnterAccountInformation(String message) {
        Assert.assertEquals(new CreateAccountPage().gettextEnterAccountInformation(),message, "Page is not displayed");
    }


    @Then("I should see the text {string}")
    public void iShouldSeeTheText(String expectedMessage) {
        Assert.assertEquals(new SignUpPage().getTextEmailAddressAlreadyExist(),expectedMessage, "Error message is not displayed");
    }
}
