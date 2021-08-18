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
    // /html/body/div[2]/div/header/div[3]/div/form/div[1]/a/span
        clickElement(By.xpath("//span[text()='סכום']"));
        clickElement(By.xpath("//li[@data-option-array-index='5']"));

}
public void pickRegion(){
        clickElement(By.xpath("//span[text()='אזור']"));
        clickElement(By.xpath("//li[text()='ת\"א והסביבה']"));
        //clickElement(By.xpath("/html/body/div[2]/div/header/div[3]/div/form/select[2]/option[2]"));
}

    public void pickCategory() {

        clickElement(By.xpath("//span[text()='קטגוריה']"));
        clickElement(By.xpath("//li[text()='גיפט קארד למסעדות שף']"));

    }

    public void pressFindMeGift() {
        clickElement(By.xpath("//a[text()='תמצאו לי מתנה']"));

    }
}