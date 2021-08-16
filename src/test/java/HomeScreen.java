import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.SelectableChannel;
import java.util.List;

public class HomeScreen extends BasePage {
    /**
     * Function that includes all steps required in "Step B"
     */

    public void setSearchForGift(){

        pickPrice();
        pickRegion();
        pickCategory();
        pressFindMeGift();



    }
public void pickPrice(){

        clickElement(By.xpath("/html/body/div[2]/div/header/div[3]/div/form/div[1]/a/span"));
        clickElement(By.xpath("/html/body/div[2]/div/header/div[3]/div/form/select[1]/option[6]"));

}
public void pickRegion(){
        clickElement(By.xpath("/html/body/div[2]/div/header/div[3]/div/form/div[2]/a/span"));
        clickElement(By.xpath("/html/body/div[2]/div/header/div[3]/div/form/select[2]/option[2]"));
}

    public void pickCategory() {

        clickElement(By.xpath("/html/body/div[2]/div/header/div[3]/div/form/div[3]/a/span"));
        clickElement(By.xpath("/html/body/div[2]/div/header/div[3]/div/form/select[3]/option[3]"));

    }

    public void pressFindMeGift() {
        clickElement(By.xpath("/html/body/div[2]/div/header/div[3]/div/form/a"));

    }
}