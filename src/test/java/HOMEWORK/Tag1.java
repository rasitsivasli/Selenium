package HOMEWORK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag1 {
    public static void main(String[] args) throws InterruptedException {
              /*
Create main method
Create chrome driver
Open google home page: https://www.google.com
Get Title on page
Get Current URL on page
Close/Quit the browser
     */

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println("title = " + title);
        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);


        // 2. yol
        Thread.sleep(3000);
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(3000);
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.quit();


        // Differences between get() method and navigate to() method?
/*
        get() metodu, belirli bir URL'yi yüklemek için kullanılır.
        Örneğin, Selenium gibi bir otomasyon aracında driver.get("https://www.example.com") şeklinde kullanılır.
        Bu metot, belirtilen URL'ye doğrudan gider ve sayfanın tamamen yüklenmesini bekler.


        navigate.to() metodu da belirli bir URL'yi yüklemek için kullanılır, ancak bazı farklar vardır.
        Bu metot, tarayıcının gezinme geçmişini değiştirir.
        Yani, tarayıcı zaten bir sayfada ise, navigate.to() metodu yeni bir sayfaya gitmek için kullanılabilir.
        Örneğin, Selenium'da driver.navigate().to("https://www.example.com") şeklinde kullanılabilir.
        Bu metot, tarayıcı geçmişinde bir sayfa ekler, bu nedenle geri butonuna basıldığında önceki sayfaya dönme yeteneği sağlar.

        Kısacası, get() metodu bir URL'yi yüklemek için kullanılırken,
        navigate.to() metodu ayrıca tarayıcının gezinme geçmişini değiştirir ve önceki sayfalara dönmeyi sağlar.
        Bu, tarayıcı otomasyonunda kullanırken önemli bir fark olabilir.*/

    }
}
