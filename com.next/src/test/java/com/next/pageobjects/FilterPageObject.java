package com.next.pageobjects;

import com.next.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FilterPageObject extends DriverFactory {
    @FindBy(linkText ="SHOES")
    private WebElement shoes;

    @FindBy(linkText = "Trainers & Pumps")
    private WebElement trainers ;

    public void moveTo(String customerSelectedlink){
        Actions actions=new Actions(driver);
        actions.moveToElement(shoes).build().perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Actions actions1=new Actions(driver);
            actions1.moveToElement(trainers).build().perform();
        }
    }

}
