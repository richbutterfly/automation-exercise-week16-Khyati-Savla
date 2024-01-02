package automation.exercise.steps;

import automation.exercise.pages.HomePage;
import automation.exercise.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginLogOutSteps {
    @When("I see the text {string}")
    public void iSeeTheTextLoginToYourAccount(String message) {
        Assert.assertEquals(new LoginPage().getTextLoginToYourAccount(), message, "Error");
    }

    @And("I enter email address {string}")
    public void iEnterEmailAddress(String email) {
        new LoginPage().enterEmailId(email);
    }


    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPasswordField(password);
    }

    @And("I click on Login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should log in successfully on the page and see message {string}")
    public void iShouldLogInSuccessfullyOnThePageAndSeeMessage(String expectedMessage) {
        Assert.assertEquals(new HomePage().getTextLoggedInAsKhyati(), expectedMessage, "Error message is displayed");
    }


    @Then("I should see message {string}")
    public void iShouldSeeMessage(String expectedMsg) {
        Assert.assertEquals(new LoginPage().getTextIncorrectEmailIdOrPassword(), expectedMsg, "Error message is displayed");
    }

    @When("I click on Log out button")
    public void iClickOnLogOutButton() {
        new HomePage().clickOnLogOutLink();
    }

   }

