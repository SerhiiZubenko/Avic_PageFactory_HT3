package AvicPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayAndDeliveryPage extends BasePage{

    public PayAndDeliveryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[contains(text(),'AVIC')]")
    private WebElement listAddress;

    public WebElement waitListAddress(){
        return listAddress;
    }

    @FindBy(xpath = "//h2[contains(text(),'AVIC')]/parent::div")
    private WebElement listOfAddress;

    public String getTextListAddress(){
        return listOfAddress.getText();
    }



}
