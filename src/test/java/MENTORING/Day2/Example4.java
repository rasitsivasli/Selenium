package MENTORING.Day2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.yahoo.com/");
        Thread.sleep(3000);
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(3000);
        Dimension dimension = new Dimension(60,200);
        Point point = new Point(300,100);

        driver.manage().window().setSize(dimension);
        Thread.sleep(3000);
        driver.manage().window().setPosition(point);
        Thread.sleep(3000);
        driver.quit();
        driver.quit();
        driver.quit();


    }
}
