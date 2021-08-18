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
    public void pickBusiness(){
//        clickElement(By.linkText("background-image: url(\"https://buyme.co.il/files/categoryNewPic16.jpg\""));
        // 'https://buyme.co.il/supplier/1933847?budget=5&category=16&query=&region=13'
        //clickElement(By.xpath("//span[@text='מסעדת יאקימונו רוטשילד']"));
        clickElement(By.xpath("//span[@url='https://buyme.co.il/supplier/1933847?budget=5&category=16&query=&region=13']"));
    }

    /**
     * Enter price. I chose 300, and then click on button "Choise"
     */

    public void enterPrice(){
        String price = "300";
        sendKeysToElement(By.xpath("//input[@placeholder='הכנס סכום'"), price);

    }
    public void pressEnter(){

        sendKeysToElement(By.xpath("//input[@placeholder='הכנס סכום'"), Keys.RETURN);
    }
}