package com.next.pageobjects;

import com.next.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SortByPageObject extends DriverFactory {
    @FindBy(css="#dk_container_iSort")
    private WebElement sortBy;
    @FindBy(css=".Price")
    private List<WebElement> priceAmount;
    public void setSortBy(String customerSelectedSort){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Select select=new Select(sortBy);
        select.selectByVisibleText(customerSelectedSort);
    }
    public List<Double> getAllSortedProductPrice(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Double> collectedSort=new ArrayList<>();
        for (WebElement sortByWedelement:priceAmount){
            String sortInString=sortByWedelement.getText();
            System.out.println(collectedSort);
        }return collectedSort;
    }

}
