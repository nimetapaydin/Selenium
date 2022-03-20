package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Driver {

    public static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            WebDriverManager.chromedriver().setup();

            Map<String, Object> prefs = new HashMap<String, Object>();
            prefs.put("profile.default_content_setting_values.notifications", 2);
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", prefs);

            driver = (WebDriver) new ChromeDriver(options);
        }
        return driver;
    }

    public static void closedriver(){
        driver.quit();
        driver=null;
    }
}
