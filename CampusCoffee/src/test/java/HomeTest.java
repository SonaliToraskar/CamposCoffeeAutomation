import Pages.HomePage;
import TestBase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomeTest  extends WebTestBase {

    public HomePage homePage;

    HomeTest() {

        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        homePage = new HomePage();
    }

    @Test
    public void VerifyMovusHoverActionOnOurStory() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.closeSecondAd();
        homePage.MovusRightClicksaction();
        softAssert.assertAll();
    }


    @Test
    public void VerifyScrollingDownPage() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.closeSecondAd();
        homePage.ScrollingDown();
        softAssert.assertAll();
    }

    @Test
    public void VerifyDoubleClickONWholesale() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.closeSecondAd();
        homePage.DoubleclickOnWholesale();
        softAssert.assertAll();
    }
 @Test
    public void VerifyIsDisplayedTextOfElement() throws InterruptedException {
     SoftAssert softAssert = new SoftAssert();
     homePage.closeFirstAd();
     homePage.closeSecondAd();
     homePage.IsDisplayedOnHomepage();
     softAssert.assertAll();
 }

 @Test
 public void verifyNewsPageTitle() throws InterruptedException {
     SoftAssert softAssert = new SoftAssert();
     //homePage.closeFirstAd();
     homePage.closeSecondAd();
     homePage.GetHomepageTitle();
     softAssert.assertAll();
 }


}