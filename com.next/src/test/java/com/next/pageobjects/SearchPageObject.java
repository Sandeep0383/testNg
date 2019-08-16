package com.next.pageobjects;

import com.next.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageObject extends DriverFactory {
    public static String searchProduct;
    @FindBy(id="sli_search_1")
    private WebElement search;
    @FindBy(css=".SearchButton")
    private WebElement magnifierGlass;
    @FindBy(css="spell-correct" )
    private WebElement pageHeader;
    public void doSearch(String item){
        searchProduct=item;
        search.sendKeys(item);
        magnifierGlass.click();
    }
    //assertion
    public String getHomePageUrl(){
        return driver.getCurrentUrl();

    }
}
