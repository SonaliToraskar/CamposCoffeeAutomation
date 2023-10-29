package Pages;

import TestBase.WebTestBase;
import Utility.DriverUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.lang.model.element.Element;
import javax.xml.xpath.XPath;

public class HomePage extends WebTestBase {
    @FindBy(xpath = "//a[@class='user-controls__ul__li__a']")
    WebElement loginElement;

    @FindBy(xpath = "//button[@title ='Close']")
    WebElement closedFristad;

    @FindBy(xpath = "//a[@class = 'newsletter__close newsletter__trigger']")
    WebElement closedSecondad;

    @FindBy(xpath = "//a[text()='Our Story']")
    WebElement MovusHoverOnOurStory;

    @FindBy(xpath = "//s[@class='search__label']")
    WebElement SerachClick;

    @FindBy(xpath = "//div[@class='footer__information__site-title']")
    WebElement CampusCoffee;

    @FindBy(xpath = "//*[@id=\"input_13_1\"]")
    WebElement EmailIdBox;

    @FindBy(xpath = "//*[@id=\"gform_submit_button_13\"]")
    WebElement SubmitButton;

    @FindBy(xpath = "//*[text()=\"Wholesale\"][1]")
    WebElement Wholesale;

    @FindBy(xpath = " //*[text()=\"Scratch For Your Instant Surprise!\"]")
    WebElement ScratchForYourInstantSurprise;

    @FindBy(xpath = "//*[text()=\"News\"]")
    WebElement newselement;
    @FindBy(xpath = "//*[contains(text(), 'Shop, Scratch, and Win With Campos!')]")
    WebElement HomepageTitle;

    @FindBy(xpath = " //*[@type='email'][1]")
    WebElement EmailLogin;

    @FindBy(xpath = "//*[@id='gform_submit_button_13']")
    WebElement SubmitBtn;

    @FindBy(xpath = "//a[text()=\"Shop\"]")
    WebElement ShopBtn;

    @FindBy(xpath = "//a[text()=\"Capsules\"]")
    WebElement Capsules;
    public HomePage() {

        PageFactory.initElements(driver, this);
    }

    public void closeFirstAd() {
        DriverUtility.waitUntilElementToBeClickable(closedFristad);
    }

    public void closeSecondAd() {
        DriverUtility.waitUntilElementToBeClickable(closedSecondad);
    }

    public void clickOnLoginBtn() {
        DriverUtility.waitUntilElementToBeClickable(loginElement);
    }

    public void MovusRightClicksaction() {
        DriverUtility.waitUntilElementToBeClickable(MovusHoverOnOurStory);
    }

    public void DoubleclickOnWholesale() {
        DriverUtility.waitUntilElementToBeClickable(Wholesale);
    }

    public void ScrollingDown() {
        DriverUtility.ScrollDownByVisibleElement(CampusCoffee);

    }
    public void MovusHover(){ DriverUtility.waitUntilElementToBeClickable(ShopBtn);}

    public void ClickOnCapsules(){ DriverUtility.waitUntilElementToBeClickable(Capsules);}
    public void IsDisplayedOnHomepage() {
        DriverUtility.getTextOfElement(ScratchForYourInstantSurprise);
    }

    public void GetHomepageTitle() {
        DriverUtility.getTextOfElement(HomepageTitle);

        }
    }