package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.Slayt228Pageyanlis;
import utilities.ConfigReader;
import utilities.Driver;

public class Slayt228yanlis {
    Slayt228Pageyanlis slyt228=new Slayt228Pageyanlis();
@Test
        public void test(){

//    Bir Class olusturun D19_WebtablesHomework
//    1. “https://demoqa.com/webtables” sayfasina gidin
      Driver.getDriver().get(ConfigReader.getProperty("Slayt228"));


//    2. Headers da bulunan department isimlerini yazdirin
    for (WebElement each: slyt228.sutun6) {
        System.out.print(each.getText()+" ");
    }


//    3. sutunun basligini yazdirin
    System.out.println();
    System.out.println(slyt228.baslik6.getText());


//    4. Tablodaki tum datalari yazdirin
    System.out.println(slyt228.body.getText());
//    5. Tabloda kac cell (data) oldugunu yazdirin

//    6. Tablodaki satir sayisini yazdirin
   // System.out.println(slyt228.satirSayisi.size());yanlis oldu


//    7. Tablodaki sutun sayisini yazdirin
//    8. Tablodaki 3.kolonu yazdirin
//    9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
//    10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsi

}}
