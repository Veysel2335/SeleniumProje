package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_getPageSource {
    public static void main(String[] args) {
        //amazon sitesine gidip kaynak kodlarinda "Gateway" yazdigini test yaoin

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
      String sayfaKynakKodlari=  driver.getPageSource();
      String arananKelime="Gateway";
      if (sayfaKynakKodlari.contains(arananKelime)){
          System.out.println("Kaynak koud pad´ssed");
      }else{
          System.out.println("kaynak kodlarinda "+arananKelime +"yok ,test Failed");
      }
        driver.close();
    }



}
