package automation.exercise.steps;

import automation.exercise.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CategoryAndBrandsSteps {
    @When("I mouse hoover on category and click on {string}")
    public void iMouseHooverOnCategoryAndClickOn(String arg0) {
        new HomePage().clickOnWomenCategory();
    }

    @And("I click on sub category {string}")
    public void iClickOnSubCategory(String arg0) {
        new HomePage().clickOnCategoryDress();
    }

    @Then("I should navigate to that category page and see text {string}")
    public void iShouldNavigateToThatCategoryPageAndSeeText(String expectedText) {
        Assert.assertEquals(new HomePage().getTextWomenDressProduct(), expectedText, "Page is not displayed");
    }

    @When("I mouse hoover on another category and click on {string}")
    public void iMouseHooverOnAnotherCategoryAndClickOn(String arg0) {
        new HomePage().clickOnMenCategory();
    }

    @And("I click on another sub category {string}")
    public void iClickOnAnotherSubCategory(String arg0) {
        new HomePage().clickOnCategoryJeans();
    }

    @Then("I should navigate to that category page and see {string}")
    public void iShouldNavigateToThatCategoryPageAndSee(String expText) {
        Assert.assertEquals(new HomePage().getTextMenJeansProducts(), expText, "Page is not displayed");
    }

    @When("I mouse hoover on Brand and click on {string}")
    public void iMouseHooverOnBrandAndClickOn(String arg0) {
        new HomePage().clickOnBrandPOLO();

    }

    @Then("I should navigate to that Brand page and see text {string}")
    public void iShouldNavigateToThatBrandPageAndSeeText(String expectedMessage) {
        Assert.assertEquals(new HomePage().getTextBrandPoloProducts(), expectedMessage, "Page is not displayed");
    }

    @When("I mouse hoover on another Brand and  again click on {string}")
    public void iMouseHooverOnAnotherBrandAndAgainClickOn(String arg0) {
        new HomePage().clickOnBrandBIBA();
    }

    @When("I mouse hoover on another Brand and click on {string}")
    public void iMouseHooverOnAnotherBrandAndClickOn(String expectedMsg) {
        Assert.assertEquals(new HomePage().getTextBrandBIBAProducts(), expectedMsg, "Page is not displayed");
    }


}
