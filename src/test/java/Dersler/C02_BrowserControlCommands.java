package Dersler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Selenium automates browsers. That's it!
What you do with that power is entirely up to you.
 */
public class C02_BrowserControlCommands {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        String goggleTitle = driver.getTitle();
        System.out.println("goggleTitle = " + goggleTitle);

        String goggleURL = driver.getCurrentUrl();
        System.out.println("goggleURL = " + goggleURL);

        String googlePageSource = driver.getPageSource();
        System.out.println("googlePageSource = " + googlePageSource);
        driver.quit();
    }
}
