package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.LumaRegisterPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_004_ButtonsStepDef {
    LumaRegisterPage luma = new LumaRegisterPage();
    Faker faker = new Faker();
    Actions action = new Actions(Driver.getDriver());

    @Then("verify the Create New Customer Account header is visible")
    public void verifyTheCreateNewCustomerAccountHeaderIsVisible() {
        Assert.assertTrue(luma.createNewCustomerAccountText.isDisplayed());
    }

    @Then("verify Personal Information section name is visible")
    public void verifyPersonalInformationSectionNameIsVisible() {
        Assert.assertTrue(luma.personelInformationText.isDisplayed());
    }

    @Then("verify the First Name text is visible on the First Name inputbox")
    public void verifyTheFirstNameTextIsVisibleOnTheFirstNameInputbox() {
        Assert.assertTrue(luma.firstNameText.isDisplayed());
    }

    @Then("verify the Last Name text is visible on the Last Name inputbox")
    public void verifyTheLastNameTextIsVisibleOnTheLastNameInputbox() {
        Assert.assertTrue(luma.lastNameText.isDisplayed());
    }

    @Then("verify Sign-in Information section name is visible")
    public void verifySignInInformationSectionNameIsVisible() {
        Assert.assertTrue(luma.signinInformationText.isDisplayed());
    }

    @Then("verify Email text is visible on the email inputbox")
    public void verifyEmailTextIsVisibleOnTheEmailInputbox() {
        Assert.assertTrue(luma.emailText.isDisplayed());
    }

    @Then("verify the Password text is visible on the Password inputbox")
    public void verifyThePasswordTextIsVisibleOnThePasswordInputbox() {
        Assert.assertTrue(luma.passwordText.isDisplayed());
    }

    @Then("verify the Confirm Password text is visible on the Confirm Password inputbox")
    public void verifyTheConfirmPasswordTextIsVisibleOnTheConfirmPasswordInputbox() {
        Assert.assertTrue(luma.confirmPasswordText.isDisplayed());
    }

    @Then("verify the Create an Account text is clickable")
    public void verifyTheCreateAnAccountTextIsClickable() {
        Assert.assertTrue(luma.createAnAccountButton.isDisplayed());
    }


    @Then("verify the visibility of the LUMA icon")
    public void verifyTheVisibilityOfTheLUMAIcon() {
        Assert.assertTrue(luma.lumaLogo.isDisplayed());
    }

    @Then("verify the visibility and label of the Whats's New button")
    public void verifyTheVisibilityAndLabelOfTheWhatsSNewButton() {

        Assert.assertTrue(luma.whatsNewButton.isDisplayed());
        String expectedLabel = "What's New";
        String actualLabel = luma.whatsNewButton.getText();
        Assert.assertEquals(expectedLabel, actualLabel);

    }

    @Then("verify the visibility and label of the Women button")
    public void verifyTheVisibilityAndLabelOfTheWomenButton() {
        Assert.assertTrue(luma.womanButton.isDisplayed());
        String expectedLabel = "Women";
        String actualLabel = luma.womanButton.getText();
        Assert.assertEquals(expectedLabel, actualLabel);
    }

    @Then("verify the visibility and label of the Men button")
    public void verifyTheVisibilityAndLabelOfTheMenButton() {
        Assert.assertTrue(luma.manButton.isDisplayed());
        String expectedLabel = "Men";
        String actualLabel = luma.manButton.getText();
        Assert.assertEquals(expectedLabel, actualLabel);
    }

    @Then("verify the visibility and label of the Gear button")
    public void verifyTheVisibilityAndLabelOfTheGearButton() {
        Assert.assertTrue(luma.gearButton.isDisplayed());
        String expectedLabel = "Gear";
        String actualLabel = luma.gearButton.getText();
        Assert.assertEquals(expectedLabel, actualLabel);
    }

    @Then("verify the visibility and label of the Training button")
    public void verifyTheVisibilityAndLabelOfTheTrainingButton() {
        Assert.assertTrue(luma.trainingButton.isDisplayed());
        String expectedLabel = "Training";
        String actualLabel = luma.trainingButton.getText();
        Assert.assertEquals(expectedLabel, actualLabel);
    }

    @Then("verify the visibility and label of the Sale button")
    public void verifyTheVisibilityAndLabelOfTheSaleButton() {
        Assert.assertTrue(luma.saleButton.isDisplayed());
        String expectedLabel = "Sale";
        String actualLabel = luma.saleButton.getText();
        Assert.assertEquals(expectedLabel, actualLabel);
    }

    @Then("verify the visibility of the the shopping cart icon button")
    public void verifyTheVisibilityOfTheTheShoppingCartIconButton() {
        Assert.assertTrue(luma.shoppingIcon.isDisplayed());

    }

    @Then("verify the visibility of the Default welcome msg! text")
    public void verifyTheVisibilityOfTheDefaultWelcomeMsgText() {
        Assert.assertTrue(luma.defaultWelcomeMsgText.isDisplayed());

    }

    @Then("verify the visibility and label of the Sign In button")
    public void verifyTheVisibilityAndLabelOfTheSignInButton() {
        Assert.assertTrue(luma.signInButton.isDisplayed());
        String expectedLabel = "Sign In";
        String actualLabel = luma.signInButton.getText();
        Assert.assertEquals(expectedLabel, actualLabel);
    }

    @Then("verify the visibility and label of the Create an Account button")
    public void verifyTheVisibilityAndLabelOfTheCreateAnAccountButton() {
        Assert.assertTrue(luma.createAnAccountHeaderButton.isDisplayed());
        String expectedLabel = "Create an Account";
        String actualLabel = luma.createAnAccountHeaderButton.getText();
        Assert.assertEquals(expectedLabel, actualLabel);
    }

    @Then("verify the visibility of the About us button")
    public void verifyTheVisibilityOfTheAboutUsButton() {
        Assert.assertTrue(luma.aboutUdButton.isDisplayed());
    }

    @Then("verify the visibility of the Customer Service button")
    public void verifyTheVisibilityOfTheCustomerServiceButton() {
        Assert.assertTrue(luma.customerServiceButton.isDisplayed());
    }

    @Then("verify the visibility of the Search Terms button")
    public void verifyTheVisibilityOfTheSearchTermsButton() {
        Assert.assertTrue(luma.searchTermsButton.isDisplayed());
    }

    @Then("verify the visibility of the Privacy and Cookie Policy button")
    public void verifyTheVisibilityOfThePrivacyAndCookiePolicyButton() {
        Assert.assertTrue(luma.privacyButton.isDisplayed());
    }

    @Then("verify the visibility  of the Advanced Search button")
    public void verifyTheVisibilityOfTheAdvancedSearchButton() {
        Assert.assertTrue(luma.advencedSearchButton.isDisplayed());
    }

    @Then("verify the visibility of the Orders and Returns button")
    public void verifyTheVisibilityOfTheOrdersAndReturnsButton() {
        Assert.assertTrue(luma.ordersAndReturnsButton.isDisplayed());
    }

    @Then("verify the visibility of the Contact Us button")
    public void verifyTheVisibilityOfTheContactUsButton() {
        Assert.assertTrue(luma.contactUsButton.isDisplayed());
    }

    @Then("verify the visibility of the Subscribe Us button")
    public void verifyTheVisibilityOfTheSubscribeUsButton() {
        Assert.assertTrue(luma.subscribeButton.isDisplayed());
    }

    @And("scroll pagedown")
    public void scrollPagedown() {
        ReusableMethods.jsScroll(luma.aboutUdButton);
    }
}
