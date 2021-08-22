import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IntroRegistrationScreen extends BasePage {


    /**
     * Functions that this class includes: Registration, Enter name and email, Registration button in order to start working.
     */
    public void register() throws Exception {
        enterBuyMeWebSite();
        pressRegistration();
        enterCredentials();
    }
    public void login() {

        enterOnceRegistered();

    }

    /**
     * Click on Registration button and then the 2nd registration as first time user.
     */
    private void pressRegistration() {



        clickElement(By.xpath("//*[@id='ember953']/div/ul[1]/li[3]/a/span[2]"));
        clickElement(By.xpath("//*[@id='ember920']/div/div[1]/div/div/div[3]/div[1]/span"));


    }

    /**
     * Enter credentials
     */
    private void enterCredentials() {


        sendKeysToElement(By.xpath("//*[@placeholder='שם פרטי']"), Constants.NAME);
        sendKeysToElement(By.xpath("//*[@placeholder='מייל']"), Constants.EMAIL);
        sendKeysToElement(By.xpath("//*[@placeholder='סיסמה']"), Constants.PASSWORD);
        sendKeysToElement(By.xpath("//*[@placeholder='אימות סיסמה']"), Constants.PASSWORD);
    }

//*[@id='ember953']/div/ul[1]/li[3]/a/span[2]

    private void enterOnceRegistered() {
        clickElement(By.xpath("//span[text()='לכניסה']"));
        //.getAttribute("gtm") ==
        clickElement(By.xpath("//button[@gtm='כניסה ל-BUYME']"));
    }


    private void enterBuyMeWebSite() throws Exception {
        navigate("https://buyme.co.il/");
    }
}
