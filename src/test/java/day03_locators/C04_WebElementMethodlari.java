package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodlari {

    //amazon.coma gidip arama kutusunu locate edin
    //arama kutusunun tagName inin input oldugunu test edin
    //arama kutusunun name attribitunun degerinin...field keyword..old test edin
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //amazon.coma gidip arama kutusunu locate edin
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        //arama kutusunun tagName inin input oldugunu test edin
        String expectedTagName="input";
        String actualTagName=aramaKutusu.getTagName();
        if (expectedTagName.equals(actualTagName)){
            System.out.println("TagName testi PASSED");
        }else{
            System.out.println("TagName testi FAILED");
        }

//arama kutusunun name attribitunun degerinin...field keyword..old test edin
        String expectedNameDegerin ="field keywords";
        String actualNameDegerin = aramaKutusu.getAttribute("name");
if (expectedTagName.equals(actualTagName)){
    System.out.println("name attribute testi PASSED");
}else{
    System.out.println("name attribute testi failed");
}
driver.close();
    }
}