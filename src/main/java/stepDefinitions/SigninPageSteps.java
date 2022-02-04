package stepDefinitions;

import PageObjectModel.Signin_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SigninPageSteps {

    private WebDriver driver;
    Signin_Page signin_page = new Signin_Page();

    @Given("that open {string} link")
    public void that_open_link(String string) {

    }
    @Given("Click {string}")
    public void click(String string) {

        signin_page.clickSigninButton();

    }
    @Given("set {string}")
    public void set(String string) {
        signin_page.typeEmail();

    }
    @When("Click {string}")
    public void clickgirisyap(String string) {

    }
    @When("I press Girişyap")
    public void ı_press_girişyap() {

    }
    @Then("I should see HomePage")
    public void ı_should_see_home_page() {

    }

}
