package automation.exercise.steps;

import automation.exercise.pages.HomePage;
import automation.exercise.pages.ProductDetailPage;
import automation.exercise.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ProductPageSteps {
    @And("I mouse hoover on first product and click on add to cart")
    public void iMouseHooverOnFirstProductAndClickOnAddToCart() {
        new ProductPage().mouseHooverAndClickOnAddToCartButton1();
    }

    @And("I click on continue shopping button")
    public void iClickOnContinueShoppingButton() {
        new ProductPage().clickOnContinueShopping();
    }

    @And("I mouse hoover on second product and click on add to cart")
    public void iMouseHooverOnSecondProductAndClickOnAddToCart() {
        new ProductPage().mouseHooverAndClickOnAddToCartButton2();
    }

    @And("I click on view cart link")
    public void iClickOnViewCartLink() {
        new ProductPage().clickOnViewCart();
    }


    @Then("I should see first product {string} added in cart")
    public void iShouldSeeFirstProductAddedInCart(String firstProduct) {
        Assert.assertEquals(new ProductPage().getTextProduct1Name(),firstProduct);
    }


    @And("I should see second product {string} added in cart")
    public void iShouldSeeSecondProductAddedInCart(String secondProduct) {
        Assert.assertEquals(new ProductPage().getTextProduct2Name(),secondProduct);
    }

    @And("I should verify price {string} for first product")
    public void iShouldVerifyPriceForFirstProduct(String expectedPrice1) {
        Assert.assertEquals(new ProductPage().getTextProduct1Price(),expectedPrice1);
    }

    @And("I should verify price {string} for second product")
    public void iShouldVerifyPriceForSecondProduct(String expectedPrice2) {
        Assert.assertEquals(new ProductPage().getTextProduct2Price(),expectedPrice2);
    }

    @And("I should verify their quantity {string}")
    public void iShouldVerifyTheirQuantity(String expectedQuantity) {
        Assert.assertEquals(new ProductPage().getTextQuantity(),expectedQuantity);
    }

    @And("I should verify their total price {string} for first product")
    public void iShouldVerifyTheirTotalPriceForFirstProduct(String ExpectedTotalPrice1) {
        Assert.assertEquals(new ProductPage().getTextTotalPriceForProduct1(),ExpectedTotalPrice1);
    }

    @And("I should verify their total price {string} for second product")
    public void iShouldVerifyTheirTotalPriceForSecondProduct(String ExpectedTotalPrice2) {
        Assert.assertEquals(new ProductPage().getTextTotalPriceForProduct2(),ExpectedTotalPrice2);
    }

    @When("I click on view product on first product")
    public void iClickOnViewProductOnFirstProduct() {
        new ProductPage().clickOnViewProduct();
    }

    @And("I should increase quantity to {int}")
    public void iShouldIncreaseQuantityTo(int arg0) {
        new ProductDetailPage().changeQuantity();
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCart();
    }

    @And("I click on view cart button")
    public void iClickOnViewCartButton() {
        new ProductPage().clickOnViewCart();
    }

    @Then("I should see the exact quantity is displayed in cart")
    public void iShouldSeeTheExactQuantityIsDisplayedInCart() {
        Assert.assertEquals(new ProductPage().getTextChangedQuantity(),"4");
    }


    @When("I click on cross button corresponding to the product")
    public void iClickOnCrossButtonCorrespondingToTheProduct() {
        new ProductDetailPage().clickOnCrossButton();
    }

    @Then("I should see the cart is empty with text {string}")
    public void iShouldSeeTheCartIsEmptyWithText(String expectedText) {
        Assert.assertEquals(new ProductDetailPage().getTextCartIsEmpty(),expectedText);
    }

    @Then("I can see {string} is visible")
    public void iCanSeeWriteYourReviewIsVisible(String expectedText) {
        Assert.assertEquals(new ProductDetailPage().getTextWriteYourReview(),expectedText);
    }

    @And("I enter name  {string} in name field")
    public void iEnterNameInNameField(String name) {
        new ProductDetailPage().enterIntoNameField(name);
    }

    @And("I enter email  {string} in email field")
    public void iEnterEmailInEmailField(String email) {
        new ProductDetailPage().enterIntoEmailField(email);
    }

    @And("I enter review  {string} in review field")
    public void iEnterReviewInReviewField(String review) {
        new ProductDetailPage().enterIntoReviewField(review);
    }

    @And("I click on submit button")
    public void iClickOnSubmitButton() {
        new ProductDetailPage().clickOnSubmitButton();
    }

    @Then("I can see success message {string}")
    public void iCanSeeSuccessMessage(String expectedText) {
        Assert.assertEquals(new ProductDetailPage().getTextThankYouForReview(),expectedText,"Message is not displayed");
    }

    @Then("I can see {string}")
    public void iCanSee(String expectedText) {
        Assert.assertEquals(new HomePage().getTextRecommendedItems(),expectedText,"Message is not displayed");

    }

    @When("I click on Add to cart on Recommended products")
    public void iClickOnAddToCartOnRecommendedProducts() {
        new HomePage().clickOnAddToCartInRecommendedItems();
    }

    @Then("I should see that product {string} is displayed in cart")
    public void iShouldSeeThatProductIsDisplayedInCart(String expectedMsg) {
        Assert.assertEquals(new HomePage().getTextWinterTop(),expectedMsg,"Message is not displayed");
    }
}
