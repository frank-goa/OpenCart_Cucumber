package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Elements
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement lnkMyaccount;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement lnkRegister;

    @FindBy(xpath = "//a[normalize-space()='Login']")   // Login link added in step6
    WebElement linkLogin;

    @FindBy(xpath = "//input[@placeholder='Search']")  //For Search Product Test
    WebElement txtSearchbox;

    @FindBy(xpath = "//i[@class='fa-solid fa-magnifying-glass']") //For Search Product Test
    WebElement btnSearch;


    // Action Methods
    public void clickMyAccount() {
        lnkMyaccount.click();
    }

    public void clickRegister() {
        lnkRegister.click();
    }

    public void clickLogin()    // added in step6
    {
        linkLogin.click();
    }

    public void enterProductName(String pName)   //For Search Product Test
    {
        txtSearchbox.sendKeys(pName);
    }

    public void clickSearch()  //For Search Product Test
    {
        btnSearch.click();
    }

}
