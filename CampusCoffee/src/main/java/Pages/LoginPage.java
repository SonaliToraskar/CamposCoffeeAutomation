package Pages;

import TestBase.WebTestBase;
import Utility.DriverUtility;
import org.checkerframework.framework.qual.DefaultQualifier;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.lang.model.element.Element;
import java.util.List;

public class LoginPage extends WebTestBase {
    @FindBy(id = "username")
    WebElement userNameTextBox;

    @FindBy(id = "password")
    WebElement passwordTextBox;

    @FindBy(name = "login")
    WebElement loginBtn;

    @FindBy(xpath = "")
    List<WebElement> allElements;

    @FindBy(xpath = "//H2")
    WebElement LOGIN;

    @FindBy(xpath = "//*[@class=\"woocommerce-Button button\"]")
    WebElement LOGINBtn;

    @FindBy(xpath = "//*[@class='woocommerce-Input woocommerce-Input--checkbox']")
    WebElement CheckBox;

    @FindBy(xpath = "//*[contains(@class, 'inline')]")
    WebElement RememberMe;

    @FindBy(xpath = " //*[@type='email'][1]")
    WebElement EmailLogin;

    @FindBy(xpath = " name=\"input_1\"")
    WebElement Emailbox;
    @FindBy(xpath = "//*[@id='gform_submit_button_13']")
    WebElement SubmitBtn;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password) {
        userNameTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);
        DriverUtility.waitUntilElementToBeClickable(loginBtn);


    }

    public void IsEnabledOnLogIn() {
        DriverUtility.waitUntilElementToBeClickable(LOGINBtn);
    }

    public void ClickableOnCheckBox() {
        DriverUtility.waitUntilElementToBeClickable(CheckBox);
    }

    public void IsSelectedOnRemember() {
        DriverUtility.waitUntilElementToBeClickable(RememberMe);
    }


    }


