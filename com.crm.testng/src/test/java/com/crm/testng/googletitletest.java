package com.crm.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class googletitletest {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("http://google.com");
    }
    @Test
    public void googletitletest(){
       String title = driver.getTitle();
        System.out.println(title);

        Assert.assertEquals(title,"Google","test case failed");
    }
    @Test
    public void googlelogotest(){
       boolean b = driver.findElement(By.id("hplogo")).isDisplayed();

       Assert.assertTrue(b);
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}
