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
    //private WebDriver chromeDriver;
    private static WebDriverWait wait;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ereuv\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        driver = DriverSingleton.getDriverInstance();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        driver.get("https://buyme.co.il/");
    }

    @Test
    public void assertAllFields() {
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath())).click();
        IntroRegistrationScreen step1 = new IntroRegistrationScreen();
        step1.register();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder='שם פרטי']")));
        Assert.assertEquals(Constants.NAME, driver.findElement(By.xpath("//*[@placeholder='שם פרטי']")).getAttribute("value"));
        Assert.assertEquals(Constants.EMAIL, driver.findElement(By.xpath("//*[@placeholder='מייל']")).getAttribute("value"));
        Assert.assertEquals(Constants.PASSWORD, driver.findElement(By.xpath("//*[@placeholder='סיסמה']")).getAttribute("value"));
        Assert.assertEquals(Constants.PASSWORD, driver.findElement(By.xpath("//*[@placeholder='אימות סיסמה']")).getAttribute("value"));

        step1.login();
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
        String buyMeURL = "https://buyme.co.il/search?budget=5&category=16&region=13";
        Assert.assertEquals(driver.getCurrentUrl(), buyMeURL);
        PickBusiness step3 = new PickBusiness();
        step3.setChoosingBusiness();
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