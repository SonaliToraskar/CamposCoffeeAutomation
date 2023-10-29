package TestBase;

import Utility.DriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class WebTestBase {

    public static Properties prop;

    public static WebDriver driver;

    public WebTestBase(){
        FileInputStream fileInputStream =  null;
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/Config/Config.Properties");
        }catch (Exception e){
            e.printStackTrace();
        }
        prop = new Properties();
        try {
            prop.load(fileInputStream);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void initialization(){
        String browserName = prop.getProperty("browserName");
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"/src/main/resources/Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"src/main/resources/Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+ "src/main/resources/Drivers/msedgedriver.exe");
            driver = new EdgeDriver();
            throw new RuntimeException("Please select the correct browser");
        }

        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(DriverUtility.PAGE_LOAD_TIME ));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DriverUtility.IMPLICITLY_WAIT ));
    }
}
