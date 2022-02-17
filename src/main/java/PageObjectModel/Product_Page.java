package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public class Product_Page extends AbstractClass{


    WebDriver driver;

    public Product_Page(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "desktopOldAutosuggestTheme-input")
    private WebElement SearchInput;

    public void clickSearchInput(){
        clickFunction(SearchInput);
    }

    @FindBy(id = "login")
    private WebElement loginButton;

    public void clickLoginButton(){
        clickFunction(loginButton);
    }

    @FindBy(id = "txtUserName")
    private WebElement usernametextarea;

    public void typeEmail(String email){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement eMailElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUserName")));
        eMailElement.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(eMailElement).sendKeys(email).perform();

        //sendKeysFunction(usernametextarea,"a@gmail.com");
    }

    @FindBy(id = "txtPassword")
    private WebElement passwordtextarea;

    public void typePassword(String password){
        sendKeysFunction(passwordtextarea,password);
    }

    @FindBy(className = "SearchBoxOld-buttonContainer")

    private WebElement btnSearch;
    public void clickbtnSearchButton(){
        clickFunction(btnSearch);
    }

    @FindBy(id = "btnEmailSelect")

    private WebElement btnEmailSelect;
    public void clickbtnEmailSelect(){
        clickFunction(btnEmailSelect);
    }


}