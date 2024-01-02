package automation.exercise.steps;

import automation.exercise.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SubscriptionSteps {

    @When("I scroll down to footer on Homepage")
    public void iScrollDownToFooterOnHomepage() {
        new HomePage().scrollDownToElement();
    }

    @Then("I can see text {string} in capital letters")
    public void iCanSeeTextSUBSCRIPTIONInCapitalLetters(String expectedText) {
        Assert.assertEquals(new HomePage().getTextSubscription(),expectedText);
    }

    @When("I enter Email Id {string} to subscribe")
    public void iEnterEmailIdToSubscribe(String email) {
        new HomePage().enterEmailForSubscription(email);
    }

    @And("I click on right arrow to subscribe")
    public void iClickOnRightArrowToSubscribe() {
        new HomePage().clickOnRightArrowToSubscribe();
    }

    @Then("I should see success message {string} is visible")
    public void iShouldSeeSuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible(String expectedMessage) {
        Assert.assertEquals(new HomePage().getTextSuccessSubscription(),expectedMessage,"Message is not displayed");
    }

    @When("I click on Cart link on homePage")
    public void iClickOnCartLinkOnHomePage() {
        new HomePage().clickOnCartLink();
    }


    @When("I click on bottom right side button to move upward")
    public void iClickOnBottomRightSideButtonToMoveUpward() {
        new HomePage().clickOnScrollUpButton();
    }

    @Then("I can see page is scrolled up and {string} text is visible on screen")
    public void iCanSeePageIsScrolledUpAndTextIsVisibleOnScreen(String expectedText) {
        Assert.assertEquals(new HomePage().getTextWhenYouScrollUp(),expectedText );
    }

    @When("I scroll up to top of the page")
    public void iScrollUpToTopOfThePage() {
        new HomePage().scrollUpThePage();
    }


}
