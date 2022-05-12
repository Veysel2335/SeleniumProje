package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;

public class C05_HomeWork {
    ////Bir class oluşturun : AmazonSearchTest
    //  // 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
    //  //a.google web sayfasına gidin. https://www. amazon.com/
    //  //        b. Search(ara) “city bike”
    //  //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
    //  //d. “Shopping” e tıklayın.
    //  //e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //a.google web sayfasına gidin. https://www. amazon.com/
        driver.get(" https://www.amazon.com/");
        WebElement aramakutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("city bike" + Keys.ENTER);

        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement aramaSonuc = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));
        String[] sonucTextArrays = aramaSonuc.getText().split(" ");
        System.out.println(" sonuç : " + sonucTextArrays[sonucTextArrays.length-3]);

        //sepete ekle yaptım
        WebElement addtocart=driver.findElement(By.id("nav-cart-count"));
        addtocart.click();

        //hesapoluştur burada cssSelector kullandım 3 yolla alınabiliyor ben class olanı seçtim
        WebElement hesapoluştur=driver.findElement(By.cssSelector(".a-size-base-plus"));
        hesapoluştur.click();

        //email gir
        WebElement email=driver.findElement(By.id("ap_email"));
        email.click();
        email.sendKeys("batch59@gmail.com" + Keys.ENTER);
        driver.close();









    }
}