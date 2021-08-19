import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class PickBusiness extends BasePage {

    /**
     * Set of functions in order to complete Step C.
     */
    public void setChoosingBusiness() {

        pickBusiness();
        enterPrice();
        pressEnter();
    }

    /**
     * Click on Chef restaurants and then click on Buyme Chef.
     */
    public void pickBusiness() {
        clickElement(By.xpath("//*[@id=\"ember1737\"]/div[2]/span"));


    }

    /**
     * Enter price. I chose 300, and then click on button "Choise"
     */

    public void enterPrice() {
        String price = "300";
        sendKeysToElement(By.xpath("//input[@placeholder='הכנס סכום']"), price);

    }

    public void pressEnter() {

        clickElement(By.xpath("//*[@id=\"ember1942\"]/span"));
    }
}