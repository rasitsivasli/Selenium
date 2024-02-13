package Dersler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C07_PageSourceTest {
    /*
       Go to the Amazon URL: https://www.amazon.com/
       Verify that it writes "Performance Metrics" or "Gateway" from the Source code.

  */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.de/ref=nav_logo");
        driver.manage().window().maximize();

        Thread.sleep(5000);
        String word1 = "performance metrics";
        String word2 = "gateway";
        String pageSource = driver.getPageSource().toLowerCase();

        System.out.println((pageSource.contains(word1) || pageSource.contains(word2)) ? "TEST PASSED" : "FAILED");
        System.out.println((pageSource.contains(word1) && pageSource.contains(word2)) ? "TEST PASSED" : "FAILED");

        driver.quit();
    }
}
