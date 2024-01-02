package automation.exercise.steps;

import automation.exercise.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TestCasesSteps {

    @When("I click on {string} Link")
    public void iClickOnTestCasesLink(String option) {
        new HomePage().selectLinkFromTopMenu(option);
    }

    @Then("I should navigate to Test Cases Page successfully")
    public void iShouldNavigateToTestCasesPageSuccessfully() {
        Assert.assertEquals(new HomePage().getTextTestCases(),"TEST CASES","Page is not displayed");
    }


}
