import org.openqa.selenium.By;

public class SenderReceiverScreen extends BasePage{
    /**
     * A set of functions in order to execute Step D.
     */

    public void giftForSomeoneElse(){

//        pressRadioForSomeoneElse();
        enterReceiverName();
//         enterSenderName();
        pickAnEvent();
        enterBlessing();
         uploadPicture();
        pressRadioAfterPayment();
        pickEmailSMS();
        enterEmailAddress();
        pressSave();



    }
//    public void pressRadioForSomeoneElse(){
//        clickElement(By.xpath("//span[@text()='למישהו אחר']"));
//    }
    public void enterReceiverName(){

        sendKeysToElement(By.cssSelector("input[maxlength='25']"),"Biden");

    }

    /**
     * No need to enter sender's name. It is filled automatically by the system.
     */
//    public void enterSenderName(){


    public void pickAnEvent(){
        clickElement(By.xpath("//span[ text()='?לאיזה אירוע']"));
        clickElement(By.xpath("//span[ text()='יום הולדת']"));

    }

    public void enterBlessing(){
        sendKeysToElement(By.xpath("//span[ text()='מזל טוב, תודה רבה או פשוט מלא אהבה? כאן כותבים מילים טובות ואיחולים שמחים']"), "Happy birthday dear Jo");

    }
    public void uploadPicture(){
        clickElement(By.className("media-circle-btn ember-view bm-media-upload"));
    }

    /**
     * Press "Continue" button in order to move to the next page.
     */
    public void pressRadioAfterPayment(){
       clickElement(By.xpath("//*[@id=\"ember4924\"]/span"));
    }
    public void pickEmailSMS(){
        clickElement(By.xpath("//*[@id=\"ember4932\"]/div[2]/div[1]/svg/path[1]"));
    }
    public void enterEmailAddress(){
        sendKeysToElement(By.name("מייל מקבל/ת המתנה"), "biden@gmail.com");
    }

    /**
     * Press Save is: "Continue for payment button". We press it:
     */
    public void pressSave(){
        clickElement(By.xpath("//*[@id=\"ember4941\"]/span"));
    }
}
