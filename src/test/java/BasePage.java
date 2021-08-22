import com.aventstack.extentreports.MediaEntityBuilder;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class BasePage {

//
//    private Process test;

    protected void sendKeysToElement(By locator, String text) {
        WebElement element = null;

        try {

            element =getWebElement(locator);
            element.sendKeys(text);
        } catch (Exception e) {
            e.printStackTrace();
            //takeElementScreenshot();
            String timestamp = String.valueOf(System.currentTimeMillis());
            MainTest.test.info("details", MediaEntityBuilder.createScreenCaptureFromPath(takeElementScreenshot()).build());
            //MainTest.test.info("details", MediaEntityBuilder.createScreenCaptureFromPath().build());
        }
    }

    private String takeScreenShot(String pic) {
        return System.getProperty("user.dir") + "/" + pic;
    }

    private static String takeElementScreenshot(){
        WebDriver driver = null;
        String fileName = String.valueOf(System.currentTimeMillis());
        fileName += ".png";
        //File screenShotFile = element.getScreenshotAs(OutputType.FILE); // take the screenshot
        try {
            driver =  DriverSingleton.getDriverInstance();
            File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenShotFile, new File(fileName)); // save screenshot to disk

        } catch (IOException e) {
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        return fileName;
    }

    protected void sendKeysToElement(By locator, Keys key) {

        getWebElement(locator).sendKeys(key);
    }

    protected void clickElement(By locator) {

        getWebElement(locator).click();
    }

    protected void navigate(String url) throws Exception {
        DriverSingleton.getDriverInstance().get(url);
    }

    private WebElement getWebElement(By locator) {
        try {
            return
                    DriverSingleton.getDriverInstance().findElement(locator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

//        File myBuyMe = new File("buymeproject.xml");
//
//        public File getMyBuyMe () {
//            ;
//
//            return (WebElement) myBuyMe;
//
//        }

