import org.openqa.selenium.By;

public class SenderReceiverScreen extends BasePage{
    /**
     * A set of functions in order to execute Step D.
     */

    public void giftForSomeoneElse(){

        pressRadioForSomeoneElse();
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
    public void pressRadioForSomeoneElse(){
        clickElement(By.xpath("//*[@id=\"ember4724\"]/span"));
    }
    public void enterReceiverName(){
        String receiverName = "Biden";
        sendKeysToElement(By.name("מי הזוכה המאושר? יש להשלים את שם המקבל/ת"), receiverName);
    }

    /**
     * No need to enter sender's name. It is filled automatically by the system.
     */
//    public void enterSenderName(){


    public void pickAnEvent(){
        clickElement(By.name("לאיזה אירוע?"));
        clickElement(By.name("יום הולדת"));
    }

    public void enterBlessing(){
        sendKeysToElement(By.name("מזל טוב, תודה רבה או פשוט מלא אהבה? כאן כותבים מילים טובות ואיחולים שמחים"), "Happy birthday dear Jo");
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
