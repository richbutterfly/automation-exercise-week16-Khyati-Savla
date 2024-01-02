package automation.exercise.steps;

import automation.exercise.pages.HomePage;
import automation.exercise.pages.ProductDetailPage;
import automation.exercise.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AllProductsAndProductDetailPageSteps {

    @When("I click on Products link on Homepage")
    public void iClickOnProductsLinkOnHomepage() {
        new HomePage().clickOnProductLink();
    }

    @When("I click on Products link")
    public void iClickOnProductsLink() {
        new HomePage().clickOnProductLink();
    }

    @Then("I should navigate on {string} page successfully")
    public void iShouldNavigateOnALLPRODUCTSPageSuccessfully(String expectedText) {
        Assert.assertEquals(new ProductPage().getTextAllProducts(), expectedText, "Page is not displayed");
    }

    @And("I click on View Product of first product {string}")
    public void iClickOnViewProductOfFirstProduct(String firstProduct) {
        new ProductPage().clickOnViewProduct();
    }


    @And("I should navigate on product detail page and verify URL")
    public void iShouldNavigateOnProductDetailPageAndVerifyURL() {
        Assert.assertEquals(new ProductDetailPage().getTextBlueTop(), "Blue Top");
    }

    @And("I should see product name {string}")
    public void iShouldSeeProductName(String productName) {
        Assert.assertEquals(new ProductDetailPage().getTextBlueTop(), productName);
    }

    @Then("I should see product name {string} in shopping cart")
    public void iShouldSeeProductNameInShoppingCart(String expectedText) {
        Assert.assertEquals(new ProductPage().getTextProduct1Name(), expectedText);
    }


    @And("I should see category {string}")
    public void iShouldSeeCategory(String expectedCategory) {
        Assert.assertEquals(new ProductDetailPage().getTextCategoryWomen(), expectedCategory);
    }

    @And("I should see price {string}")
    public void iShouldSeePrice(String expectedPrice) {
        Assert.assertEquals(new ProductDetailPage().getTextPrice(), expectedPrice);
    }

    @And("I should see availability {string}")
    public void iShouldSeeAvailability(String expectedAvailability) {
        Assert.assertEquals(new ProductDetailPage().getTextProductAvailability(), expectedAvailability);
    }

    @And("I should see condition {string}")
    public void iShouldSeeCondition(String expectedCondition) {
        Assert.assertEquals(new ProductDetailPage().getTextProductCondition(), expectedCondition);
    }

    @And("I should see brand {string}")
    public void iShouldSeeBrand(String expectedBrand) {
        Assert.assertEquals(new ProductDetailPage().getTextProductBrand(), expectedBrand);
    }


    @When("I enter product name {string} in search input")
    public void iEnterProductNameInSearchInput(String searchProduct) {
        new ProductPage().enterIntoSearchField(searchProduct);
    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
        new ProductPage().clickOnSearchButton();
    }

    @And("I can see that Product {string} after search")
    public void iCanSeeThatProductAfterSearch(String expectedProduct) {
        Assert.assertEquals(new ProductPage().getTextBlueTopAfterSearch(),expectedProduct);
    }

    @Then("I should see text {string}")
    public void iShouldSeeText(String expectedText) {
        Assert.assertEquals(new ProductPage().getTextProductSearched(), expectedText, "Page is not displayed");
    }

    @And("I can see that Product {string} related to search successfully")
    public void iCanSeeThatProductRelatedToSearchSuccessfully(String productSearched) {
        Assert.assertEquals(new ProductPage().getTextProductBlueTop(), productSearched, "Product is not displayed");
    }

    @When("I click on add to cart button after searching product")
    public void iClickOnAddToCartButtonAfterSearchingProduct() {
        new ProductDetailPage().clickOnAddToCartAfterSearch();
    }

    @Then("I should see the product {string} visible in cart after Login")
    public void iShouldSeeTheProductVisibleInCartAfterLogin(String expectedText) {
        Assert.assertEquals(new ProductPage().getTextProduct1Name(), expectedText, "Product is not displayed");
    }



}