package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class BrowserHandler {

    protected static WebDriver driver;
    public  static WebDriver initialize(String browser) {
        try { if(browser.equalsIgnoreCase("chrome"))
            {
                System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver");
                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
                driver.manage().deleteAllCookies();
                driver.manage().window().maximize();
                return driver;
            }
            else if (browser.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver","src/main/resources/drivers/geckodriver");
                driver = new FirefoxDriver();
                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                driver.manage().deleteAllCookies();
                driver.manage().window().maximize();
                return driver;
            }
        else if (browser.equalsIgnoreCase("safari")){
            driver = new SafariDriver();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            return driver;
        }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
}
