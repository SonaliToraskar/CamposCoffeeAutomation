package Pages;

import TestBase.WebTestBase;
import Utility.DriverUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CapsulesPage extends WebTestBase {
    @FindBy(xpath = "//*[@class=\"sort-select\"]")
    WebElement SortByDropdown;

    @FindBy(xpath = "//*[@id=\"body\"]/header/div/nav/nav/ul/li[4]/div/a")
    WebElement closead;
    WebElement capsulesText;

    public CapsulesPage() {
        PageFactory.initElements(driver, this);
    }
    public void closead(){
        DriverUtility.waitUntilElementToBeClickable(closead);}
    public void dropdown() {
        DriverUtility.dropdownSelection("Latest", SortByDropdown);
    }



}