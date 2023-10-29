package Pages;

import TestBase.WebTestBase;
import Utility.DriverUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class MyAccountPage extends WebTestBase {

    @FindBy(xpath = "//*[contains(@class, 'account-title')]")
    WebElement MyAccountText;

    @FindBy(xpath = " //*[@type='email'][1]")
    WebElement EmailLogin;

    @FindBy(xpath = "//*[@id='gform_submit_button_13']")
    WebElement SubmitBtn;
    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public String textOfMyAccount() {
        return DriverUtility.getTextOfElement(MyAccountText);
    }

    public void EmailLogin(String emailLoginTextBox) {
        EmailLogin.sendKeys(emailLoginTextBox);
        DriverUtility.waitUntilElementToBeClickable(SubmitBtn);
    }
}