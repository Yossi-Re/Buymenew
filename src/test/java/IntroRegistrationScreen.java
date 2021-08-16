import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IntroRegistrationScreen extends BasePage {


    /**
     * Functions that this class includes: Registration, Enter name and email, Registration button in order to start working.
     */
    public void login() {
        enterBuyMeWebSite();
        pressRegistration();
        pressRegistration2();
        enterCredentials();


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


        sendKeysToElement(By.xpath("//*[text()='שם פרטי']"), Constants.NAME);
        sendKeysToElement(By.xpath("//*[text()='מייל']"), Constants.EMAIL);
        sendKeysToElement(By.xpath("//*[text()='סיסמה']"), Constants.PASSWORD);
        sendKeysToElement(By.xpath("//*[text()='אימות סיסמה']"), Constants.PASSWORD);
    }

//*[@id='ember953']/div/ul[1]/li[3]/a/span[2]

    private void pressRegistration2() {
        clickElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[3]/div[2]/div[3]/form/button/span"));
    }


    private void enterBuyMeWebSite(){
        navigate("https://buyme.co.il/");
    }
}
