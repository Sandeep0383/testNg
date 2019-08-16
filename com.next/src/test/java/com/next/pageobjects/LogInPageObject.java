package com.next.pageobjects;

import com.next.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPageObject extends DriverFactory {
    @FindBy(linkText = "myAccount")
    private WebElement Account;

    @FindBy(id = "EmailOrAccountNumber")
    private WebElement username;

    @FindBy(id = "Password")
    private WebElement password;

    @FindBy(id = "SignInNow")
    private WebElement Singup;

    public void singUp(String userName, String passWord) {
        Account.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        username.sendKeys(userName);
        password.sendKeys(passWord);
        Singup.click();
    }
}


