package Utility;

import TestBase.WebTestBase;
import io.netty.handler.codec.http.multipart.FileUpload;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

public class DriverUtility extends WebTestBase {
    public static final long PAGE_LOAD_TIME = 20;

    public static final long IMPLICITLY_WAIT = 20;

    public static final long EXPLICIT_WAIT = 20;

    public static WebDriverWait wait;

    public static JavascriptExecutor javascriptExecutor;

    public  static Actions actions;
    public static Select select;
  //  Actions actions = new Actions(driver);

   // TakesScreenshot scrShot = ((TakesScreenshot) driver);

    public static void waitUntilElementToBeClickable(WebElement element) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public static String getTextOfElement(WebElement element) {

        return element.getText();
    }

    public static void ScrollDownByVisibleElement(WebElement element) {
        javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void MovusHoverOnOurStory(WebElement element) {

        actions.contextClick(element).build().perform();
    }


    public void DoubleclickOnWholesale(WebElement element) {
        actions.doubleClick(element).perform();
    }


    public boolean isDisplayedOnCampusCoffeePage(WebElement element) {
        return element.isDisplayed();
    }

    public Boolean isEnabledOnLogoutBtn(WebElement element) {
        return element.isEnabled();
    }

    public void ClickOnRememberBox(WebElement element) {
        actions.contextClick(element).build().perform();
    }

    public boolean isSelectedRememberBox(WebElement element) {
        return element.isSelected();
    }

    public boolean isEmailCheckboxSelected(WebElement element) {
        return element.isSelected();
    }


    public static void TakeScreenshot() throws IOException {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file, new File(System.getProperty("user.dir") + "/src/main/resources/Screenshot.exe"));
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public static String dropdownSelection(String visibleText, WebElement element) {
        select = new Select(element);
        select.selectByVisibleText(visibleText);
        return visibleText;
    }
}