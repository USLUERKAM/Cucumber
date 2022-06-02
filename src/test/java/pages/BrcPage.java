package pages;
<<<<<<< HEAD

=======
>>>>>>> 81bbed5a44becefb9d9b21b6b6e12b7f8b6ec1e7
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {
    public BrcPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement ilkLoginButonu;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement ikinciLoginButonu;


    @FindBy(id = "dropdown-basic-button")
    public WebElement kullaniciProfilIsmi;

}