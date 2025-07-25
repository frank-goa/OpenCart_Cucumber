package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    // Constructor
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    // Page Elements
    @FindBy(xpath = "//h1[normalize-space()='My Account']")
    WebElement msgHeading;

    @FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Logout']")
    WebElement lnkLogout;


    // Page Actions
    public boolean isMyAccountPageExists() {
        try {
            return (msgHeading.isDisplayed());
        } catch (Exception e) {
            return (false);
        }
    }

    public void clickLogout() {
        lnkLogout.click();
    }

}
