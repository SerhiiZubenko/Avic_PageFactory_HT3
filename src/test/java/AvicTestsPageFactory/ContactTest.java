package AvicTestsPageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactTest extends BaseTest{

    private String FIRST_NUMBER = "098 907 96 96";
    private String SECOND_NUMBER = "093 248 67 11";
    private String THIRD_NUMBER = "095 291 97 87";

    @Test
    public void checkContactNumbers(){
        getHomePage().waitForPageLoadComplete(30);
        Assert.assertTrue(getHomePage().getListOfTel().contains(FIRST_NUMBER), FIRST_NUMBER);
        Assert.assertTrue(getHomePage().getListOfTel().contains(SECOND_NUMBER), SECOND_NUMBER);
        Assert.assertTrue(getHomePage().getListOfTel().contains(THIRD_NUMBER), THIRD_NUMBER);
    }
}
