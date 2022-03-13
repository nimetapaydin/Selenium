package stepDefinitions;

import PageObjectModel.Search_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class SearchPageSteps {
    Search_Page search_page = new Search_Page();
    public WebDriver driver;

    @Given("I focus search bar")
    public void i_focus_search_bar() {

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.hepsiburada.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        search_page.clickbtnSearchButton();
    }

    @Given("I type {string}")
    public void i_type(String product) {
        search_page.typeProduct(product);
    }
    @When("I press Enter")
    public void i_press_enter() {
        search_page.clickbtnSearchButton();
    }

    @Then("I should see product products in search list")
    public void iShouldSeeAndOpenProduct() {
        String parentWindow = driver.getWindowHandle();
        // Switch to new window opened
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

        search_page.visibleproduct();
    }


}
