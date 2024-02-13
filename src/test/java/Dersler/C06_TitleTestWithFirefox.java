package Dersler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C06_TitleTestWithFirefox {
    /*
 Invoke FireFox Driver
 Go to https://www.youtube.com/
 Verify the page title contains the word video.
 Close the driver.

 */
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();

        System.out.println((driver.getTitle().toLowerCase().contains("video"))? "TEST PASSED" : "FAILED");

        driver.quit();
    }
}
