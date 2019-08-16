package com.crm.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("http://google.com");

    }
    @Test(priority = 1,groups = "title")
    public void googletitletest(){
       String title= driver.getTitle();
       System.out.println(title);
    }
    @Test(priority = 2,groups = "logo")
    public void googlelogotest(){
       boolean b= driver.findElement(By.id("hplogo")).isDisplayed();
        System.out.println(b);
    }
    @Test(priority = 3,groups="links")
    public void googlelinktest(){
        boolean d=driver.findElement(By.linkText("Gmail")).isDisplayed();
        System.out.println(d);
    }
    @Test(priority = 4,groups="links")
    public void googlelinktest1(){
        boolean e=driver.findElement(By.id("gbwa")).isDisplayed();
        System.out.println(e);
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }


}
