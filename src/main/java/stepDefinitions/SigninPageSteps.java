package stepDefinitions;

import PageObjectModel.Signin_Page;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class SigninPageSteps {

    private WebDriver driver;
    Signin_Page signin_page = new Signin_Page();

    @Given("I open {string} link")
    public void ı_open_link(String string) {

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://hepsiburada.com");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @Given("I click main login button")
    public void ı_click_main_login_button() {
        signin_page.clickSigninButton();
        signin_page.clickLoginButton();

    }
    @When("I login with {string} email and {string} password")
    public void ı_login_with_email_and_password(String email, String password) {

        signin_page.typeEmail(email);
        signin_page.clickbtnLoginButton();
        signin_page.typePassword(password);
        signin_page.clickbtnEmailSelect();
    }
    @Then("I see my name")
    public void ı_see_my_name() {


    }

    @After
    public void quitDriver()throws InterruptedException{
        Thread.sleep(2000);
        Driver.closedriver();
    }

}