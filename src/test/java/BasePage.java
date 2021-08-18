import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.io.File;

public class BasePage {


    protected void sendKeysToElement(By locator, String text){

        getWebElement (locator).sendKeys(text);
    }
    protected void sendKeysToElement(By locator, Keys key){

        getWebElement (locator).sendKeys(key);
    }
    protected void clickElement (By locator){

        getWebElement(locator).click();
    }
    protected void navigate(String url){
        DriverSingleton.getDriverInstance().get(url);
    }
    private WebElement getWebElement (By locator){
        return
                DriverSingleton.getDriverInstance().findElement(locator);
    }
    File myBuyMe = new File("buymeproject.xml");

    public File getMyBuyMe() {
        return myBuyMe;
    }
}
