package MENTORING.Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
       /*
        driver.get();
        driver.close();
        driver.quit();
        driver.getCurrentUrl();
        driver.navigate();
        driver.getPageSource();
        driver.getTitle();*/

       // ChromeDriver driver1 = new ChromeDriver(); bu sekilde de kullanabiliriz ama interface ait data tipi ile tüm web sitelerini kullanabiliriz

        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);

        //driver.get("https://www.trendyol.com/de");
        //Thread.sleep(3000);
        //driver.quit();// driver in degerini null a döndürü // Tüm brovser kapanir
        //driver.close();// Sasece bulundugu driveri kapatir


        String title = driver.getTitle().toLowerCase();// sayfanin title bilgisini String olarak döndürür.
        System.out.println("title = " + title);
        if (title.contains("amazon")) System.out.println("Pass");
        else System.out.println("Fail");
        System.out.println("================================");
        Thread.sleep(3000);

        String url = driver.getCurrentUrl();// sayfanin mevcut URL code unu paylasir...
        if (url.contains("https")) System.out.println("pass");
        else System.err.println("Fail");
        System.out.println("================================");

        String pageSourse = driver.getPageSource();// sayfanin html code larini paylasir
        System.err.println("Sourse da Button Var mi ? = " + (pageSourse.contains("button")? "pass":"Fail"));
    }
}
