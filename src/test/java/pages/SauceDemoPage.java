package pages;

<<<<<<< HEAD
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
=======
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
>>>>>>> 81bbed5a44becefb9d9b21b6b6e12b7f8b6ec1e7
import utilities.Driver;

import java.util.List;

public class SauceDemoPage {
    public SauceDemoPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//input[@id='user-name']")
    public WebElement username;
<<<<<<< HEAD
    @FindBy(xpath ="//input[@id='password']")
    public WebElement password;
    @FindBy(xpath ="//input[@id='login-button']")
    public WebElement loginButton;
    @FindBy(xpath ="//select[@class ='product_sort_container']")
    public WebElement dropDown;
=======

    @FindBy(xpath ="//input[@id='password']")
    public WebElement password;

    @FindBy(xpath ="//input[@id='login-button']")
    public WebElement loginButton;

    @FindBy(xpath ="//select[@class ='product_sort_container']")
    public WebElement dropDown;

>>>>>>> 81bbed5a44becefb9d9b21b6b6e12b7f8b6ec1e7
    @FindBy(className ="inventory_item_price")
    public List<WebElement> urunler;
}
