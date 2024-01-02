package automation.exercise.pages;

import automation.exercise.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='All Products']")
    WebElement textAllProducts;

    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'View Product')])[1]")
    WebElement viewProduct;


    @CacheLookup
    @FindBy(xpath = "//div[@class = 'product-information']/p[4]")
    WebElement textProductBrand;

    @CacheLookup
    @FindBy(id = "search_product")
    WebElement searchField;

    @CacheLookup
    @FindBy(xpath = "//div[@class='productinfo text-center']//p[contains(text(),'Blue Top')]")
    WebElement blueTopSearchField;

    @CacheLookup
    @FindBy(id = "submit_search")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Searched Products']")
    WebElement textProductSearched;

    @CacheLookup
    @FindBy(xpath = "(//p[contains(text(),'Blue Top')])[1]")
    WebElement textProductBlueTop;

    @CacheLookup
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[1]")
    WebElement addToCartButton1;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
    WebElement continueShopping;

    @CacheLookup
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[3]")
    WebElement addToCartButton2;

    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    WebElement viewCart;

    @CacheLookup
    @FindBy(xpath = "//td[@class='cart_price']//p[contains(text(),'Rs. 500')]")
    WebElement textProduct1Price;

    @CacheLookup
    @FindBy(xpath = "//td[@class='cart_price']//p[contains(text(),'Rs. 400')]")
    WebElement textProduct2Price;
    @CacheLookup
    @FindBy(xpath = "(//button[@class='disabled'][normalize-space()='1'])[1]")
    WebElement getTextQuantity;

    @CacheLookup
    @FindBy(xpath = "//p[@class='cart_total_price'][normalize-space()='Rs. 500']")
    WebElement textPriceForProduct1 ;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='4']")
    WebElement textQuantity4ForProduct;

    @CacheLookup
    @FindBy(xpath = "//p[@class='cart_total_price'][normalize-space()='Rs. 400']")
    WebElement textPriceForProduct2;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Blue Top']")
    WebElement textProduct1Name;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men Tshirt']")
    WebElement textProduct2Name;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
    WebElement proceedToCheckOut;

    @CacheLookup
    @FindBy(xpath = "(//li[@class='address_address1 address_address2'][normalize-space()='41 Satellite Road'])[1]")
    WebElement textDeliveryAddress;

    @CacheLookup
    @FindBy(xpath = "(//li[@class='address_address1 address_address2'][normalize-space()='41 Satellite Road'])[2]")
    WebElement textBillingAddress;

    public String getTextAllProducts() {
        log.info("Getting Text from : " + textAllProducts.toString());
        return getTextFromElement(textAllProducts);
    }

    public void clickOnViewProduct() {
        log.info("Clicking on Right Arrow Button : " + viewProduct.toString());
        clickOnElement(viewProduct);
    }

    public void enterIntoSearchField(String searchProduct) {
        log.info("Entering Product into search : " + searchField.toString());
       sendTextToElement(searchField,searchProduct);
    }

    public void clickOnSearchButton() {
        log.info("Clicking on Right Arrow Button : " + searchButton.toString());
        clickOnElement(searchButton);
    }

    public String getTextProductSearched() {
        log.info("Getting Text from : " + textProductSearched.toString());
        return getTextFromElement(textProductSearched);
    }

    public String getTextProductBlueTop() {
        log.info("Getting Text from : " + textProductBlueTop.toString());
        return getTextFromElement(textProductBlueTop);
    }

    public void mouseHooverAndClickOnAddToCartButton1() {
        log.info("Clicking on add to cart Button1 : " + addToCartButton1.toString());
        mouseHoverToElementAndClick(addToCartButton1);
    }

    public void mouseHooverAndClickOnAddToCartButton2() {
        log.info("Clicking on add to cart Button2 : " + addToCartButton2.toString());
        clickOnElement(addToCartButton2);
    }
    public void clickOnViewCart() {
        log.info("Clicking on Right Arrow Button : " + viewCart.toString());
        clickOnElement(viewCart);
    }
    public void clickOnContinueShopping() {
        log.info("Clicking on Right Arrow Button : " + continueShopping.toString());
        clickOnElement(continueShopping);
    }

    public String getTextProduct1Price() {
        log.info("Getting Text from : " + textProduct1Price.toString());
        return getTextFromElement(textProduct1Price);
    }

    public String getTextProduct2Price() {
        log.info("Getting Text from : " + textProduct2Price.toString());
        return getTextFromElement(textProduct2Price);
    }

    public String getTextTotalPriceForProduct1() {
        log.info("Getting Text from : " + textPriceForProduct1.toString());
        return getTextFromElement(textPriceForProduct1);
    }

    public String getTextTotalPriceForProduct2() {
        log.info("Getting Text from : " + textPriceForProduct2.toString());
        return getTextFromElement(textPriceForProduct2);
    }

    public String getTextProduct1Name() {
        log.info("Getting Text from : " + textProduct1Name.toString());
        return getTextFromElement(textProduct1Name);
    }

    public String getTextProduct2Name() {
        log.info("Getting Text from : " + textProduct2Name.toString());
        return getTextFromElement(textProduct2Name);
    }

    public String getTextQuantity() {
        log.info("Getting Text from : " + getTextQuantity.toString());
        return getTextFromElement(getTextQuantity);
    }

    public void clickOnAddToCart() {
        log.info("Clicking on Right Arrow Button : " + addToCart.toString());
        clickOnElement(addToCart);
    }

    public String getTextChangedQuantity() {
        log.info("Getting Text from : " + textQuantity4ForProduct.toString());
        return getTextFromElement(textQuantity4ForProduct);
    }

    public void clickOnProceedToCheckOut() {
        log.info("Clicking on Right Arrow Button : " + proceedToCheckOut.toString());
        clickOnElement(proceedToCheckOut);
    }

    public String getTextDeliveryAddress() {
        log.info("Getting Text from : " + textDeliveryAddress.toString());
        return getTextFromElement(textDeliveryAddress);
    }

    public String getTextBillingAddress() {
        log.info("Getting Text from : " + textBillingAddress.toString());
        return getTextFromElement(textBillingAddress);
    }
    public String getTextBlueTopAfterSearch() {
        log.info("Getting Text from : " + blueTopSearchField.toString());
        return getTextFromElement(blueTopSearchField);
    }










}
