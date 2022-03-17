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


    @Given("click search bar")
    public void clickSearchBar() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.hepsiburada.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        search_page.clickbtnSearchButton();
    }

    @When("type {string}")
    public void type(String product) {
        search_page.typeProduct(product);

    }


    @Then("should see product products in search list")
    public void shouldSeeProductProductsInSearchList() {
        search_page.visibleproductList();
    }
}
