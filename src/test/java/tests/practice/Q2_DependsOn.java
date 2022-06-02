package tests.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.TestBase;

public class Q2_DependsOn extends TestBase {

       /*
    birbirine bagimli testler olusturun...
    beforClass olusturup setUp ayarlarini yapin..
    birbirine bagimli testler olusturarak;
          ilk once facebook a gidin
          sonra facebook a bagimli olarak google a gidin,
          daha sonra google a bagimli olarak amazon a gidin
<<<<<<< HEAD
          driver i kapatin
       */
       @Test
       public void facebookTest(){
           driver.get("http://www.facebook.com");
       }
=======
    driver i kapatin

 */

    @Test
    public void facebookTest(){
        driver.get("http://www.facebook.com");
    }

>>>>>>> 81bbed5a44becefb9d9b21b6b6e12b7f8b6ec1e7
    @Test(dependsOnMethods="facebookTest")
    public void googleTest(){
        driver.get("http://www.google.com");
    }
<<<<<<< HEAD
=======

>>>>>>> 81bbed5a44becefb9d9b21b6b6e12b7f8b6ec1e7
    @Test(dependsOnMethods="googleTest")
    public void amazonTest(){
        driver.get("http://www.amazon.com");
    }
}
