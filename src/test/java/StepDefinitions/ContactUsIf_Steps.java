package StepDefinitions;

import Pages.CommonElements;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ContactUsIf_Steps {
    CommonElements cm=new CommonElements();

    @And("Click on the button elements")
    public void clickOnTheButtonElements(DataTable elements) {
        List<String> listElements=elements.asList(String.class);
        for (int i = 0; i <listElements.size(); i++) {
          cm.findAndClick(listElements.get(i));

        }
    }

    @And("Find the boxes and send the string")
    public void findTheBoxesAndSendTheString(DataTable elements) {
        List<List<String>> listElements=elements.asLists(String.class);
        for (int i = 0; i < listElements.size(); i++) {
            cm.findAndSend(listElements.get(i).get(0),listElements.get(i).get(1));

        }
    }

    @Then("Successful result check")
    public void successfulResultCheck() throws IOException {
        LocalDateTime anlikTarih= LocalDateTime.now();
        DateTimeFormatter ozelFormat=DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm:ss:ms");
        String fotoName="ekranGoruntuleri/"+anlikTarih.format(ozelFormat);
        fotoName=fotoName.replace(".","");
        fotoName=fotoName.replace(":","");
        fotoName=fotoName.replace(" ","");
        fotoName=fotoName+".png";
        cm.waitUntilVisible(cm.succesCheck);
         if(cm.succesCheck.getText().contains("succes")){
           TakesScreenshot ts=(TakesScreenshot) GWD.getDriver();
           File hafizadakiHali=ts.getScreenshotAs(OutputType.FILE);
               FileUtils.copyFile(hafizadakiHali,new File(fotoName));
       }

    }
}
