import org.openqa.selenium.By;

public class PickBusiness extends BasePage {

    /**
     * Set of functions in order to complete Step C.
     */
    public void setChoosingBusiness() {

        pickBusiness();
        enterPrice();
        pressChoose();
    }

    /**
     * Click on Chef restaurants and then click on Buyme Chef.
     */
    public void pickBusiness(){
        clickElement(By.linkText("background-image: url(\"https://buyme.co.il/files/categoryNewPic16.jpg\""));
        clickElement(By.xpath("//*[@id=\"ember3175\"]/div[3]"));
    }

    /**
     * Enter price. I chose 300, and then click on button "Choise"
     */

    public void enterPrice(){
        String price = "300";
        sendKeysToElement(By.xpath("//*[@id=\"ember4252\"]"), price);
    }
    public void pressChoose(){
        clickElement(By.xpath("//*[@id=\"ember4529\"]/span"));
    }
}