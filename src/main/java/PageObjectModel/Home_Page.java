package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Home_Page extends AbstractClass{

    WebDriver driver;

    public Home_Page(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".navigationBar")

    private WebElement navigationBar;
    public void hoverElement(String hoverElementText){
        WebElement element = navigationBar.findElement(By.xpath("//span[text()=\"" + hoverElementText + "\"]"));
        hoverFunction(element);
    }
}