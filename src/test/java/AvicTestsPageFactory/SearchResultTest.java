package AvicTestsPageFactory;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SearchResultTest extends BaseTest{

    private String SEARCH_KEYWORD ="Смартфон Samsung Galaxy S10 Plus SM-G975 DS 128GB Black (SM-G975FZKD)";

    @Test
    public void checkThatItemIsAddedToCart(){
        getHomePage().getSearchInput(SEARCH_KEYWORD);
        getHomePage().getSearchButton();
        getSearchResultPage().waitForPageLoadComplete(300);
        getSearchResultPage().waitVisibilityOfElement(300, getSearchResultPage().getFirstResult());
        getSearchResultPage().clickOnItem();
        getSearchResultPage().clickBuyButton();
        getSearchResultPage().waitVisibilityOfElement(300, getSearchResultPage().getCloseButton());
        getSearchResultPage().clickOnCloseButton();
        getSearchResultPage().clickOnCartButton();
        assertEquals(getSearchResultPage().CheckNameProductInCart(), SEARCH_KEYWORD);
    }

}
