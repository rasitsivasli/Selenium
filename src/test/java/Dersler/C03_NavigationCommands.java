package Dersler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigationCommands {
    public static void main(String[] args) throws InterruptedException {
        // Creating a WebDriver object

        WebDriver driver = new ChromeDriver();

        // Opening Google website
        //driver.get("https://www.google.com/");
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(3000);
        // Opening Stack Overflow website
        //driver.get("https://stackoverflow.com/");
        driver.navigate().to("https://stackoverflow.com/");
        Thread.sleep(3000);
        // NAVIGATION COMMANDS

        // back() opens the previous page
        driver.navigate().back(); // Chrome
        Thread.sleep(3000);
        // forward() opens the next page after going back
        driver.navigate().forward(); // Stack Overflow
        Thread.sleep(3000);
        // refresh() refreshes the page
        driver.navigate().refresh(); // Stack Overflow
        Thread.sleep(3000);
        // to() - performs the same function as the get() method
        driver.navigate().to("https://www.linkedin.com/");
        Thread.sleep(3000);
        driver.quit();
    }
}
