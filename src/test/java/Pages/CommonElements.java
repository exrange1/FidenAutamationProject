package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonElements extends Parent {

    public CommonElements() {
        PageFactory.initElements(GWD.getDriver(),this);

    }

        @FindBy(css = "div[data-id='22c5609']")
        private WebElement contactUsButton;

        @FindBy(css = "input[placeholder='Name']")
        private WebElement inputName;

        @FindBy(css = "input[placeholder='Email']")
        private WebElement inputEmail;

        @FindBy(css = "input[placeholder='Subject']")
        private WebElement inputSubject;

        @FindBy(css = "textarea[placeholder='Message']")
        private WebElement inputMessage;

        @FindBy(xpath = "//span[text()='Send']")
        private WebElement SendButton;

        @FindBy(xpath = "//div[contains(text(),'succes')]")
        public WebElement succesCheck;





























    WebElement myElement;

    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "inputName":myElement=inputName;break;
            case "inputEmail":myElement=inputEmail;break;
            case "inputSubject":myElement=inputSubject;break;
            case "inputMessage":myElement=inputMessage;break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "contactUsButton":myElement=contactUsButton;break;
            case "SendButton":myElement=SendButton;break;


        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        if ("succesCheck".equals(strElement)) {
            myElement = succesCheck;
        }

        verifyContainsText(myElement,text);
    }


    public void SearchAndDelete(String searchText){
        findAndSend("", searchText); // aranacak kelimeyi kutucuğa gönder
        findAndClick(""); // arama butonuna bas

        waitUntilLoading();

        findAndClick("");// silme butonua bas
        findAndClick("");// dilogdaki silme butonuna bas
    }
// public void find(String strElement) {
//        switch (strElement) {
//            case "SaaSDevelopmentCheck": myElement = SaaSDevelopmentCheck;break;
//            case "MobileAppDevelopmentCheck":myElement=MobileAppDevelopmentCheck;break;
//            case "DevOpsCheck":myElement=DevOpsCheck;break;
//            case "QualityAssuranceCheck":myElement=QualityAssuranceCheck;break;
//            case "ITConsultingCheck":myElement=ITConsultingCheck;break;
//        }

















}
