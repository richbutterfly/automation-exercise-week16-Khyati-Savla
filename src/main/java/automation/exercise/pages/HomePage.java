package automation.exercise.pages;

import automation.exercise.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement signUpLink;

    @CacheLookup
    @FindBy(xpath = "//li[10]//a[1]")
    WebElement textLoggedInAsKhyati;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    WebElement deleteAccount;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
    WebElement textAccountDeleted;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueBtnAfterAccountDeleted;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logOutLink;



    @CacheLookup
    @FindBy(xpath = "//a[@href='/products']")
    WebElement productLink;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Test Cases']")
    WebElement textTestCases;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    WebElement textSubscription;

    @CacheLookup
    @FindBy(id = "susbscribe_email")
    WebElement emailForSubscription;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    WebElement rightArrowToSearch;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert-success alert']")
    WebElement textSubscriptionSuccess;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cart']")
    WebElement cart;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li")
    List<WebElement> headerMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='scrollUp']")
    WebElement scrollUp;

    @CacheLookup
    @FindBy(xpath = "//div[@class='item active left']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")
    WebElement textWhenYouScrollUp;

    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'View Product')])[1]")
    WebElement viewProduct1;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Women']")
    WebElement womenCategory;

    @CacheLookup
    @FindBy(xpath = "//div[@id='Women']//a[contains(text(),'Dress')]")
    WebElement categoryDress;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Women - Dress Products']")
    WebElement textWomenDressProduct;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men']")
    WebElement menCategory;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Jeans']")
    WebElement jeansCategory;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Men - Jeans Products']")
    WebElement textMenJeansProducts;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    WebElement brandPOLO;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - Polo Products']")
    WebElement textBrandPOLO;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/Biba']")
    WebElement brandBIBA;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - Biba Products']")
    WebElement textBrandBIBA;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='recommended items']")
    WebElement recommendedItems;

    @CacheLookup
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[73]")
    WebElement addToCartInRecommendedItems;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Winter Top']")
    WebElement productWinterTop;


    public void clickOnSignUpLink (){
        log.info("Clicking on Sign up Link : " + signUpLink.toString());
        clickOnElement(signUpLink);
    }
    public String getTextLoggedInAsKhyati(){
        log.info("Getting text from : " + textLoggedInAsKhyati.toString());
        return getTextFromElement(textLoggedInAsKhyati);
    }
    public void clickOnDeleteAccount (){
        log.info("Clicking on Delete Account : " + deleteAccount.toString());
        clickOnElement(deleteAccount);
    }
    public String getTextAccountDeleted(){
        log.info("Getting text from : " + textAccountDeleted.toString());
        return getTextFromElement(textAccountDeleted);
    }

    public void clickOnContinueBtnAfterAccountDeleted(){
        log.info("Clicking on Continue Button : " + continueBtnAfterAccountDeleted.toString());
        clickOnElement(continueBtnAfterAccountDeleted);
    }

    public void clickOnLogOutLink (){
        log.info("Clicking on Log out Button : " + logOutLink.toString());
        clickOnElement(logOutLink);
    }

    public String getTextTestCases(){
        log.info("Getting Text from : " + textTestCases.toString());
        return getTextFromElement(textTestCases);
    }

    public void enterEmailForSubscription (String email){
        log.info("Entering email Id into : " + emailForSubscription.toString());
        sendTextToElement(emailForSubscription,email);
    }

    public void clickOnRightArrowToSubscribe (){
        log.info("Clicking on Right Arrow Button : " + rightArrowToSearch.toString());
        clickOnElement(rightArrowToSearch);
    }

    public String getTextSubscription(){
        log.info("Getting text from : " + textSubscription.toString());
        return getTextFromElement(textSubscription);
    }

    public String getTextSuccessSubscription(){
        log.info("Getting text from : " + textSubscriptionSuccess.toString());
        return getTextFromElement(textSubscriptionSuccess);
    }
    public void clickOnCartLink (){
        log.info("Clicking on Cart Link : " + cart.toString());
        clickOnElement(cart);
    }

    public void scrollDownToElement (){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0, 250);");
    }

    public void clickOnProductLink (){
        log.info("Clicking on Product Link : " + productLink.toString());
        mouseHoverToElementAndClick(productLink);
    }
    public void selectLinkFromTopMenu (String options){
        for (WebElement option : headerMenu) {
            if (options.equalsIgnoreCase(option.getText())) {
                option.click();
                log.info("CLicking on " + option + " header menu : " + headerMenu.toString());
                break;
            }

            }
    }

    public void clickOnScrollUpButton (){
        log.info("Clicking on Scroll upButton : " + scrollUp.toString());
        clickOnElement(scrollUp);
    }

    public String getTextWhenYouScrollUp(){
        log.info("Getting text from : " + textWhenYouScrollUp.toString());
        return getTextFromElement(textWhenYouScrollUp);
    }

    public void scrollUpThePage (){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0, -250);");
    }

    public void clickOnViewProduct1 (){
        log.info("Clicking on View Product1 : " + viewProduct1.toString());
        clickOnElement(viewProduct1);
    }

    public void clickOnWomenCategory (){
        log.info("Clicking on Women Category : " + womenCategory.toString());
        clickOnElement(womenCategory);
    }

    public void clickOnMenCategory (){
        log.info("Clicking on Men Category : " + menCategory.toString());
        clickOnElement(menCategory);
    }

    public void clickOnCategoryDress (){
        log.info("Clicking on Dress Category : " + categoryDress.toString());
        clickOnElement(categoryDress);
    }

    public void clickOnCategoryJeans (){
        log.info("Clicking on Jeans Category : " + jeansCategory.toString());
        clickOnElement(jeansCategory);
    }

    public String getTextWomenDressProduct(){
        log.info("Getting text from : " + textWomenDressProduct.toString());
        return getTextFromElement(textWomenDressProduct);
    }

    public String getTextMenJeansProducts(){
        log.info("Getting text from : " + textMenJeansProducts.toString());
        return getTextFromElement(textMenJeansProducts);
    }
    public void clickOnBrandPOLO (){
        log.info("Clicking on Brand Polo : " + brandPOLO.toString());
        clickOnElement(brandPOLO);
    }
    public String getTextBrandPoloProducts(){
        log.info("Getting text from : " + textBrandPOLO.toString());
        return getTextFromElement(textBrandPOLO);
    }
    public void clickOnBrandBIBA (){
        log.info("Clicking on Brand BIBA : " + brandBIBA.toString());
        clickOnElement(brandBIBA);
    }
    public String getTextBrandBIBAProducts(){
        log.info("Getting text from : " + textBrandBIBA.toString());
        return getTextFromElement(textBrandBIBA);
    }

    public String getTextRecommendedItems(){
        log.info("Getting text from : " + recommendedItems.toString());
        return getTextFromElement(recommendedItems);
    }

    public String getTextWinterTop(){
        log.info("Getting text from : " + productWinterTop.toString());
        return getTextFromElement(productWinterTop);
    }
    public void clickOnAddToCartInRecommendedItems (){
        log.info("Clicking on Add to cart : " + addToCartInRecommendedItems.toString());
        clickOnElement(addToCartInRecommendedItems);

    }

}


