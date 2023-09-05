package AvicTestsPageFactory;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RegistrationTest extends BaseTest{

    @Test
    public void checkRegistrationForm(){
        getHomePage().clickOnEnterButton();
        getEnterPage().clickOnBecomeToClient();
        getRegistrationPage().waitVisibilityOfElement(30, getRegistrationPage().getPhoneForm());
        assertTrue(getRegistrationPage().getPhoneForm().isDisplayed());
        assertTrue(getRegistrationPage().getValidEmailForm().isDisplayed());
        assertTrue(getRegistrationPage().getValidPassword().isDisplayed());
        assertTrue(getRegistrationPage().getCheckToPassword().isDisplayed());
        assertTrue(getRegistrationPage().getGetKeyButton().isDisplayed());
    }



}
