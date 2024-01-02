package automation.exercise.steps;

import automation.exercise.pages.CreateAccountPage;
import automation.exercise.pages.HomePage;
import automation.exercise.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CreateAccountSteps {
    @When("I select title for gender")
    public void iSelectTitleForGender() {
        new CreateAccountPage().clickOnTitleMrs();
    }

    @And("I enter name {string} in name field")
    public void iEnterNameInNameField(String name) {
        new CreateAccountPage().enterName(name);

    }

    @And("I enter email {string} in email field")
    public void iEnterEmailInEmailField(String email) {

    }
    @And("I enter Email address in email field")
    public void iEnterEmailAddressInEmailField(String email) {
        new CreateAccountPage().enterEmailId(email);;
    }

    @And("I enter password {string} in password field")
    public void iEnterPasswordInPasswordField(String password) {
        new CreateAccountPage().enterPassword(password);
    }

    @And("I enter day {string} of birth")
    public void iEnterDayOfBirth(String day) {
        new CreateAccountPage().enterDayOfBirth(day);
    }

    @And("I enter Month {string} of birth")
    public void iEnterMonthOfBirth(String month) {
        new CreateAccountPage().enterMonthOfBirth(month);
    }

    @And("I enter Year {string}of birth")
    public void iEnterYearOfBirth(String year) {
        new CreateAccountPage().enterYearOfBirth(year);
    }

    @And("I click on check box for newsletter")
    public void iClickOnCheckBoxForNewsletter() {
        new CreateAccountPage().clickOnCheckBoxForNewsLetter();
    }

    @And("I click on check box for receive special offers")
    public void iClickOnCheckBoxForReceiveSpecialOffers() {
        new CreateAccountPage().clickOnCheckBoxForReceiveSpecialOffer();
    }

    @And("I enter first name {string}")
    public void iEnterFirstName(String firstName) {
        new CreateAccountPage().enterFirstName(firstName);
    }

    @And("I enter last name{string}")
    public void iEnterLastName(String lastName) {
        new CreateAccountPage().enterLastName(lastName);
    }

    @And("I enter company name {string}")
    public void iEnterCompanyName(String company) {
        new CreateAccountPage().enterCompanyName(company);
    }

    @And("I enter address {string}")
    public void iEnterAddress(String address) {
        new CreateAccountPage().enterAddress(address);
    }

    @And("I enter address{int} {string}")
    public void iEnterAddress(int arg0, String address2) {
        new CreateAccountPage().enterAddress2(address2);
    }

    @And("I select country {string} from dropDown")
    public void iSelectCountryFromDropDown(String country) {
        new CreateAccountPage().selectCountryFromDropDown(country);
    }

    @And("I enter state {string} in state field")
    public void iEnterStateInStateField(String state) {
        new CreateAccountPage().enterState(state);
    }

    @And("I enter city {string} in city field")
    public void iEnterCityInCityField(String city) {
        new CreateAccountPage().enterCity(city);
    }

    @And("I enter zipcode {string} in zipcode field")
    public void iEnterZipcodeInZipcodeField(String zipcode) {
        new  CreateAccountPage().enterZipcode(zipcode);
    }

    @And("I enter Mobile number {string}")
    public void iEnterMobileNumber(String mobileNumber) {
        new CreateAccountPage().enterMobileNumber(mobileNumber);
    }

    @And("I click on create Account button")
    public void iClickOnCreateAccountButton() {
        new CreateAccountPage().clickOnCreateAccountButton();
    }

    @Then("I can successfully create an account")
    public void iCanSuccessfullyCreateAnAccount() {
        Assert.assertEquals(new CreateAccountPage().getTextAccountCreated(),"ACCOUNT CREATED!","Error message is displayed");
    }

    @And("I click on continue button after creating an account")
    public void iClickOnContinueButtonAfterCreatingAnAccount() {
        new CreateAccountPage().clickOnContinueButton();
    }

    @Then("I can see text {string}")
    public void iCanSeeTextLoggedInAsKhyati(String message) {
        Assert.assertEquals(new HomePage().getTextLoggedInAsKhyati(),message,"Error message is displayed");
    }

    @When("I click on Delete account")
    public void iClickOnDeleteAccount() {
        new HomePage().clickOnDeleteAccount();
    }

    @Then("I can delete account successfully")
    public void iCanDeleteAccountSuccessfully() {
        Assert.assertEquals(new HomePage().getTextAccountDeleted(),"ACCOUNT DELETED!","Error message is displayed");
    }

    @And("I click on continue button")
    public void iClickOnContinueButton() {
        new HomePage().clickOnContinueBtnAfterAccountDeleted();
    }

    @And("I dismiss the pop up alert")
    public void iDismissThePopUpAlert() {
        new HomePage().dismissAlert();
    }

    @When("I click on proceed to check out")
    public void iClickOnProceedToCheckOut() {
        new ProductPage().clickOnProceedToCheckOut();

    }

    @Then("I should see delivery address is same as I filled in registration {string}")
    public void iShouldSeeDeliveryAddressIsSameAsIFilledInRegistration(String expectedText1) {
        Assert.assertEquals(new ProductPage().getTextDeliveryAddress(),expectedText1,"Error");
    }

    @And("I should see billing address is same as I filled in registration {string}")
    public void iShouldSeeBillingAddressIsSameAsIFilledInRegistration(String expectedText2) {
        Assert.assertEquals(new ProductPage().getTextBillingAddress(),expectedText2,"Error");
    }


}
