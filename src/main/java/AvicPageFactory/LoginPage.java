package AvicPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='btn-offers']")
    private WebElement becomeToClient;

    public void clickOnBecomeToClient(){
        becomeToClient.click();
    }
}
