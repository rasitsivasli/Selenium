package Dersler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_WindowCommands {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://www.google.com/");
        System.out.println("Sayfanin pozisyonu : "+ driver.manage().window().getPosition());
        System.out.println("Sayfanin olculeri : "+ driver.manage().window().getSize());

        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.quit();
    }
}
