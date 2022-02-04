package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            WebDriverManager.chromedriver().setup();

            driver = (WebDriver) new ChromeDriver();
        }
        return driver;
    }

    public static void closedriver(){
        driver.quit();
        driver=null;
    }
}
