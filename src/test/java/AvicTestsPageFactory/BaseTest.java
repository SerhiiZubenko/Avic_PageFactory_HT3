package AvicTestsPageFactory;

import AvicPageFactory.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {

    private WebDriver driver;
    private static final String AVIC_URL = "https://avic.ua/";

    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testSetUp(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(AVIC_URL);
    }

    @AfterMethod
    public  void tearDown(){
        driver.quit();
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    public HomePage getHomePage(){
        return new HomePage(getWebDriver());
    }

    public LoginPage getEnterPage(){
        return new LoginPage(getWebDriver());
    }

    public RegistrationPage getRegistrationPage(){
        return new RegistrationPage(getWebDriver());
    }
    public SearchResultPage getSearchResultPage(){
        return new SearchResultPage(getWebDriver());
    }

    public PayAndDeliveryPage getPayAndDeliveryPage(){
        return new PayAndDeliveryPage(getWebDriver());
    }
}
