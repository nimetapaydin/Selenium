package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Search_Page extends AbstractClass{

    WebDriver driver;

    public Search_Page(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "SearchBoxOld-buttonContainer")

    private WebElement btnSearch;
    public void clickbtnSearchButton(){
        clickFunction(btnSearch);
    }

    @FindBy(className = "desktopOldAutosuggestTheme-input")
    private WebElement producttextarea;

    public void typeProduct(String product){
        sendKeysFunction(producttextarea,product);
    }


    @FindBy(id = "react-autowhatever-1--item-0")

    private WebElement productList;
    public void visibleproductList(){
        visibleFunction(productList);
    }

}