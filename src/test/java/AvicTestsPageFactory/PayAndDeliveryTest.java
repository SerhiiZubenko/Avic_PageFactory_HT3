package AvicTestsPageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PayAndDeliveryTest extends BaseTest{

    private final String FIRST_ADDRESS ="г. Харьков, м. Университет, ул. Мироносицкая 46;";
    private final String SECOND_ADDRESS ="г. Харьков, м. Площадь Конституции, Павловская площадь, 8.";
    private final String THIRD_ADDRESS ="г. Киев, ул. Пушкинская, 2-4/7, м. Крещатик (красная линия), " +
            "м. Золотые ворота (зеленая линия).";
    private final String FOURTH_ADDRESS ="г. Днепр, пр. Д. Яворницкого, 119.";
    private final String FIFTH_ADDRESS = "г. Одесса, ул. Преображенская, 41.";

    @Test
    public void checkStoreAddresses(){
        getHomePage().clickPayAndDeliveryButton();
        getPayAndDeliveryPage().waitForPageLoadComplete(30);
        getPayAndDeliveryPage().waitVisibilityOfElement(50, getPayAndDeliveryPage().waitListAddress());
        Assert.assertTrue(getPayAndDeliveryPage().getTextListAddress().contains(FIRST_ADDRESS), FIRST_ADDRESS);
        Assert.assertTrue(getPayAndDeliveryPage().getTextListAddress().contains(SECOND_ADDRESS), SECOND_ADDRESS);
        Assert.assertTrue(getPayAndDeliveryPage().getTextListAddress().contains(THIRD_ADDRESS), THIRD_ADDRESS);
        Assert.assertTrue(getPayAndDeliveryPage().getTextListAddress().contains(FOURTH_ADDRESS), FOURTH_ADDRESS);
        Assert.assertTrue(getPayAndDeliveryPage().getTextListAddress().contains(FIFTH_ADDRESS), FIFTH_ADDRESS);

    }
}
