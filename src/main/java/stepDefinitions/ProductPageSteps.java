package stepDefinitions;

import PageObjectModel.Product_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class ProductPageSteps {
    Product_Page product_page = new Product_Page();
    public WebDriver driver;

    @Given("I focus search bar")
    public void ı_focus_search_bar() {

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.hepsiburada.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        product_page.clickSearchInput();


    }
    @Given("I type {string}")
    public void ı_type(String string) {

    }
    @When("I press Enter")
    public void ı_press_enter() {

    }
    @Then("I should see {string} products in list and open product")
    public void ı_should_see_products_in_list_and_open_product(String string) {

    }


}
