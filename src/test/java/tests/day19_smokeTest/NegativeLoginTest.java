package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {
    BrcPage brcPage;
    @Test
    public void yanlisSifre() throws InterruptedException {
        brcPage=new BrcPage();
        // Bir test method olustur positiveLoginTest()
        //		 https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //		login butonuna bas
        Thread.sleep(2000);
        brcPage.ilkLoginButonu.click();
        // test data user email: customer@bluerentalcars.com ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        // test data password : 54321
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
        // login butonuna tiklayin
        brcPage.ikinciLoginButonu.click();
        // Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et

        Assert.assertTrue(brcPage.ikinciLoginButonu.isDisplayed());

        Driver.closeDriver();
    }
    // bu class'da 2 test methodu daha oilusturun
    // biri yanlisKullanici
    // digeri de yanlis sifre ve kullanici adi
    @Test
    public void wrongEmailTest() throws InterruptedException {
        brcPage=new BrcPage();
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //      login butonuna bas
        brcPage.ilkLoginButonu.click();
        //test data user email: customer@bluerentalcars.com ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcWrongEmail"));
        //test data password : 12345
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        //login butonuna tikla

        brcPage.ikinciLoginButonu.click();
        //Degerleri girildiginde sayfaya  sekilde girilemedigini test et
        Assert.assertTrue(brcPage.ilkLoginButonu.isDisplayed());
        Thread.sleep(3000);
        Driver.closeDriver();
    }

    @Test
    public void wrongEmailAndPasswordTest() throws InterruptedException {
        brcPage=new BrcPage();
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //      login butonuna bas
        brcPage.ilkLoginButonu.click();
        //test data user email: customer@bluerentalcars.com ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcWrongEmail"));
        //test data password : 12345
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
        //login butonuna tikla

        brcPage.ikinciLoginButonu.click();
        //Degerleri girildiginde sayfaya  sekilde girilemedigini test et
        Assert.assertTrue(brcPage.ilkLoginButonu.isDisplayed());
        Thread.sleep(3000);
         Driver.closeDriver();
    }
}