package Hepsiburada;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Signin {

    public static void main(String[] args){
        //Driver tanımlama ve driver'ın lokasyonunu verme
        System.setProperty("webdriver.chrome.driver","D:\\Selenium_example\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //Chrome tarafında çıkan site bildirimlerini kapatmaya yarar
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium_example\\drivers\\chromedriver.exe");
        driver = new ChromeDriver(ops);

        driver.get("https://www.hepsiburada.com/");

        //driver'ın tam pencere açılmasını sağlar
        driver.manage().window().maximize();

        WebElement girisyaptext = driver.findElement(By.id("myAccount"));
        girisyaptext.click();


      // WebElement girisyapbuton = driver.findElement(By.id("login"));
      // girisyapbuton.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id(".//*[@id='login']")));


        //class kullanarak elementi bulma
        WebElement search = driver.findElement(By.className("desktopOldAutosuggestTheme-input"));
        //bulunan elemente tıklama
        search.click();
        //bulunan alana text girmek
        search.sendKeys("Buzdolabı");

        driver.close();
    }
}
