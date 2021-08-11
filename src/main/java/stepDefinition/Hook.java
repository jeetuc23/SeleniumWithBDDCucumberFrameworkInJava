package stepDefinition;

import helper.BrowserHandler;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.util.logging.Logger;

public class Hook extends BrowserHandler {

    @Before
    public void LaunchBrowser() { super.initialize("chrome");
        driver.get("https://testscriptdemo.com/");
    }
    @After
    public void closeAllOpenedBrowsers(){ driver.quit();
        Logger Log = Logger.getLogger(org.seleniumhq.jetty9.util.log.Log.class.getName());
        Log.info("All browsers are closed now");
    }
}
