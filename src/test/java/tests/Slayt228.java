package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Slayt228Page;
import pages.Slayt228Pageyanlis;
import utilities.ConfigReader;
import utilities.Driver;

public class Slayt228 {
Slayt228Page pagem=new Slayt228Page();
//1. Tests packagenin altına class olusturun: CreateHotel
//2. Bir metod olusturun: createHotel
    @Test
    public void test0() {
//3. https://www.hotelmycamp.com adresine git.
        Driver.getDriver().get(ConfigReader.getProperty("Slayt228"));
//4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri girin
   //a. Username : manager
   //b. Password : Manager1!
    pagem.ilkLogin.click();
    pagem.ilkLoginUserNameBox.sendKeys("manager");
    pagem.ilkLoginPasswordBox.sendKeys("Manager1!");
//5. Login butonuna tıklayın.
    pagem.ikinciLogin.click();
//6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
    pagem.hotelManagementButton.click();
    pagem.hotelList.click();
    pagem.addHotel.click();
//7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
    pagem.codeBox.sendKeys("155");
    pagem.nameBox.sendKeys("Caprice Palace");
    pagem.addressBox.sendKeys("didim/aydin   denizin dibi");
    pagem.phoneBox.sendKeys("05303392041");
    pagem.emailBox.sendKeys("uslumusun@hotmail.com");
    Select select=new Select(pagem.idGroupDdm);
    select.selectByIndex(2);

//8. Save butonuna tıklayın.
    pagem.saveButton.click();

//9. “Hotel was inserted successfully” textinin göründüğünü test edin.
    pagem.displayControl.click();
    Assert.assertTrue(pagem.displayControl.isDisplayed());

//10. OK butonuna tıklayın
        pagem.ok.click();

    }
}