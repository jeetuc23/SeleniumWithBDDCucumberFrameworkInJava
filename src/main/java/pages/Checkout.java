package pages;

import helper.Screenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import java.util.logging.Logger;

public class Checkout extends Screenshots{
    public Checkout(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.XPATH, using = "(//*[@class='la la-shopping-bag'])[1]")
    private WebElement openCart;
    @FindBy(how = How.XPATH, using = "(//*[@class='product-name'])[2]")
    private WebElement checkCart;
    public void verifyCart(WebDriver driver) throws IOException {
        try{ openCart.click();
             checkCart.click();
             Logger Log = Logger.getLogger(org.seleniumhq.jetty9.util.log.Log.class.getName());
             Log.info("Test scenario execution completed");

        }catch (Exception e)
        {
            Screenshots screenshots = new Screenshots();
            screenshots.takeScreenShot(driver);
            Logger Log = Logger.getLogger(org.seleniumhq.jetty9.util.log.Log.class.getName());
            Log.info("Test scenario execution Failed");
            e.printStackTrace();

        }

    }
}
