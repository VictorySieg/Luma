package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.LumaRegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_002_EmailStepDef {
    LumaRegisterPage luma = new LumaRegisterPage();
    Faker faker = new Faker();
    Actions action = new Actions(Driver.getDriver());



    @And("fill the form with valid First Name, Last Name, Password and Confirm Password test date except email")
    public void fillTheFormWithValidFirstNameLastNamePasswordAndConfirmPasswordTestDateExceptEmail() {
        luma.firstNameInputBox.sendKeys("Max");
        luma.lastNameInputBox.sendKeys("Mustermann");
        luma.passwordInputBox.sendKeys("Aa123456");
        luma.confirmPasswordInputBox.sendKeys("Aa123456");
    }

    @And("click on the Create an Account button")
    public void clickOnTheCreateAnAccountButton() {
       // ReusableMethods.jsScrollClick(luma.createAnAccountButton);
        luma.createAnAccountButton.click();
    }

    @Then("verify that the email required and the warning message under the Email inputbox")
    public void verifyThatTheEmailRequiredAndTheWarningMessageUnderTheEmailInputbox() {
        String expectedText="This is a required field.";
        String actualText=luma.emailRequiredWarningMessage.getText();
        Assert.assertTrue(actualText.equals(expectedText));
    }
    @And("enter an email that has a word without {string} and {string} signs in the Email inputbox")
    public void enterAnEmailThatHasAWordWithoutAndSignsInTheEmailInputbox(String arg0, String arg1) {

        luma.emailInputBox.sendKeys("maxMustermann");
    }

    @Then("verify the warning message under the Email inputbox")
    public void verifyTheWarningMessageUnderTheEmailInputbox() {
        String expectedText="Please enter a valid email address (Ex: johndoe@domain.com).";
        String actualText=luma.invalidEmailWarningMessage.getText();
        Assert.assertTrue(actualText.equals(expectedText));
    }
    @And("type an email that has a word with {string} but without {string} sign in the Email inputbox")
    public void typeAnEmailThatHasAWordWithButWithoutSignInTheEmailInputbox(String arg0, String arg1) {
        luma.emailInputBox.sendKeys("maxMustermann.");
    }
    @And("type an email that a word with {string} extension in the Email inputbox")
    public void typeAnEmailThatHasAnyCharOrWordWithExtensionInTheEmailInputbox(String arg0) {
        luma.emailInputBox.sendKeys("maxMustermann@");
    }

    @And("type an email that has one letter before the {string} sign in the Email inputbox")
    public void typeAnEmailThatHasOneLetterBeforeTheSignInTheEmailInputbox(String arg0) {
        luma.emailInputBox.sendKeys("a@gmail.com");

    }
    @And("enter  an email that has a number before the {string} sign in the Email inputbox")
    public void enterAnEmailThatHasANumberBeforeTheSignInTheEmailInputbox(String arg0) {
        luma.emailInputBox.sendKeys("1@gmail.com");
    }

    @And("type an email that has nothing before the {string} sign in the Email inputbox")
    public void typeAnEmailThatHasNothingBeforeTheSignInTheEmailInputbox(String arg0) {
        luma.emailInputBox.sendKeys("@gmail.com");

    }
    @And("type an email that has a special character before the {string} sign in the Email inputbox")
    public void typeAnEmailThatHasASpecialCharacterBeforeTheSignInTheEmailInputbox(String arg0) {
        luma.emailInputBox.sendKeys("?@gmail.com");

    }

    @And("type an email that has a letter between the {string} and the {string} sign in the Email inputbox")
    public void typeAnEmailThatHasALetterBetweenTheAndTheSignInTheEmailInputbox(String arg0, String arg1) {
        luma.emailInputBox.sendKeys("maxMustermann@a.com");
    }

    @And("type an email that has a number between the {string} and the {string} sign in the Email inputbox")
    public void typeAnEmailThatHasANumberBetweenTheAndTheSignInTheEmailInputbox(String arg0, String arg1) {
        luma.emailInputBox.sendKeys("maxMustermann@1.com");
    }
    @And("type an email that has nothing between the {string} and the {string} sign in the Email inputbox")
    public void typeAnEmailThatHasNothingBetweenTheAndTheSignInTheEmailInputbox(String arg0, String arg1) {
        luma.emailInputBox.sendKeys("maxMustermann@.com");
    }
    @And("type an email that has a special character between the {string} and the {string} sign in the Email inputbox")
    public void typeAnEmailThatHasASpecialCharacterBetweenTheAndTheSignInTheEmailInputbox(String arg0, String arg1) {
        luma.emailInputBox.sendKeys("maxMustermann@?.com");
    }



    @And("type an email that has one letter after the {string} sign in the Email inputbox")
    public void typeAnEmailThatHasOneLetterAfterTheSignInTheEmailInputbox(String arg0) {
        luma.emailInputBox.sendKeys("maxMustermann@gmail.c");
    }

    @And("type an email that has two letter after the {string} sign in the Email inputbox")
    public void typeAnEmailThatHasTwoLetterAfterTheSignInTheEmailInputbox(String arg0) {
        luma.emailInputBox.sendKeys("maxMustermann@gmail.co");
    }
    @And("type an email that has numbers after the {string} sign in the Email inputbox")
    public void typeAnEmailThatHasNumbersAfterTheSignInTheEmailInputbox(String arg0) {
        luma.emailInputBox.sendKeys("maxMustermann@gmail.11");
    }



    @And("type an email that has special character after the {string} sign in the Email inputbox")
    public void typeAnEmailThatHasSpecialCharacterAfterTheSignInTheEmailInputbox(String arg0) {
        luma.emailInputBox.sendKeys("maxMustermann@gmail.??");
    }


    @Then("verify that the warning message doesnt appear under the {string} inputbox")
    public void verifyThatTheWarningMessageDoesntAppearUnderTheInputbox(String arg0) {
        luma.firstNameInputBox.sendKeys("Max");
        luma.lastNameInputBox.sendKeys("Mustermann");
        luma.passwordInputBox.sendKeys("Aa123456");
        luma.confirmPasswordInputBox.sendKeys("Aa123456"+ Keys.ENTER);

        ReusableMethods.waitForVisibility(luma.sameEmailWarningMessage,10);
        String expectedText="There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.";
        String actualText=luma.sameEmailWarningMessage.getText();
        Assert.assertEquals(expectedText, actualText);


    }

    String email = faker.internet().emailAddress();
    @And("fill the form with valid datas and register")
    public void fillTheFormWithValidDatasAndRegister() {
        luma.firstNameInputBox.sendKeys("Max");
        luma.lastNameInputBox.sendKeys("Mustermann");

        luma.emailInputBox.sendKeys(email);
        luma.passwordInputBox.sendKeys("Aa123456");
        luma.confirmPasswordInputBox.sendKeys("Aa123456");
        luma.createAnAccountButton.click();

    }

    @And("log out of account")
    public void logOutOfAccount() {
        luma.signOutSymbol.click();
        luma.signOutButton.click();

    }

    @And("fill the form with valid datas and same email")
    public void fillTheFormWithValidDatasAndSameEmail() {
        luma.firstNameInputBox.sendKeys("Max");
        luma.lastNameInputBox.sendKeys("Mustermann");

        luma.emailInputBox.sendKeys(email);
        luma.passwordInputBox.sendKeys("Aa123456");
        luma.confirmPasswordInputBox.sendKeys("Aa123456");
    }



    @Then("verify the same email warning message under the {string} inputbox")
    public void verifyTheSameEmailWarningMessageUnderTheInputbox(String arg0) {
        ReusableMethods.waitForVisibility(luma.sameEmailWarningMessage, 3);
        Assert.assertTrue(luma.sameEmailWarningMessage.isDisplayed());
    }


    @And("click on Create an Account button")
    public void clickOnCreateAnAccountButton() {
        luma.createAnAccountAbove.click();
    }
}
