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

public class US_003_PasswordStepDef {
    LumaRegisterPage luma = new LumaRegisterPage();
    Faker faker = new Faker();
    Actions action = new Actions(Driver.getDriver());

    @Then("verify that the password is confirmed")
    public void verifyThatThePasswordIsConfirmed() {
        ReusableMethods.waitForVisibility(luma.registerSuccessMessage,10);
        Assert.assertTrue(luma.registerSuccessMessage.isDisplayed());
    }

    @And("fill the form with valid First Name, Last Name, Email and Confirm Password test data except password")
    public void fillTheFormWithValidFirstNameLastNameEmailAndConfirmPasswordTestDataExceptPassword() {

        luma.firstNameInputBox.sendKeys("Max");
        luma.lastNameInputBox.sendKeys("Mustermann");
        String email = faker.internet().emailAddress();
        luma.emailInputBox.sendKeys(email);
        luma.confirmPasswordInputBox.sendKeys("Aa123456");
    }

    @Then("verify the warning message under the Password inputbox")
    public void verifyTheWarningMessageUnderThePasswordInputbox() {
        String expectedText="This is a required field.";
        String actualText=luma.passwordRequiredWarningMessage.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @And("fill the form with valid First Name, Last Name, Email and Password test data except confirm password")
    public void fillTheFormWithValidFirstNameLastNameEmailAndPasswordTestDataExceptConfirmPassword() {
        luma.firstNameInputBox.sendKeys("Max");
        luma.lastNameInputBox.sendKeys("Mustermann");
        String email = faker.internet().emailAddress();
        luma.emailInputBox.sendKeys(email);
        luma.passwordInputBox.sendKeys("Aa123456");

    }
    @Then("verify the warning message under the Confirm Password inputbox")
    public void verifyTheWarningMessageUnderTheConfirmPasswordInputbox() {
        String expectedText="This is a required field.";
        String actualText=luma.confirmPasswordWarningMessage.getText();
        Assert.assertTrue(actualText.equals(expectedText));
    }

    @And("type one number in Password inputbox")
    public void typeOneNumberInPasswordInputbox() {
        luma.passwordInputBox.sendKeys("1");
    }
    @Then("verify the minimum length warning message under the Password inputbox")
    public void verifyTheMinimumLengthWarningMessageUnderThePasswordInputbox() {
        String expectedText="Minimum length of this field must be equal or greater than 8 symbols. Leading and trailing spaces will be ignored.";
        String actualText=luma.minLengthOfPasswordWarningMessage.getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @And("type {int} numbers in Password inputbox")
    public void typeNumbersInPasswordInputbox(int arg0) {
        luma.passwordInputBox.sendKeys("1234567");
    }
    @And("click the Password inputbox and press {int} times the space key and type {int} more numbers")
    public void clickThePasswordInputboxAndPressTimesTheSpaceKeyAndTypeMoreNumbers(int arg0, int arg1) {
        luma.passwordInputBox.sendKeys("  1234567"+ Keys.ENTER);
    }


    @And("click the Password inputbox and type {int} numbers and press {int} times the space key")
    public void clickThePasswordInputboxAndTypeNumbersAndPressTimesTheSpaceKey(int arg0, int arg1) {
        luma.passwordInputBox.sendKeys("1234567  "+Keys.ENTER);

    }

    @And("type one number then give a space then type {int} more numbers in Password inputbox")
    public void typeOneNumberThenGiveASpaceThenTypeMoreNumbersInPasswordInputbox(int arg0) {

        //  luma.passwordInputBox.sendKeys("1"+Keys.SPACE+"234567");
        luma.passwordInputBox.sendKeys("1 234567"+Keys.ENTER);

    }

    @And("type eight numbers in Password inputbox")
    public void typeEightNumbersInPasswordInputbox() {
        luma.passwordInputBox.sendKeys("12345678");
        luma.passwordInputBox.sendKeys(Keys.ENTER);
    }
    @Then("verify the minimum of different classes of character warning message under the Password inputbox")
    public void verifyTheMinimumOfDifferentClassesOfCharacterWarningMessageUnderThePasswordInputbox() {
        String expectedText="Minimum of different classes of characters in password is 3. Classes of characters: Lower Case, Upper Case, Digits, Special Characters.";
        String actualText=luma.minOfDifferentClassesPasswordWarningMessage.getText();
        Assert.assertTrue(actualText.equals(expectedText));
    }
    @And("clear the password inputbox")
    public void clearThePasswordInputbox() {
        luma.passwordInputBox.clear();
    }
    @And("type eight letter in lower case in Password inputbox")
    public void typeEightLetterInLowerCaseInPasswordInputbox() {
        luma.passwordInputBox.sendKeys("asasasas");
    }

    @And("type eight letter in upper case in Password inputbox")
    public void typeEightLetterInUpperCaseInPasswordInputbox() {
        luma.passwordInputBox.sendKeys("ASASASAS");
    }

    @And("type eight special characters in Password inputbox")
    public void typeEightSpecialCharactersInPasswordInputbox() {
        luma.passwordInputBox.sendKeys("?!?!?!?!");
    }
    @And("And type one letter in upper case and {int} letters in lower case in Password inputbox")
    public void andTypeOneLetterInUpperCaseAndLettersInLowerCaseInPasswordInputbox(int arg0) {
        luma.passwordInputBox.sendKeys("Asasasas");
        luma.passwordInputBox.sendKeys(Keys.ENTER);
    }

    @And("type one number and {int} letters in lower case in Password inputbox")
    public void typeOneNumberAndLettersInLowerCaseInPasswordInputbox(int arg0) {
        luma.passwordInputBox.sendKeys("1sasasas");
    }

    @And("type one number and {int} letters in upper case in Password inputbox")
    public void typeOneNumberAndLettersInUpperCaseInPasswordInputbox(int arg0) {
        luma.passwordInputBox.sendKeys("1ASASASA");
    }

    @And("type one letter in lower case and {int} special characters in Password inputbox")
    public void typeOneLetterInLowerCaseAndSpecialCharactersInPasswordInputbox(int arg0) {
        luma.passwordInputBox.sendKeys("a?!?!?!?");
    }

    @And("type one special character letter and {int} numbers in Password inputbox")
    public void typeOneSpecialCharacterLetterAndNumbersInPasswordInputbox(int arg0) {
        luma.passwordInputBox.sendKeys("?1234567");
    }

    @And("type one letter in upper case and {int} special characters in Password inputbox")
    public void typeOneLetterInUpperCaseAndSpecialCharactersInPasswordInputbox(int arg0) {
        luma.passwordInputBox.sendKeys("A?!?!?!?");
    }
    @And("type one letter in upper case, one letter in lower and {int} number in Password inputbox")
    public void typeOneLetterInUpperCaseOneLetterInLowerAndNumberInPasswordInputbox(int arg0) {
        luma.passwordInputBox.sendKeys("Aa123456");
        luma.firstNameInputBox.sendKeys("Max");
        luma.lastNameInputBox.sendKeys("Mustermann");
        String email = faker.internet().emailAddress();
        luma.emailInputBox.sendKeys(email);
        luma.confirmPasswordInputBox.sendKeys("Aa123456");
        luma.passwordInputBox.sendKeys(Keys.ENTER);
    }
    @And("type one special character, one letter in lower case and {int} number in Password inputbox")
    public void typeOneSpecialCharacterOneLetterInLowerCaseAndNumberInPasswordInputbox(int arg0) {
        luma.passwordInputBox.sendKeys("?a123456");
        luma.firstNameInputBox.sendKeys("Max");
        luma.lastNameInputBox.sendKeys("Mustermann");
        String email = faker.internet().emailAddress();
        luma.emailInputBox.sendKeys(email);
        luma.confirmPasswordInputBox.sendKeys("?a123456");
        luma.passwordInputBox.sendKeys(Keys.ENTER);
    }
    @And("type one letter in upper case, one letter in lower case and {int} special characters in Password inputbox")
    public void typeOneLetterInUpperCaseOneLetterInLowerCaseAndSpecialCharactersInPasswordInputbox(int arg0) {
        luma.passwordInputBox.sendKeys("Aa?!?!?!?");
        luma.firstNameInputBox.sendKeys("Max");
        luma.lastNameInputBox.sendKeys("Mustermann");
        String email = faker.internet().emailAddress();
        luma.emailInputBox.sendKeys(email);
        luma.confirmPasswordInputBox.sendKeys("Aa?!?!?!?");
        luma.passwordInputBox.sendKeys(Keys.ENTER);
    }
    @And("type one letter in upper case, one special character and {int} number in Password inputbox")
    public void typeOneLetterInUpperCaseOneSpecialCharacterAndNumberInPasswordInputbox(int arg0) {
        luma.passwordInputBox.sendKeys("A?123456");
    }

    @And("type one special character, one letter in lower case, one letter in upper case and {int} number in Password inputbox")
    public void typeOneSpecialCharacterOneLetterInLowerCaseOneLetterInUpperCaseAndNumberInPasswordInputbox(int arg0) {
        luma.passwordInputBox.sendKeys("?aA12345");
    }

    @And("type a valid password in Password inputbox and a different password in Confirm Password inputbox")
    public void typeAValidPasswordInPasswordInputboxAndADifferentPasswordInConfirmPasswordInputbox() {
        luma.passwordInputBox.sendKeys("Aa?12345");
        luma.confirmPasswordInputBox.sendKeys("As?122333"+Keys.ENTER);

    }
    @Then("verify the warning message for same value under the Confirm Password inputbox")
    public void verifyTheWarningMessageForSameValueUnderTheConfirmPasswordInputbox() {
        String expectedText="Please enter the same value again.";
        String actualText=luma.confirmPasswordSameValueMessage.getText();
        Assert.assertEquals(expectedText, actualText);
    }




    @Then("verify that the password strength is medium")
    public void verifyThatThePasswordStrengthIsMedium() {
        String expectedText="Password Strength: Medium";
        String actualText=luma.strengthPassword.getText();
        Assert.assertEquals(expectedText, actualText);
    }


    @Then("verify that the password strength is strong")
    public void verifyThatThePasswordStrengthIsStrong() {
        String expectedText="Password Strength: Strong";
        String actualText=luma.strengthPassword.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Then("verify that the password strength is very strong")
    public void verifyThatThePasswordStrengthIsVeryStrong() {
        String expectedText="Password Strength: Very Strong";
        String actualText=luma.strengthPassword.getText();
        Assert.assertEquals(expectedText, actualText);
    }


    @And("type the {string} in Password inputbox")
    public void typeTheInPasswordInputbox(String password) throws InterruptedException {

        luma.passwordInputBox.sendKeys(password);

    }

    @Then("verify that the password strength is {string}")
    public void verifyThatThePasswordStrengthIs(String strength) throws InterruptedException {

        String actualStrength =luma.strengthPassword.getText();
        luma.confirmPasswordInputBox.click();
        Assert.assertEquals(strength, actualStrength);
    }


    @And("type the password {string} for medium strength in Password inputbox")
    public void typeThePasswordForMediumStrengthInPasswordInputbox(String arg0) throws InterruptedException {

        luma.passwordInputBox.sendKeys("ABha13?=");
        luma.confirmPasswordInputBox.click();
        ReusableMethods.waitForVisibility(luma.mediumPasswordMessage, 10);
    }

    @And("type the password {string} for strong strength in Password inputbox")
    public void typeThePasswordForStrongStrengthInPasswordInputbox(String arg0) {

        luma.passwordInputBox.sendKeys("Abbbbbb44");
        luma.confirmPasswordInputBox.click();
        ReusableMethods.waitForVisibility(luma.strongPasswordMessage, 10);
    }

    @And("type the password {string} for very strong strength in Password inputbox")
    public void typeThePasswordForVeryStrongStrengthInPasswordInputbox(String arg0) throws InterruptedException {

        luma.passwordInputBox.sendKeys("AAAbbb222???");
        Thread.sleep(100);
        luma.confirmPasswordInputBox.click();
        ReusableMethods.waitForVisibility(luma.veryStrongPasswordMessage, 10);
    }
}