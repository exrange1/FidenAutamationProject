package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CommonElements extends Parent {

    public CommonElements() {
        PageFactory.initElements(GWD.getDriver(),this);

    }
































    WebElement myElement;

    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {


        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {

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


















}
