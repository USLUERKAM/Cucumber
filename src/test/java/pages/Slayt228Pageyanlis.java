package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Slayt228Pageyanlis {
    public Slayt228Pageyanlis(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//div[@role='rowgroup']//div[6]")
    public List<WebElement> sutun6;
    @FindBy(xpath="//*[text()='Department']")
    public WebElement baslik6;
    @FindBy(xpath="//div[@class='web-tables-wrapper']")
    public WebElement body;
    @FindBy(xpath="(//div[@class='rt-tr-group'])[*]")
    public List<WebElement> satirSayisi;

}
