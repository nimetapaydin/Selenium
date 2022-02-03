package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class HomePageSteps {

    public WebDriver driver;



    @Given("that open {string} link with {string} language")
    public void that_open_link_with_language(String string, String string2) {

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hepsiburada.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @Given("I focus header")
    public void ı_focus_header() {

    }
    @When("Hover over categories")
    public void hover_over_categories() {

    }
    @Then("Categories appear to be opened")
    public void categories_appear_to_be_opened() {

    }



}
