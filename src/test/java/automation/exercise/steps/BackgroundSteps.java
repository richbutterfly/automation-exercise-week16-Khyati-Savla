package automation.exercise.steps;

import automation.exercise.pages.HomePage;
import automation.exercise.pages.SignUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BackgroundSteps {
    @Given("I am on HomePage")
    public void iAmOnHomePage() {
    }

    @When("I click on Sign up Link")
    public void iClickOnSignUpLink() {
        new HomePage().clickOnSignUpLink();
    }

    @Then("I should see the message 'New User SignUp!\" message")
    public void iShouldSeeTheMessageNewUserSignUpMessage() {
        Assert.assertEquals(new SignUpPage().getTextNewUserSignUp(), "New User Signup!", "Error Message is displayed");
    }


}
