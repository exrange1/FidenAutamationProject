package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.en.Given;

public class _01_NavigateStep {
    @Given("Navigate to FidenSolution")
    public void navigateToFidenSolution() {
        GWD.getDriver().get("https://fidenssolutions.com/");
        GWD.getDriver().manage().window().maximize();

    }
}
