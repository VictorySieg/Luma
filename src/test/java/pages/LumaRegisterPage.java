package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class LumaRegisterPage {
    public LumaRegisterPage(){
     PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "firstname")
    public WebElement firstNameInputBox;

    @FindBy(id = "lastname")
    public WebElement lastNameInputBox;

    @FindBy(id = "is_subscribed")
    public WebElement newsletterCheckBox;

    @FindBy(id = "email_address")
    public WebElement emailInputBox;

    @FindBy(id = "password")
    public WebElement passwordInputBox;

    @FindBy(id = "password-confirmation")
    public WebElement confirmPasswordInputBox;

    @FindBy(xpath = "//button[@class='action submit primary']")
    public WebElement createAnAccountButton;

    @FindBy(xpath = "//div[text()='Thank you for registering with Main Website Store.']")
    public WebElement registerSuccessMessage;

    @FindBy(xpath = "//div[@id='firstname-error']")
    public WebElement firstNameWarningMessage;

    @FindBy(xpath = "//div[text()='This is a required field.']")
    public WebElement lastNameWarningMessage;

    @FindBy(xpath = "(//div[@class=\"box-content\"])[2]")
    public WebElement newsletterSubscribedMessage;


    @FindBy(xpath = "(//div[@class=\"box-content\"])[2]")
    public WebElement newsletterNotSubscribedMessage;

    @FindBy(xpath = "//div[@id='email_address-error']")
    public WebElement emailRequiredWarningMessage;

    @FindBy(xpath = "//div[text()='Please enter a valid email address (Ex: johndoe@domain.com).']")
    public WebElement invalidEmailWarningMessage;

    @FindBy(xpath = "//div[@id='password-error']")
    public WebElement passwordRequiredWarningMessage;

    @FindBy(xpath = "//div[@id='password-confirmation-error']")
    public WebElement confirmPasswordWarningMessage;

    @FindBy(xpath = "//div[@id='password-error']")
    public WebElement minLengthOfPasswordWarningMessage;

    @FindBy(xpath = "//div[@id='password-confirmation-error']")
    public WebElement confirmPasswordSameValueMessage;

    @FindBy(xpath = "//span[@class='base']")
    public WebElement createNewCustomerAccountText;

    @FindBy(xpath = "//div[@id='password-error']")
    public WebElement minOfDifferentClassesPasswordWarningMessage;

    @FindBy(xpath = "//span[text()='Personal Information']")
    public WebElement personelInformationText;

    @FindBy(css = "[for=\"firstname\"]")
    public WebElement firstNameText;

    @FindBy(css = "[for=\"lastname\"]")
    public WebElement lastNameText;

    @FindBy(css = "[for=\"email_address\"]")
    public WebElement emailText;

    @FindBy(css = "[for=\"password\"]")
    public WebElement passwordText;

    @FindBy(css = "[for=\"password-confirmation\"]")
    public WebElement confirmPasswordText;

    @FindBy(xpath = "//span[text()='Sign-in Information']")
    public WebElement signinInformationText;

    @FindBy(xpath = "//a[@class='logo']")
    public WebElement lumaLogo;

    @FindBy(css = "[href=\"https://magento.softwaretestingboard.com/what-is-new.html\"]")
    public WebElement whatsNewButton;

    @FindBy(css = "[href=\"https://magento.softwaretestingboard.com/women.html\"]")
    public WebElement womanButton;

    @FindBy(css = "[href=\"https://magento.softwaretestingboard.com/men.html\"]")
    public WebElement manButton;
    @FindBy(css = "[href=\"https://magento.softwaretestingboard.com/gear.html\"]")
    public WebElement gearButton;
    @FindBy(css = "[href=\"https://magento.softwaretestingboard.com/training.html\"]")
    public WebElement trainingButton;

    @FindBy(css = "[href=\"https://magento.softwaretestingboard.com/sale.html\"]")
    public WebElement saleButton;
    @FindBy(css = "[href=\"https://magento.softwaretestingboard.com/checkout/cart/\"]")
    public WebElement shoppingIcon;

    @FindBy(xpath = "(//span[@class=\"not-logged-in\"])[1]")
    public WebElement defaultWelcomeMsgText;

    @FindBy(xpath = "(//a[contains(@href,'customer/account/login/referer/aHR0cHM6L')])[1]")
    public WebElement signInButton;

    @FindBy(xpath = "(//a[@href=\"https://magento.softwaretestingboard.com/customer/account/create/\"])[1]")
    public WebElement createAnAccountHeaderButton;

    @FindBy(css = "[class=\"message-error error message\"]")
    public WebElement sameEmailWarningMessage;

    @FindBy(id = "password-strength-meter")
    public WebElement strengthPassword;

    @FindBy(css = "[class=\"password-strong\"]")
    public WebElement strongPasswordMessage;

    @FindBy(css = "[class=\"password-very-strong\"]")
    public WebElement veryStrongPasswordMessage;

    @FindBy(css = "[class=\"password-medium\"]")
    public WebElement mediumPasswordMessage;

    @FindBy(xpath = "(//button[@type=\"button\"])[1]")
    public WebElement signOutSymbol;

    @FindBy(xpath = "(//li[@class=\"authorization-link\"])[1]")
    public WebElement signOutButton;

    @FindBy(xpath = "(//a[text()='Create an Account'])[1]")
    public WebElement createAnAccountAbove;

    @FindBy(css = "[href=\"https://magento.softwaretestingboard.com/about-us/\"]")
    public WebElement aboutUdButton;

    @FindBy(css = "[href=\"https://magento.softwaretestingboard.com/customer-service/\"]")
    public WebElement customerServiceButton;

    @FindBy(css = "[href=\"https://magento.softwaretestingboard.com/search/term/popular/\"]")
    public WebElement searchTermsButton;

    @FindBy(css = "[href=\"https://magento.softwaretestingboard.com/privacy-policy-cookie-restriction-mode/\"]")
    public WebElement privacyButton;


    @FindBy(xpath = "(//a[@data-action=\"advanced-search\"])[2]")
    public WebElement advencedSearchButton;

    @FindBy(css = "[href=\"https://magento.softwaretestingboard.com/sales/guest/form/\"]")
    public WebElement ordersAndReturnsButton;


    @FindBy(css = "[href=\"https://magento.softwaretestingboard.com/contact/\"]")
    public WebElement contactUsButton;

    @FindBy(xpath = "//button[@class=\"action subscribe primary\"]")
    public WebElement subscribeButton;


}