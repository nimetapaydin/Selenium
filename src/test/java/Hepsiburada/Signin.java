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

        driver.get("https://giris.hepsiburada.com/");

        //driver'ın tam pencere açılmasını sağlar
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("txtUserName"));
        userName.click();
        userName.sendKeys("Buzdolabı");

        WebElement password = driver.findElement(By.id("txtPassword"));
        password.click();
        password.sendKeys("12345");

        WebElement girisyapbtn = driver.findElement(By.id("btnLogin"));
        girisyapbtn.click();

        driver.close();
    }
}


