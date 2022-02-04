package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Signin_Page extends AbstractClass{

    //Chrome tarafında çıkan site bildirimlerini kapatmaya yarar
    ChromeOptions ops = new ChromeOptions();
    ops.addArguments("--disable-notifications");

    WebDriver driver;

    public Signin_Page(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "myAccount")
    private WebElement SigninButton;

    public void clickSigninButton(){
        clickFunction(SigninButton);
    }

    @FindBy(id = "login")
    private WebElement loginButton;

    public void clickLoginButton(){
        clickFunction(loginButton);
    }

    @FindBy(id = "txtUserName")
    private WebElement usernametextarea;

    public void typeEmail(){
        sendKeysFunction(usernametextarea,"a@gmail.com");
    }

    @FindBy(id = "txtPassword")
    private WebElement passwordtextarea;

    public void typePassword(){
        sendKeysFunction(passwordtextarea,"a@gmail.com");
    }

}
