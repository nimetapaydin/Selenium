package PageObjectModel;

import org.apache.batik.css.parser.CSSSelectorList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Product_Page extends AbstractClass{


    WebDriver driver;

    public Product_Page(){
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


    @FindBy(className = "searchResultSummaryBar-mainText")

    private WebElement productName;
    public void visibleproductName(){
       visibleFunction(productName);
    }


    @FindBy(css = "#i0 > div")

    private WebElement firstitem;
    public void clickfirstitem(){
        clickFunction(firstitem);
    }

    @FindBy(By.ByCssSelector = "#productDetailsCarousel > div.owl-stage-outer > div > div.owl-item.active > a > picture");
    private WebElement productItem;
    public void visibleproduct(){
        visibleFunction(productItem);
    }

}