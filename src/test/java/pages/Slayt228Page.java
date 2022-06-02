package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Slayt228Page {
    public Slayt228Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy(xpath="(//a[@class='nav-link'])[7]")
   public WebElement ilkLogin;


    @FindBy(xpath="//input[@class='form-control required']")
    public WebElement ilkLoginUserNameBox;


    @FindBy(xpath="//input[@class='form-control required password']")
    public WebElement ilkLoginPasswordBox;


    @FindBy(xpath="//input[@id='btnSubmit']")
    public WebElement ikinciLogin;


    @FindBy(xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagementButton;

    @FindBy(xpath="//a[@href='/admin/HotelAdmin']")
    public WebElement hotelList;


    @FindBy(xpath="//span[@class='hidden-480']")
    public WebElement addHotel;

    @FindBy(xpath="//input[@id='Code']")
    public WebElement codeBox;

    @FindBy(xpath="//input[@id='Name']")
    public WebElement nameBox;

    @FindBy(xpath="//input[@id='Address']")
    public WebElement addressBox;

    @FindBy(xpath="//input[@id='Phone']")
    public WebElement phoneBox;

    @FindBy(xpath="//input[@id='Email']")
    public WebElement emailBox;

    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement idGroupDdm;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath="//div[@class='bootbox-body']")
    public WebElement displayControl;

    @FindBy(xpath="//button[@class='btn btn-primary']")
    public WebElement ok;





}
