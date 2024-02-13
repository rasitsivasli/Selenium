package MENTORING.Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {
    public static void main(String[] args) throws InterruptedException {

                 /*
        Invoke Chrome Browser
        Navigate to URL: https://www.w3schools.com/
        Navigate to URL: https://stackoverflow.com/
        Come back to the w3schools using the back command.
        Again go back to the stackoverflow website using forward command
        Refresh the Browser using refresh command.
        Close the Browser.
         */
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.navigate().to("https://www.w3schools.com/");
        Thread.sleep(3000);
        driver.navigate().to("https://stackoverflow.com/");
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.quit();
    }
}
