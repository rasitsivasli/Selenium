package Dersler;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.EventListener;

public class C05_SetPositionSetSize {
    public static void main(String[] args) throws InterruptedException {

     /*
         Go to the Amazon URL : https://www.amazon.com/
          Print the position and size of the page.
           Adjust the position and size of the page as desired.
            Test that the page is in the position and size you want.
             Close the page.
            */
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        System.out.println("Sayfanin pozisyonu : "+ driver.manage().window().getPosition());
        System.out.println("Sayfanin olculeri : "+ driver.manage().window().getSize());
        Thread.sleep(3000);

        //Pozisyon ve size'ı ayarla.
        driver.manage().window().setPosition(new Point(80,50));
        driver.manage().window().setSize(new Dimension(800,600));
        Thread.sleep(3000);

        System.out.println("Sayfanin pozisyonu : "+ driver.manage().window().getPosition());
        System.out.println("Sayfanin olculeri : "+ driver.manage().window().getSize());

        int xCoordinate = driver.manage().window().getPosition().getX();
        int yCoordinate = driver.manage().window().getPosition().getY();

        int width =  driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getHeight();

        if (xCoordinate==80 && yCoordinate==50 && width==800 && height==600) System.out.println("Test PASSED");
        else System.out.println("Test FAILED");

        System.out.println((xCoordinate==80 && yCoordinate==50 && width==800 && height==600)? "Test PASSED":"Test FAILED");


            //driver.quit();
    }
}
