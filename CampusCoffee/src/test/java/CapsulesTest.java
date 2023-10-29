import Pages.CapsulesPage;
import Pages.HomePage;
import TestBase.WebTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CapsulesTest extends WebTestBase {
    public HomePage homePage;

    public CapsulesPage capsulesPage;

    CapsulesTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        homePage = new HomePage();
        capsulesPage = new CapsulesPage();
    }

    @Test
    public void VerifySelectDropDown() {
        SoftAssert softAssert = new SoftAssert();
       // homePage.closeFirstAd();
        homePage.closeSecondAd();
        homePage.MovusHover();
        homePage.ClickOnCapsules();
        capsulesPage.closead();
        capsulesPage.dropdown();
        softAssert.assertAll();
    }
}
