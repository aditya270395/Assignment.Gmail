package LoginGmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    static WebDriver driver;

    public static void BrowserOpen()	
    {
        System.setProperty("webdriver.chrome.driver","/home/knoldus/Aditya/chromedriver_linux64 (1)/chromedriver");
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://mail.google.com/");

    }


}
