package Dersler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C01_FirstClass {

    // When starting with Selenium, we first need to specify which driver to use.
    // We'll communicate with the browser via the driver.


    public static void main(String[] args) throws InterruptedException {
        // Nun müssen wir ein DriverObjekt hier produzieren.
        WebDriver driver = new ChromeDriver();
        // With the get() method: if we want to open a website with the driver, we use the get() method of our driver object.
        // We instruct our driver to go to google.com.
        driver.get("https://www.amazon.com/");

        // Even if we don't redirect to any address;
        // ChromeDriver() constructor creates an empty WebDriver.
        Thread.sleep(3000);// das stoppt Java

        driver.get("https://www.google.com/");

        Thread.sleep(3000);
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.amazon.com/");

        Thread.sleep(3000);
        WebDriver driver2 = new EdgeDriver();
        driver2.get("https://www.trendyol.com/");

        driver.quit();// bu method nesneyi silmez yalnizca sayfayi kapatir
        driver1.close();// bu method nesneyi de sayfayi da kapatir
        driver2.close();
        driver.get("https://www.google.com/");

        //driver.quit(); // This line closes all open pages in the driver (exit)

        driver.close(); // It must be added at the end of the driver class, because when this code runs, our driver closes.

        // driver.get("https://www.google.com/"); // This line will throw an error..
        // If we want to open a new browser after this line, we need to assign a new value to the driver
        // and create a new driver object.
    }
}
