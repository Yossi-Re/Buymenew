import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class MainTest {


    public static WebDriver driver;
    private WebDriver chromeDriver;
    private static WebDriverWait wait;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ereuv\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        driver = DriverSingleton.getDriverInstance();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://buyme.co.il/");
    }

    @Test
    public void assertAllFields() {
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath())).click();
        IntroRegistrationScreen step1 = new IntroRegistrationScreen();
        step1.login();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder='שם פרטי']"))).getText();
        Assert.assertEquals(Constants.NAME, driver.findElement(By.xpath("//*[@placeholder='שם פרטי']")).getText());
        Assert.assertEquals(Constants.EMAIL, driver.findElement(By.xpath("//*[@id=\"ember1640\"]")).getText());
        Assert.assertEquals(Constants.PASSWORD, driver.findElement(By.xpath("//*[@id=\"valPass\"]")).getText());
        Assert.assertEquals(Constants.PASSWORD, driver.findElement(By.xpath("//*[@id=\"ember1646\"]")).getText());

        /**
         * Call Set Search For Gift options.
         */
        HomeScreen step2 = new HomeScreen();
        step2.setSearchForGift();
    }

    /**
     * Test for Step C - Assert website URL
     */
    @Test

    public void assertURLTest() {
        String buyMeURL = "https://buyme.co.il/";
        Assert.assertEquals(chromeDriver.getCurrentUrl(), buyMeURL);

    }

    /**
     * Assert tests for Step 4.
     */
    @Test
    public void assertSenderReceiverNames() {
        SenderReceiverScreen step4 = new SenderReceiverScreen();
        step4.giftForSomeoneElse();
        Assert.assertEquals(Constants.NAME, driver.findElement(By.xpath("//*[@id=\"ember2187\"]")).getText());
        Assert.assertEquals(Constants.receiverName, driver.findElement(By.name("מי הזוכה המאושר? יש להשלים את שם המקבל/ת")).getText());
    }


}