package stepDefinitions;

import PageObjectModel.Home_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class HomePageSteps {

    Home_Page home_page = new Home_Page();
    public WebDriver driver;



    @Given("that open {string} link with {string} language")
    public void that_open_link_with_language(String string, String string2) {

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(string);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @When("Hover over {string}")
    public void hoverOver(String categoryName) {
        home_page.hoverElement(categoryName);
    }

    @Then("{string} appear to be opened")
    public void appearToBeOpened(String firstCategory) {
        home_page.clickableElement(firstCategory);
    }

//    @After
//    public void quitDriver()throws InterruptedException{
//        Thread.sleep(2000);
//        Driver.closedriver();
//    }

}
