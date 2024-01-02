package automation.exercise.pages;

import automation.exercise.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductDetailPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Blue Top']")
    WebElement textBlueTop;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Category: Women > Tops']")
    WebElement textCategoryWomen;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Rs. 500']")
    WebElement textPrice;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-details']//p[2]")
    WebElement textProductAvailability;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'product-information']/p[3]")
    WebElement textProductCondition;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'product-information']/p[4]")
    WebElement textProductBrand;

    @CacheLookup
    @FindBy(id = "quantity")
    WebElement quantity;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-times']")
    WebElement crossButton;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Cart is empty!']")
    WebElement textCartIsEmpty;

    @CacheLookup
    @FindBy(xpath = "//div[@class='productinfo text-center']//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(id = "name")
    WebElement nameField;

    @CacheLookup
    @FindBy(xpath = "//textarea[@id='review']")
    WebElement reviewField;

    @CacheLookup
    @FindBy(id = "email")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Write Your Review']")
    WebElement textWriteYourReview;
    @CacheLookup
    @FindBy(id = "button-review")
    WebElement submitButton;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Thank you for your review.']")
    WebElement textThankYouForReview;

    @CacheLookup
    @FindBy(xpath = "//textarea[@name='message']")
    WebElement commentsInPlaceOrder;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Place Order']")
    WebElement placeOrder;



    public String getTextBlueTop() {
        log.info("Getting text from : " + textBlueTop.toString());
        return getTextFromElement(textBlueTop);
    }

    public String getTextCategoryWomen() {
        log.info("Getting text from : " + textCategoryWomen.toString());
        return getTextFromElement(textCategoryWomen);
    }

    public String getTextPrice() {
        log.info("Getting text from : " + textPrice.toString());
        return getTextFromElement(textPrice);
    }

    public String getTextProductAvailability() {
        log.info("Getting text from : " + textProductAvailability.toString());
        return getTextFromElement(textProductAvailability);
    }

    public String getTextProductCondition() {
        log.info("Getting text from : " + textProductCondition.toString());
        return getTextFromElement(textProductCondition);
    }

    public String getTextProductBrand() {
        log.info("Getting text from : " + textProductBrand.toString());
        return getTextFromElement(textProductBrand);
    }

    public String verifyThePage(){
        System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl();
    }

    public void changeQuantity (){
        log.info("Entering quantity into : " + quantity.toString());
        quantity.clear();
        sendTextToElement(quantity,"4");
    }
    public void clickOnCrossButton (){
        log.info("Clicking on Cross button : " + crossButton.toString());
        clickOnElement(crossButton);
    }

    public String getTextCartIsEmpty() {
        log.info("Getting text from : " + textCartIsEmpty.toString());
        return getTextFromElement(textCartIsEmpty);
    }
    public void clickOnAddToCartAfterSearch(){
        log.info("Clicking on Add to Cart : " + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    public void enterIntoNameField(String name){
        log.info("Entering name into : " + nameField.toString());
        sendTextToElement(nameField,name);
    }

    public void enterIntoEmailField(String email){
        log.info("Entering email Id into : " + emailField.toString());
        sendTextToElement(emailField,email);
    }

    public void enterIntoReviewField(String review){
        log.info("Entering Review into : " + reviewField.toString());
        sendTextToElement(reviewField,review);
    }

    public String getTextWriteYourReview() {
        log.info("Getting text from : " + textWriteYourReview.toString());
        return getTextFromElement(textWriteYourReview);
    }

    public String getTextThankYouForReview() {
        log.info("Getting text from : " + textThankYouForReview.toString());
        return getTextFromElement(textThankYouForReview);
    }
    public void clickOnSubmitButton(){
        log.info("Clicking on Submit Button : " + submitButton.toString());
        clickOnElement(submitButton);
    }
    public void enterIntoCommentArea(String comment){
        log.info("Entering Comment into : " + commentsInPlaceOrder.toString());
        sendTextToElement(commentsInPlaceOrder,comment);}
    public void clickOnPlaceOrder(){
        log.info("Clicking on Place order : " + placeOrder.toString());
        clickOnElement(placeOrder);}

}
