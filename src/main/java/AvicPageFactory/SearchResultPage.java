package AvicPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage {

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//div[@class='prod-cart__top js_ecomm'])[1]")
    private WebElement clickOnItem;

    @FindBy(xpath = "//button[@class='button-reset search-btn']")
    private WebElement clickOnSearchButton;

    @FindBy(xpath = "(//div[@class='prod-cart__top js_ecomm'])[1]")
    private WebElement firstResult;

    @FindBy(xpath = "//a[@class='main-btn main-btn--green main-btn--large']")
    private WebElement clickBuyButton;

    @FindBy(xpath = "//button[@class='fancybox-button fancybox-close-small']")
    private WebElement closeButton;

    @FindBy(xpath = "//div[@class='header-bottom__right-icon']//i[@class='icon icon-cart-new']")
    private WebElement cartButton;

    @FindBy(xpath = "//span[@class='name']")
    private WebElement checkNameProductInCart;

    public String CheckNameProductInCart(){
        return checkNameProductInCart.getText();
    }

    public void clickOnItem(){
        clickOnItem.click();
    }

    public void clickOnSearchButton(){
         clickOnSearchButton.click();
    }

    public WebElement getFirstResult(){
        return firstResult;
    }

    public void clickBuyButton(){
        clickBuyButton.click();
    }

    public WebElement getCloseButton(){
        return closeButton;
    }

    public void clickOnCloseButton(){
         closeButton.click();
    }

    public void clickOnCartButton(){
         cartButton.click();
    }
}
