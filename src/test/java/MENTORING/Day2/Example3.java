package MENTORING.Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {
    public static void main(String[] args) throws InterruptedException {

        // Go to www.yahoo.com
        // Maximize Window
        // Go to www.amazon.com
        // Maximize Window
        // ***Navigate Back***
        // ***Navigate Forward***
        // ***Refresh The Page***


        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.yahoo.com/");
        Thread.sleep(3000);
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);


        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.quit();
    }
}
