package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.LumaRegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_001_NameStepDef {
    LumaRegisterPage luma = new LumaRegisterPage();
    Faker faker = new Faker();
    Actions action = new Actions(Driver.getDriver());

    @Given("visit the Create New Customer Account page")
    public void visitTheCreateNewCustomerAccountPage() {
        Driver.getDriver().get(ConfigReader.getProperty("lumaRegisterPage"));
    }

    @When("Fill the form with valid new customer data and do not check the {string} checkbox")
    public void fillTheFormWithValidNewCustomerDataAndDoNotCheckTheCheckbox(String arg0) {

        luma.firstNameInputBox.sendKeys("Max");
        luma.lastNameInputBox.sendKeys("Mustermann");
        String email = faker.internet().emailAddress();
        luma.emailInputBox.sendKeys(email);
        luma.passwordInputBox.sendKeys("Aa123456");
        luma.confirmPasswordInputBox.sendKeys("Aa123456");

    }
    @When("Fill the form with valid new customer data")
    public void fillTheFormWithValidNewCustomerData() {

        luma.firstNameInputBox.sendKeys("Max");
        luma.lastNameInputBox.sendKeys("Mustermann");
        String email = faker.internet().emailAddress();
        luma.emailInputBox.sendKeys(email);
        luma.passwordInputBox.sendKeys("Aa123456");
        luma.confirmPasswordInputBox.sendKeys("Aa123456");

    }
    @And("check the Sign Up for Newsletter checkbox")
    public void checkTheSignUpForNewsletterCheckbox() {
        luma.newsletterCheckBox.click();
    }


    @Then("Then Verify that system navigates to {string} page and the message is visible on the page.")
    public void thenVerifyThatSystemNavigatesToPageAndTheMessageIsVisibleOnThePage(String arg0) {

        ReusableMethods.waitForVisibility(luma.registerSuccessMessage,10);
        String expectedText="Thank you for registering with Main Website Store.";
        String actualText=luma.registerSuccessMessage.getText();
        Assert.assertTrue(actualText.equals(expectedText));
    }

    @And("fill the form with valid Last Name, Email, Password and Confirm Password test data except first name.")
    public void fillTheFormWithValidLastNameEmailPasswordAndConfirmPasswordTestDataExceptFirstName() {
        luma.lastNameInputBox.sendKeys("Mustermann");
        String email = faker.internet().emailAddress();
        luma.emailInputBox.sendKeys(email);
        luma.passwordInputBox.sendKeys("Aa123456");
        luma.confirmPasswordInputBox.sendKeys("Aa123456");
    }
    @Then("verify that there is the warning message under the First Name inputbox")
    public void verifyThatThereIsTheWarningMessageUnderTheFirstNameInputbox() {
        String expectedText="This is a required field.";
        String actualText=luma.firstNameWarningMessage.getText();
        Assert.assertTrue(actualText.equals(expectedText));
    }


    @And("fill the form with valid First Name, Email, Password and Confirm Password test data except last name.")
    public void fillTheFormWithValidFirstNameEmailPasswordAndConfirmPasswordTestDataExceptLastName() {
        luma.firstNameInputBox.sendKeys("Max");
        String email = faker.internet().emailAddress();
        luma.emailInputBox.sendKeys(email);
        luma.passwordInputBox.sendKeys("Aa123456");
        luma.confirmPasswordInputBox.sendKeys("Aa123456");
    }
    @Then("verify the warning message under the Last Name inputbox")
    public void verifyTheWarningMessageUnderTheLastNameInputbox() {
        String expectedText="This is a required field.";
        String actualText=luma.lastNameWarningMessage.getText();
        Assert.assertTrue(actualText.equals(expectedText));
    }

    @Then("verify that {string}General Subscription{string} message is visible under the Newsletter section.")
    public void verifyThatGeneralSubscriptionMessageIsVisibleUnderTheNewsletterSection(String arg0, String arg1) {
        ReusableMethods.waitForVisibility(luma.registerSuccessMessage,10);
        String expectedText="You are subscribed to \"General Subscription\".";
        String actualText=luma.newsletterSubscribedMessage.getText();
        Assert.assertTrue(actualText.equals(expectedText));
    }

    @Then("verify that {string} message is visible under the Newsletter section.")
    public void verifyThatMessageIsVisibleUnderTheNewsletterSection(String arg0) {
        String expectedText="You aren't subscribed to our newsletter.";
        String actualText=luma.newsletterNotSubscribedMessage.getText();
        Assert.assertTrue(actualText.equals(expectedText));

    }



    @Then("verify the visibility, clickability and redirect link of the LUMA icon")
    public void verifyTheVisibilityClickabilityAndRedirectLinkOfTheLUMAIcon() {
        Assert.assertTrue(luma.lumaLogo.isDisplayed());

    }


    @And("close driver")
    public void closeDriver() {
        Driver.closeDriver();
    }
}
