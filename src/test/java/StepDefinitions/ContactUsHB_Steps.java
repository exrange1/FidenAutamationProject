package StepDefinitions;

import Pages.CommonElements;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ContactUsHB_Steps {
    CommonElements cm=new CommonElements();


    @Then("Successful message")
    public void successfulMessage(DataTable elements) {
        List<List<String>> listElements=elements.asLists(String.class);
        for (List<String> listElement : listElements) {
            cm.findAndContainsText(listElement.get(0), listElement.get(1));

        }
    }
}