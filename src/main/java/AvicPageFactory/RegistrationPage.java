package AvicPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@data-validate='phone']")
    private WebElement phoneForm;

    @FindBy(xpath = "//input[@data-validate='email']")
    private WebElement validEmailForm;

    @FindBy(xpath = "//input[@class='validate password show-password']")
    private WebElement validPassword;

    @FindBy(xpath = "//input[@class='validate password_1 show-password']")
    private WebElement checkToPassword;

    @FindBy(xpath = "//button[@class='button-reset main-btn js_validate submit main-btn--green']")
    private WebElement getKeyButton;

    @FindBy(xpath = "(//div[@class='prod-cart__top js_ecomm'])[1]")
    private WebElement clickOnBuyButton;

    @FindBy(xpath = "//a[@class='main-btn main-btn--green main-btn--large']")
    private WebElement clickOnMakeOffer;

    public WebElement getPhoneForm(){
        return phoneForm;
    }
    public WebElement getValidEmailForm(){
        return validEmailForm;
    }
    public WebElement getValidPassword(){
        return validPassword;
    }
    public WebElement getCheckToPassword(){
        return checkToPassword;
    }
    public WebElement getGetKeyButton(){
        return getKeyButton;
    }
    public WebElement getClickOnBuyButton(){
        return clickOnBuyButton;
    }
    public WebElement getClickOnMakeOffer(){
        return clickOnMakeOffer;
    }
}
