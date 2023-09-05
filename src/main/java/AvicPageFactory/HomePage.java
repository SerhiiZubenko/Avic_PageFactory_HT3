package AvicPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='header-bottom__right-icon']//i[@class='icon icon-user-big']" )
    private WebElement enterButton;

    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@class='button-reset search-btn']")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@class='header-top__right-wrap']//a[contains(@href,'dostavka-tovarov')]")
    private WebElement payAndDeliveryButton;

    @FindBy(xpath = "//div[@class='footer-contact__center']")
    private WebElement listOfTel;

    public String getListOfTel(){
        return listOfTel.getText();
    }

    public void clickOnEnterButton(){
        enterButton.click();
    }

    public void getSearchInput(final String keyWord){
        searchInput.sendKeys(keyWord);
    }

    public void getSearchButton(){
        searchButton.click();
    }

    public void clickPayAndDeliveryButton(){
         payAndDeliveryButton.click();
    }
}
