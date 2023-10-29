import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import TestBase.WebTestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import javax.lang.model.element.Element;

public class LoginTest extends WebTestBase {

    public HomePage homePage;
    public LoginPage loginPage;

    public MyAccountPage myAccountPage;

    LoginTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
    }

    @Test
    public void verifyLoginWithValidUsernameAndPassword() {
        SoftAssert softAssert = new SoftAssert();
      //homePage.closeFirstAd();
        homePage.closeSecondAd();
        homePage.clickOnLoginBtn();
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        String MyAccountPageText = myAccountPage.textOfMyAccount();
        softAssert.assertEquals(MyAccountPageText,"My Account","Text should be matched here");
        softAssert.assertAll();
}
    @Test
    public void VerifyIsEnabledOnLogIn() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.closeSecondAd();
        homePage.clickOnLoginBtn();
        loginPage.IsEnabledOnLogIn();
        softAssert.assertAll();
    }

    @Test
    public void VerifyIsSelectedRememberBox() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.closeSecondAd();
        homePage.clickOnLoginBtn();
        loginPage.ClickableOnCheckBox();
        loginPage.IsSelectedOnRemember();
        softAssert.assertAll();
    }


}